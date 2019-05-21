package com.automationpractice.pagefactory;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class PageFactroryDemo  extends TestBase{
	
	
	
	
	@Test
	public void searchTest() {
		
		ui.openURL("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.enterTextInSearchBox("Summer");
		homePage.clickOnSearchButton();
		homePage.clickSignInButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("abc3232@bac.net", "343434");
		/*
		 * loginPage.enterEmailAddressForLogin("abc3232@bac.net");
		 * loginPage.enterPasswordForLogin("343434"); loginPage.clickLoginButton();
		 */
		
		
	}
	

}
