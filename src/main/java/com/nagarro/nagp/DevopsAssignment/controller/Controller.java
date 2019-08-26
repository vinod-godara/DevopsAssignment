package com.nagarro.nagp.DevopsAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.DevopsAssignment.service.StringService;

@RestController
public class Controller {

	private String A;
	
	@Autowired
	private StringService stringService;

	@GetMapping("/home")
	public String home() {
		return stringService.getString();
	}
}
