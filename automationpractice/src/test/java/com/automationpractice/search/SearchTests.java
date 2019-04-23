package com.automationpractice.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTests {
	
	
	public static void main(String[] args) throws InterruptedException  {
		Search_003_Product_image_view();
	}

	
	public static void Search_003_Product_image_view() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		//Go to http://automationpractice.com/index.php?id_product=7&controller=product
		driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
		//Verify there are 4 thumbnail on the page
		List<WebElement> all_img_tags=driver.findElementsByXPath("//img[contains(@id,'thumb_')]");
		System.out.println(all_img_tags.size());
		
		
		
			
		
		//click on the first thumbnail
		//verify popup displayed to slideshow
		//Click next button and verify image changes, do the same for four images
		
		
		for(int i=0;i<all_img_tags.size();i++) {
			//click on thumbnail
			WebElement e=all_img_tags.get(i);
			e.click();
			//verify popup
			//close popup
			driver.findElementByXPath("//a[@title='Close']").click();
			Thread.sleep(2000);
		}
		
		
		
		//close the popup
		
		
		
	}
	
	

}
