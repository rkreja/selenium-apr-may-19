package com.automationpractice.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UI {
	
	private static final int LOCAOTR_ID=0;
	private static final int LOCAOTR_NAME=1;
	private static final int LOCAOTR_CLASS=2;
	private static final int LOCAOTR_CSS=3;
	private static final int LOCAOTR_XPATH=4;
	
	private WebDriver driver;
	

	public UI (WebDriver driver) {
		this.driver=driver;
	}
	
	
	//NAVIGATION
	//get
	public void openURL(String url) {
		driver.get(url);
	}
	
	//FINDELEMENT
	private WebElement findElement(int locator, String locatorString) {
		WebElement elementThatFound;
		switch (locator) {
		case LOCAOTR_ID:
			elementThatFound=driver.findElement(By.id(locatorString));
			//did I really find? If yes I can report here
			break;
		case LOCAOTR_CLASS:
			elementThatFound=driver.findElement(By.className(locatorString));
			break;
		case LOCAOTR_NAME:
			elementThatFound=driver.findElement(By.name(locatorString));
			break;
		case LOCAOTR_CSS:
			elementThatFound=driver.findElement(By.cssSelector(locatorString));
			break;
		case LOCAOTR_XPATH:
			elementThatFound=driver.findElement(By.xpath(locatorString));
			break;
		default:
			throw new RuntimeException("You have select invalid locator");
		}
		return elementThatFound;
	}
	
	
	
	//CLICKS
	
	//click by id
	public void clickById(String id) {
//		driver.findElement(By.id(id)).click();
		findElement(LOCAOTR_ID, id).click();
	}
	
	//click by class name
	public void clickByClassName(String className) {
//		driver.findElement(By.className(className)).click();
		findElement(LOCAOTR_CLASS, className).click();
	}
	//click by xpath
	public void clickByXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	//
	//
	//
	
	
	//SENDKEYS
	//sendkeys by id
	public void sendKeysById(String id, String text) {
		driver.findElement(By.id(id)).sendKeys(text);
	}
	//sendkeys by class name
	public void sendKeysByClass(String className, String text) {
		driver.findElement(By.className(className)).sendKeys(text);
	}
	//sendkeys by xpath
	public void sendKeysByXpath(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	//
	//
	//

	
	//GETTEXT
	//gettext by id
	//gettext by class name
	//gettext by xpath
	//
	//
	//
	
	
	
	//SELECT
	//selectByIDandVisibileText
	public void selectByIdAndVisibleText(String id,String textToSelect) {
		Select select = new Select(findElement(LOCAOTR_ID, id));
		select.selectByVisibleText(textToSelect);
	}
	
	
}
