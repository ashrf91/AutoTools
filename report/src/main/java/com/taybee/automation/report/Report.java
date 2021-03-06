package com.taybee.automation.report;

import org.junit.Assert;

public class Report {

	public static void report(String message, Status status){
		report(message, status, false);
	}

	public static void report(String message, Status status, boolean negative){
		if (negative) {
			if (status.equals(Status.FAIL))
				status = Status.PASS;
			else
				status = Status.FAIL;
		}

		if (status.equals(Status.FAIL)) {
			Assert.fail("Test failed: " + message);
		} else if (status.equals(Status.PASS)) {
			Assert.assertTrue(message, true);
		} else {

		}
	}
}