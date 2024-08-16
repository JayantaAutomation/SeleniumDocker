package com.qa.seleniumgrid.docker;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;


public class CrossbrowserTestedge extends BaseTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException, URISyntaxException {
		driver = initializeBrowser("edge");
	}

	@Test
	public void testOne() {
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle()+" from edge node");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
