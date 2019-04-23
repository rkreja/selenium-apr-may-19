package com.qa.automationpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.com");
		
		driver.findElementByXPath("//a[@title='Women']").click();
		
		
		

	}

}
