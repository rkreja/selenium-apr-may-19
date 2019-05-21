package com.qa.automationpractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class FileUploadDemo extends TestBase{
	
	
	
	
	@Test
	public void fileUploadByWebDriver() {
		
		ui.openURL("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.id("demoFileUpload")).sendKeys("F:\\Time And Training\\Demo Folder\\test upload.txt");
		
	}
	
	
	@Test
	public void fileUploadByAutoIT() throws IOException {
		ui.openURL("https://timeandtraining.net/seleniumdemo/selenium.html");
		ui.clickById("demoFileUpload");
		System.out.println(System.getProperty("user.dir"));
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\lib\\autoit\\fileUploadDemo.exe");
		
	}

}
