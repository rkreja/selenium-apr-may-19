package com.qa.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
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
		
		
		WebElement welcome_msg=driver.findElementByClassName("info-account");
		String msg=welcome_msg.getText();
		
		System.out.println(msg);
		
		
		
	}

}
