package com.nagarro.nagp.DevopsAssignment.service;

import org.springframework.stereotype.Component;

@Component
public class StringService {

	private static final String SAMPLE_STRING = "Hello There!";

	public String getString() {
		return SAMPLE_STRING;
	}
}
