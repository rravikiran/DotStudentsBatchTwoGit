package com.testng;

import org.testng.annotations.Test;

public class TestNG {
  @Test(groups= {"TestMethod"})
  public void f() {
	  
	  System.out.println("This is test");
  }
  
  @Test(groups= {"Test"})
  public void ff() {
	  
	  System.out.println("This is second test");
  }
}
