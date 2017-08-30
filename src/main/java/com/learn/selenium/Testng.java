package com.learn.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Testng {
	
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.google.com");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","./webdriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("ALlLpass");
	}

}
