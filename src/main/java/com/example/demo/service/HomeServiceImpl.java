package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Emp;

@Service
public class HomeServiceImpl implements HomeService {
	@Override
	public String add() {
		return "Home Service Impl...";
	}
}
