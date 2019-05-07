package com.automationpractice.purchase;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class PurchaseTests extends TestBase{
	
	@Test
	public void purchaseTestOne() {

		ui.openURL("http://www.automationpractice.com");
		ui.sendKeysById("search_query_top", "Summer Dress");
		ui.clickById("dsds");
	}
	

}
