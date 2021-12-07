package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DifferentAnnotations2 {

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Test
	public void f() {

		System.out.println("Test Method");
	}
	
	@Test
	public void ff() {

		System.out.println("Test two Method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeSuite
	public void beforeSuite() {

		System.out.println("BeforeSuite");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
