package com.qa.automationpractice.utildemo;

import com.rkreja.Util;

public class UtilDemo {

	public static void main(String[] args) {
		
		Util util = new Util();
		
		System.out.println(util.generate_random_alphanumeric_string(12));
		System.out.println(util.getTodaysDate());
		System.out.println(util.getPastDate(2));
		System.out.println(util.getFutureDate(3));
		System.out.println(util.isNumeric("A2565"));
		System.out.println(util.removeparenthesesWhiteSpaceAndDash(" sdsdsd  dsd"));
		

	}

}
