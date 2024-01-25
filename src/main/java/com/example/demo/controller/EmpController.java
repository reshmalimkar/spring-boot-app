package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Emp;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping(value = "v2")

public class EmpController {

	@Autowired
	private EmpService service;

	@PostMapping(value = "/add")
	public Emp addEmp(@RequestBody Emp emp) {
		Emp addEmp = service.addEmp(emp);
		return addEmp;
	}

	// localhost:9393/v2/fetch/1

	@GetMapping(value = "/fetch/{id}")
	public Emp addEmp(@PathVariable(name = "id") long id) {
		Emp addEmp = service.fetchById(id);
		if (addEmp == null) {
			throw new UserNotFoundException("User Not Found Exception : " + id);
		}
		return addEmp;
	}

	// deleteById
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable(name = "id") long id) {
		boolean status = service.deleteById(id);
		if (!status) {
			throw new UserNotFoundException("User Not Found Exception : " + id);
		}
		return "Employee Deleted Successfully...";
	}

	
	//localhost:9393/v2/fetchByIdUsingRequestParam?id=1
	@GetMapping(value = "/fetchByIdUsingRequestParam")
	public Emp fetchDataById(@RequestParam(name = "id") long id) {
		Emp addEmp = service.fetchById(id);
		if (addEmp == null) {
			throw new UserNotFoundException("User Not Found : " + id);
		}
		return addEmp;
	}

}
