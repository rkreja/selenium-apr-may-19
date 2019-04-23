package com.qa.automationpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	
	@Test
	public void test1() {
	System.out.println("this is test 1");	
	}
	
	
	@AfterMethod
	public void test2() {
		System.out.println("this is test 2");	
	}
		
	@Test
	public void test3() {
		System.out.println("this is test 3");	
		}
	
	@Test
	public void test4() {
		System.out.println("this is test 4");	
		}
		
	@Test
	public void test5() {
		System.out.println("this is test 5");	
		}
		
		
	
	
}
