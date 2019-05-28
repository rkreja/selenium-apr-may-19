package com.qa.automationpractice.webtabledemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class WebTableDemo extends TestBase {
	
	
	
	@Test
	public void webtable() {
		
		ui.openURL("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebElement webtable=driver.findElement(By.id("tnt-student-table"));
		List<WebElement> rows=webtable.findElements(By.xpath(".//tbody/tr"));
		List<WebElement> cols=webtable.findElements(By.xpath(".//tbody/tr[2]/*"));
		System.out.println(cols.size());
		
		for(int i=0;i<cols.size();i++) {
			System.err.println(cols.get(i).getText());
		}
		
	}

}
