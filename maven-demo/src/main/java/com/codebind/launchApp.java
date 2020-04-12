package com.codebind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\manas\\Desktop\\WD\\jar\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://rediffmail.com");
		  driver.manage().window().maximize();

	}

}
