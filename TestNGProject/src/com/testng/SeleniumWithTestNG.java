package com.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumWithTestNG {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void launcBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	
  @Test
  public void f() throws Exception {
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("promtButton")).click();//

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Dotstudents");

		alert.accept();
		
		Thread.sleep(5000);
  }
  
  @AfterClass
  public void closeBrowser() {
	  
	  driver.quit();
  }
  
  
}
