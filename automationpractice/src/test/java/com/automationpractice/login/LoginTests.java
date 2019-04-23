package com.automationpractice.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {
	private ChromeDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
	
	@Test
	public void login_001_login_with_valid_userid() {
		

		driver.get("http://www.automationpractice.com");
		//
		//
		//
	}
	@Test
	public void login_002_login_with_valid_userid_but_invalid_password() {
			driver.get("http://www.automationpractice.com");
	}

	@Test
	public void login_003_login_with_valid_userid_and_password() {

		driver.get("http://www.automationpractice.com");
		// sign in click
		WebElement sign_in_button = driver.findElementByClassName("login");
		sign_in_button.click();
		// enter email address
		WebElement email_address_textbox = driver.findElementById("email");
		email_address_textbox.sendKeys("abc213@mailinator.com");
		// enter password
		WebElement password_textbox = driver.findElementById("passwd");
		password_textbox.sendKeys("abc1234");

		WebElement login_button = driver.findElementById("SubmitLogin");
		login_button.click();

//		Verify 'MY ACCOUNT' text displayed
		String m = driver.findElementByXPath("//h1[text()='My account']").getText();
		System.out.println("**************" + m + "**************");
		Assert.assertEquals(m, "MY ACCOUNT");

//		Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
//		Verify 'My personal information' text displayed

	}

}
