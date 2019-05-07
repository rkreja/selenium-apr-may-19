package com.automationpractice.registration;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class RegistrationTests extends TestBase{
	
	
	@Test
	public void register_a_new_user() {
		
		try {
			ui.openURL("http://automationpractice.com/index.php?");
			ui.clickByClassName("login");
			ui.sendKeysById("email_create", "abc9988@mailinator.com");
			ui.clickById("SubmitCreate");
			ui.sendKeysById("customer_firstname", "Ahmed");
			ui.sendKeysById("customer_lastname", "Mamun");
			ui.sendKeysById("passwd", "Abc1234");
			ui.sendKeysById("address1", "909 noway ave");
			ui.sendKeysById("city", "New York");
			
			ui.selectByIdAndVisibleText("id_state", "New York");
			ui.sendKeysById("postcode", "10001");
			ui.sendKeysById("phone", "2052051144");
			ui.sendKeysById("phone_mobile", "2052051144");
			ui.clickById("submitAccount");
			//
			
		} finally {
			//gotoprofile
			//delete account
		}
		
	}
	
	
	@Test
	public void reg1() {
	System.out.println("reg1 test case");	
	}
	
	@Test(groups = {"smokeTest"})
	public void reg2() {
		System.out.println("reg2 test case");	
		}
	
	@Test
	public void reg3() {
		System.out.println("reg3 test case");	
		}
	
	@Test
	public void reg4() {
		System.out.println("reg4 test case");	
		}
	
	

}
