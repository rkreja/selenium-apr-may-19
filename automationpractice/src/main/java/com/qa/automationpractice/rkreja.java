package com.qa.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rkreja {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/rkreja/Desktop/selenium.html");
		WebElement e=driver.findElement(By.name("btnh1"));		
		System.out.println(e.getText());
		System.out.println(e.getText());


	}

}
