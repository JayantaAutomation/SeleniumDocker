package com.qa.selenium.docker;

/*
 * Author: Jayanta Kumar Panda
 */
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerFirefox {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {

		FirefoxOptions firfoxOptions = new FirefoxOptions();
		
		WebDriver driver = new RemoteWebDriver(new URI("http://localhost:4444/").toURL(), firfoxOptions);
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
