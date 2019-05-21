package com.automationpractice.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.framework.TestBase;

public class LoginPage extends TestBase{
	
	
	 @FindBy(id = "email") private WebElement emailTextboxForLogin;
	  
	 @FindBy(id = "passwd") private WebElement passwordTextboxForLogin;
	 
	 @FindBy(id = "email_create") private WebElement emailTextboxForRegistration;
	 
	 @FindBy(id = "SubmitLogin") private WebElement buttonForLogin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String emailAddress, String password) {
		enterEmailAddressForLogin(emailAddress);
		enterPasswordForLogin(password);
		clickLoginButton();
	}
	
	
	public void enterEmailAddressForLogin(String emailAddress) {
		emailTextboxForLogin.sendKeys(emailAddress);
		
	}
	
	public void enterPasswordForLogin(String password) {
		passwordTextboxForLogin.sendKeys(password);
	}
	
	public void clickLoginButton(){
		buttonForLogin.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
