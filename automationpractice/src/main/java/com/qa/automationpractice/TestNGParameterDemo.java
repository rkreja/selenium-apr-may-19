package com.qa.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {
	
private ChromeDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void closeDriver() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
	
	
	
	@Parameters({"userid","password"})
	@Test
	public void login(String userid, String password) {

		driver.get("http://www.automationpractice.com");
		// sign in click
		WebElement sign_in_button = driver.findElementByClassName("login");
		sign_in_button.click();
		// enter email address
		WebElement email_address_textbox = driver.findElementById("email");
		email_address_textbox.sendKeys(userid);
		// enter password
		WebElement password_textbox = driver.findElementById("passwd");
		password_textbox.sendKeys(password);

		WebElement login_button = driver.findElementById("SubmitLogin");
		login_button.click();

	}
	
	
	@Parameters({"myNum"})
	@Test
	public void differentDataTypeFromParameter(@Optional("10") int i) {
		System.out.println(i);
	}
	
	

}
