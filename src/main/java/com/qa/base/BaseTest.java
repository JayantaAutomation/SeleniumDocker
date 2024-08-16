package com.qa.base;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
/*
 * 
 * Author: Jayanta Kumar Panda
 * 
 */


public class BaseTest {

	public static WebDriver driver;
	
	public WebDriver initializeBrowser(String browserName) throws MalformedURLException, URISyntaxException {

		DesiredCapabilities cap = new DesiredCapabilities();

		if (browserName.equals("chrome")) {
			cap.setBrowserName("chrome");

		} else if (browserName.equals("firefox")) {
			cap.setBrowserName("firefox");

		} else if (browserName.equals("edge")) {
			cap.setBrowserName("MicrosoftEdge");
		}

		driver = new RemoteWebDriver(new URI("http://localhost:4444/").toURL(), cap);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;



	}

}
