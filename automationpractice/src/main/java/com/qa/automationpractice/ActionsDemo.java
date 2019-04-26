package com.qa.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsDemo {
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
	public void clickByAction() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions = new Actions(driver);
		WebElement h1=driver.findElement(By.xpath("//h1[text()='Welcome to TnT']"));
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		actions.click(h1).build().perform();
		
		
	}
	@Test
	public void mouseOverByAction() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions = new Actions(driver);
//		WebElement red_button=driver.findElement(By.xpath("//li[contains(@onmouseover,'Red means danger')]"));
		WebElement green_button=driver.findElement(By.xpath("//li[contains(@onmouseover,'Green for Go')]"));
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		actions.moveToElement(green_button).build().perform();
		
		
	}
	@Test
	public void dragAndDropByAction() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Actions actions = new Actions(driver);
		
		WebElement source=driver.findElement(By.id("drag"));
		WebElement target = driver.findElement(By.id("drop"));
		
		actions.dragAndDrop(source, target).build().perform();

		
		
	}
	
	@Test
	public void keyPressByAction() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
}
