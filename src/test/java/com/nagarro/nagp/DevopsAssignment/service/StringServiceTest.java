package com.nagarro.nagp.DevopsAssignment.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringServiceTest {

	private StringService stringService;

	@Before
	public void setUp() {
		stringService = new StringService();
	}

	@Test
	public void testGetString() {
		final String expectedString = "DEVOPS ASSIGNMENT";

		final String actualString = stringService.getString();

		Assert.assertEquals(expectedString, actualString);
	}
}
