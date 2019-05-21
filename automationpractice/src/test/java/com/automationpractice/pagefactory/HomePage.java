package com.automationpractice.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(id = "search_query_top")
	private WebElement searchTextBox;//driver.findElement(By.id='search-query_top')
	
	@FindBy(name="submit_search")
	private WebElement searchButton;//driver.findElement(By.name='submit_search')
	
	@FindBy(className = "login")
	private WebElement signInButton;//driver.findElement(By.className='login')
	//
	//
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
		
		
		
		WebElement b1=driver.findElement(By.id("stale"));
		String txt=b1.getText();
		System.out.println(txt);
		
		driver.findElement(By.xpath("//aa")).click();
		
		txt=b1.getText();
		System.out.println(txt);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	//
	
	
	public void enterTextInSearchBox(String textToEnter) {
		searchTextBox.sendKeys(textToEnter);
	}
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
	
}
