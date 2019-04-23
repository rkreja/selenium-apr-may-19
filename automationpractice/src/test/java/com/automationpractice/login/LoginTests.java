package com.automationpractice.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

	
	
	@Test
	public void login_with_valid_userid_and_password() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.com");
		//sign in click
		WebElement sign_in_button=driver.findElementByClassName("login");
		sign_in_button.click();
		//enter email address
		WebElement email_address_textbox=driver.findElementById("email");
		email_address_textbox.sendKeys("abc213@mailinator.com");
		//enter password
		WebElement password_textbox=driver.findElementById("passwd");
		password_textbox.sendKeys("abc1234");
		
		WebElement login_button=driver.findElementById("SubmitLogin");
		login_button.click();
		
		
		
//		Verify 'MY ACCOUNT' text displayed
		String myAccount=driver.findElementByXPath("//h1[text()='My account']").getText();
		Assert.assertEquals(myAccount, "MY ACCOUNT");
		
//		Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
//		Verify 'My personal information' text displayed
		
		
		
	}
	
	
	
	
}
