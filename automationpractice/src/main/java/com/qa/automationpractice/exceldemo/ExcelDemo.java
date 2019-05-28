package com.qa.automationpractice.exceldemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rkreja.Excel;
import com.rkreja.Util;

public class ExcelDemo {

	public static void main(String[] args) {
		
		
		Excel excel = new Excel("F:\\Time And Training\\Demo Folder\\testdata.xlsx", "Sheet1");
		
/*		System.out.println(excel.columnCount());
		System.out.println(excel.rowCount());
		
		System.out.println(excel.getCellValue(286, 5));
		
		System.out.println(excel.checkValueContainsInCell(286, 5, "Rockland"));
		
		List<String> colValues=excel.getAllColumnValueByRow(1);
		for(int i=0;i<colValues.size();i++) {
			System.out.println(colValues.get(i));
		}
		*/

		/*
		 * int total_row=excel.rowCount();
		 * 
		 * for(int i=1;i<=total_row;i++) { System.out.println(excel.getCellValue(i, 5));
		 * }
		 */
		/*
		 * int i=ThreadLocalRandom.current().nextInt(1, excel.rowCount());
		 * System.out.println(excel.getCellValue(i, 2)); System.out.println("Zipcode: "+
		 * excel.getCellValue(i, 1));
		 */
		
		
		
	}
	
	@DataProvider(name = "data")
	public Object[][] getData(){
		Excel excel = new Excel("F:\\Time And Training\\Demo Folder\\testdata.xlsx", "Sheet1");
		return excel.getRowValuesForDataProvider();
	}
	
	@Test(dataProvider = "data")
	public void test_using_data_provider_and_excel(String zipcode, String city, String state, String stateCode, String county, String lat, String lon) {
		System.out.println(zipcode +"\t"+ city +"\t"+ state +"\t"+ stateCode +"\t"+ county +"\t"+ lat +"\t"+ lon );
	}

}
