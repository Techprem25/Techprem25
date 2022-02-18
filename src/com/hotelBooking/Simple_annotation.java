package com.hotelBooking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_annotation {

	@Test
	private void men() {
		System.out.println("men");
	}

	@BeforeMethod
	private void sigin() {
		System.out.println("signin");
	}

	@AfterMethod
	private void signoff() {
		System.out.println("signoff");
	}

	@Test
	private void women() {
		System.out.println("women");
	}

	@Test
	private void child() {
		System.out.println("child");
	}

}
