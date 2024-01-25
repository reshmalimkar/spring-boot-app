package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Emp;
import com.example.demo.service.EmpService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "v3")
@Api(value = "Emp Management System", description = "Operations pertaining to emp management")
public class SwaggerEmpController {

	@Autowired
	private EmpService service;

	@PostMapping(value = "/add")
	@ApiOperation(value = "Create a new Emp", response = Emp.class)
	public Emp addEmp(@RequestBody Emp emp) {
		Emp addEmp = service.addEmp(emp);
		return addEmp;
	}

	@ApiOperation(value = "Get Emp by ID", response = Emp.class)
	@GetMapping(value = "/fetch/{id}")
	public Emp addEmp(@PathVariable(name = "id") long id) {
		Emp addEmp = service.fetchById(id);
		if (addEmp == null) {
			throw new UserNotFoundException("User Not Found : " + id);
		}
		return addEmp;
	}

	// deleteById
	@ApiOperation(value = "Delete a Emp", response = Emp.class)
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable(name = "id") long id) {
		boolean status = service.deleteById(id);
		if (!status) {
			throw new UserNotFoundException("User Not Found : " + id);
		}
		return "Employee Deleted Successfully...";
	}

	@GetMapping(value = "/allEmps")
	@ApiOperation(value = "View a list of all emps", response = String.class)
	public List<Emp> getAllEmps() {
		List<Emp> emps = service.getAllEmps();
		return emps;
	}

}
