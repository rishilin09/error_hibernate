package com.spitSpring.HiberanateHQL.hibernate.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
@Access(AccessType.FIELD)
public class Employee {
	
	public Employee() {}
	
	public Employee(String empId, String empName, long empSalary, String empDept, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
		this.empAddress = empAddress;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long emp_id;
	
	public Long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}

	@Column(name = "empId")
	private String empId;
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Column(name = "empName")
	private String empName;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Column(name = "empSalary")
	private long empSalary;
	
	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	
	@Column(name = "empDept")
	private String empDept;
	
	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	@Column(name = "empAddress")
	private String empAddress;
	
	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + emp_id + ", empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", empDept=" + empDept + ", empAddress=" + empAddress + "]";
	}
}
