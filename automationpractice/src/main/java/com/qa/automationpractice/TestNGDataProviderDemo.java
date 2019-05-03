package com.qa.automationpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderDemo {
	
	
	@Test(dataProvider = "userIdAndPwdSupplier")
	public void loginTest(String u, String p, int code, boolean status) {
		

		System.out.println("login with userid "+ u);
		System.out.println("login with pwd "+ p);
		System.out.println("login with zipcode "+ code);
		if(status==true) {
			System.out.println("user "+u+" is active");	
		}else {
			System.out.println("user "+u+" is inactive");
		}
		
		
		
	}
	@DataProvider
	public Object[][] userIdAndPwdSupplier() {
		
		Object[][] data = {
				{"rkreja","abc1234",20545, true},
				{"alif","xys766",36598,false}
		};
		
		return data;
		
	}
	
	
	@Test(dataProvider = "simDS")
	public void login2(int cityCode) {
		System.out.println("purchasing tickets for following citi code: "+ cityCode);
	}
	
	
	@Test(dataProvider = "dataSupplier")
	public void login(String city1, String city2, String city3) {
		System.out.println("purchasing tickets for following cities: "+ city1 +" "+ city2+" "+city3 );
	}
	
	
	@DataProvider
	public String[][] dataSupplier() {
		String[][] data = {
				
				{"atlanta","new york","jersey city"},
				{"london","manchester","cambridge"},
				{"dhaka","sylhet","chittagong"},
				{"deli","pune","mumbai"},
				{"deli","pune","mumbai"}
		}; 
		return data;
	}
	
	
	@DataProvider
	public Integer[][] simDS() {
		Integer[][] data = {
				
				{100},
				{250},
				{30},
				{478},
				{554}
		}; 
		return data;
	}
	

}
