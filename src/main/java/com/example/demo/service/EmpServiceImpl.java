package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Emp;
import com.example.demo.util.Utility;

@Service
public class EmpServiceImpl implements EmpService {

	// read Values from properties file
	@Value("${data.pincode}")
	private long pincode;

	@Autowired
	private Utility utility;

	long count = 0;
	static List<Emp> ls = null;
	static {
		ls = new ArrayList<Emp>();
	}

	@Override
	public Emp addEmp(Emp emp) {
		count++;
		emp.setId(count);
		emp.setPincode(pincode);
		emp.setMobileNo(utility.randomTenDigitNumber());
		ls.add(emp);
		return emp;
	}

	@Override
	public Emp fetchById(long id) {
		for (Emp e : ls) {
			if (e.getId() == id) {
				return e;
			}
		}

		return null;
	}

	@Override
	public boolean deleteById(long id) {
		for (Emp e : ls) {
			if (e.getId() == id) {
				return ls.remove(e);
			}
		}
		return false;
	}

	@Override
	public List<Emp> getAllEmps() {
		return ls;
	}

}
