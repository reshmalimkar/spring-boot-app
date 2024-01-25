package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.profile.ProfileChecker;
import com.example.demo.service.HomeService;

@RestController
@RequestMapping(value = "v1")
public class HomeController {
	@Qualifier(value = "office")
	@Autowired
	private HomeService service;
	
	
	@Autowired
	ProfileChecker profileChecker;
	
    //localhost:9393/v1/ping
	@GetMapping(value = "/ping")
	public String ping() {
		profileChecker.checkActiveProfiles();
		return service.add();
	}
}
