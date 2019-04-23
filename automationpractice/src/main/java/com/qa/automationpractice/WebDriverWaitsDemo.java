package com.qa.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sun.security.util.PropertyExpander.ExpandException;

public class WebDriverWaitsDemo {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
	
	
	
	@Test
	public void waitDemoOne() throws InterruptedException {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		
//		Thread.sleep(40000);
		
		String btnMsg=driver.findElement(By.xpath("//button[contains(text(),'Now I am present after')]")).getText();
		
		System.out.println(btnMsg);
		
		
		
	}
	
	
	
	@Test
	public void waitDemoTwo() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		WebElement quoteElement=driver.findElement(By.id("explicitWaitTextPresentDemo"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(quoteElement, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”"));
		
		String quote=driver.findElement(By.id("explicitWaitTextPresentDemo")).getText();
		System.out.println(quote);
		
		
		
	}


}
