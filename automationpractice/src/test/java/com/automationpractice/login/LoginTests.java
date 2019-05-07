package com.automationpractice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class LoginTests extends TestBase{

	
	@Test
	public void login_001_login_with_valid_userid() {
		

		driver.get("http://www.automationpractice.com");

	}
	@Test
	public void login_002_login_with_valid_userid_but_invalid_password() {
			driver.get("http://www.automationpractice.com");
	}

	@Test
	public void login_003_login_with_valid_userid_and_password() {

		driver.get("http://www.automationpractice.com");
		// sign in click
		WebElement sign_in_button = driver.findElement(By.className("login"));
		sign_in_button.click();
		// enter email address
		WebElement email_address_textbox = driver.findElement(By.id("email"));
		email_address_textbox.sendKeys("abc213@mailinator.com");
		// enter password
		WebElement password_textbox = driver.findElement(By.id("passwd"));
		password_textbox.sendKeys("abc1234");

		WebElement login_button = driver.findElement(By.id("SubmitLogin"));
		login_button.click();

//		Verify 'MY ACCOUNT' text displayed
		String m = driver.findElement(By.xpath("//h1[text()='My account']")).getText();
		System.out.println("**************" + m + "**************");
		Assert.assertEquals(m, "MY ACCOUNT");

//		Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
//		Verify 'My personal information' text displayed

	}

}
