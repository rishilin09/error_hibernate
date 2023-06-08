package com.spitSpring.HiberanateHQL.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.spitSpring.HiberanateHQL.hibernate.entity.Employee;
import com.spitSpring.HiberanateHQL.service.HibernateService;

@RestController
@RequestMapping(value = "/")
public class HibernateController {

	private HibernateService hibServ;

	public HibernateController(HibernateService hibServ) {
		super();
		this.hibServ = hibServ;
	}
	
	@GetMapping(value = "/fetch")
	public Object fetchAllEmployees() {
		List<Employee> employees = hibServ.getAllEmployees();
		if(employees != null) {
			return employees;
		} else {
			return "Cannot fetch the data!!!";
		}
	}

	@PostMapping(value = "/save")
	public String saveEmployee(@RequestBody Employee emp) {
		if(hibServ.insertEmployee(emp)){
			return "Data successfully stored!!";
		} else {
			return "Error in uploading the data";
		}
	}
}
