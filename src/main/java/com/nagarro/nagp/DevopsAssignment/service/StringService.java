package com.nagarro.nagp.DevopsAssignment.service;

import org.springframework.stereotype.Component;

@Component
public class StringService {

	private static final String SAMPLE_STRING = "DevOps Assignment";

	public String getString() {
		return SAMPLE_STRING.toUpperCase();
	}
}
