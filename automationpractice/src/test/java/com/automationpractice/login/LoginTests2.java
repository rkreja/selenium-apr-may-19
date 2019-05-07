package com.automationpractice.login;

import org.testng.annotations.Test;

public class LoginTests2 {
	
	@Test
	public void login1() {
	System.out.println("login1 test case");	
	}
	
	@Test(groups = {"functional"})
	public void login2() {
		System.out.println("login2 test case");	
	}
	
	@Test(groups = {"smokeTest","regression"})
	public void login3() {
		System.out.println("login3 test case");	
	}
	
	@Test(groups = {"smokeTest"})
	public void login4() {
		System.out.println("login4 test case");	
	}
	
}
