package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Emp;

public interface EmpService {
	public Emp addEmp(Emp emp);

	public Emp fetchById(long id);
	
	public boolean deleteById(long id);

	public List<Emp> getAllEmps();
}
