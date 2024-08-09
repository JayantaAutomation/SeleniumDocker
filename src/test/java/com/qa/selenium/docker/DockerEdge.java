package com.qa.selenium.docker;

/*
 * Author: Jayanta Kumar Panda
 */
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerEdge {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {

		EdgeOptions edgeOptions = new EdgeOptions();
		
		WebDriver driver = new RemoteWebDriver(new URI("http://localhost:4444/").toURL(), edgeOptions);
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
