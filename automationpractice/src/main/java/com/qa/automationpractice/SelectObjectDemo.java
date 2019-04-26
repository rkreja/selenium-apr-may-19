package com.qa.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectObjectDemo {
	private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
	
//	@AfterMethod
//	public void closeDriver() {
//		driver.close();
//	}
	
	
	
	@Test
	public void selectOptionFromDropdown() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebElement element = driver.findElement(By.xpath("(//select[@name='DemoDropDown'])[1]"));
		Select dropdown_language = new Select(element);
		//dropdown_language.selectByVisibleText("Java");
		dropdown_language.selectByValue("3");
		
		
	}
	

}
