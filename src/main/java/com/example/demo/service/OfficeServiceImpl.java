package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service(value = "office")
public class OfficeServiceImpl implements HomeService {
	@Override
	public String add() {
		return "Office Service Impl...";
	}
}
