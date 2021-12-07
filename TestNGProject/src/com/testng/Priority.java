package com.testng;

import org.testng.annotations.Test;

public class Priority {

	@Test(groups= {"smoke"})
	public void c() {
		System.out.println("This is c method");
	}

	@Test(priority = 1,groups= {"smoke","Regression"})
	public void s() {
		System.out.println("This is s method");
	}

	@Test(priority = 3,groups= {"Regression"})
	public void d() {
		System.out.println("This is d method");
	}

	@Test(priority = 2,groups= {"Sanity"})
	public void b() {
		System.out.println("This is b  method");
	}
	
	
	
	
	
	
	
	@Test(groups={"smoke","Regression"})
	public void login() {
		System.out.println("This is login");
	}
	
	
	@Test(groups= {"Regression"})
	public void imageCheck() {
		System.out.println("This is image check");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
