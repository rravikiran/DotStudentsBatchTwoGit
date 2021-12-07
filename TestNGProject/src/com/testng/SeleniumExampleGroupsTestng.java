package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumExampleGroupsTestng {
	
	WebDriver driver;

	@BeforeClass
	public void firstExecution() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
	}

	@Test(priority =2)
	public void executionMethod() throws Exception {

		Thread.sleep(5000);

		Select se = new Select(driver.findElement(By.id("dropdown")));

		// se.selectByValue("2");

		se.selectByVisibleText("Option 1");
	}
	
	@Test (priority =1)
	public void executionMethodOne() throws Exception {

		Thread.sleep(5000);

		Select se = new Select(driver.findElement(By.id("dropdown")));

		// se.selectByValue("2");

		se.selectByVisibleText("Option 2");
		Thread.sleep(5000);
	}
	
	

	@AfterClass
	public void browserClose() {
		driver.quit();
	}


}
