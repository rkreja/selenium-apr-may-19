package com.qa.automationpractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverSwitchDemo {
private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void handlingAlertDemo() throws InterruptedException {
	
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.xpath("//button[text()='click to see the date and time']")).click();
		
		
		Thread.sleep(3000);
		
		//switching to alert here
		driver.switchTo().alert().accept();

		
		
	}
	
	

	@Test
	public void handlingIFrameDemo() throws InterruptedException {
	
		driver.get("http://automationpractice.com");
		
		
		
		Actions actions = new Actions(driver);
		WebElement imgThumbnail= driver.findElement(By.xpath("(//img[parent::a[contains(@href,'id_product=3')]])[1]"));
		
		actions.moveToElement(imgThumbnail).build().perform();
		WebElement quickViewBtn=driver.findElement(By.xpath("(//a[following-sibling::div/span[contains(text(),'26.00')]])[2]"));
		System.out.println(quickViewBtn.getText());
		quickViewBtn.click();
		
		//here we are doing driver switch to a frame, as facebook button is in frame
		WebElement frame=driver.findElement(By.xpath("//iframe[contains(@id,'fancybox-frame')]"));
		driver.switchTo().frame(frame);
//		driver.switchTo().frame("fancybox-frame1556592449959");
		
		driver.findElement(By.xpath("//button[child::i[@class='icon-facebook']]")).click();
		driver.switchTo().defaultContent();
	}

	
	
	
	

	@Test
	public void handlingWindowsDemo() throws InterruptedException {
	
		driver.get("http://automationpractice.com");
		
		
		
		Actions actions = new Actions(driver);
		WebElement imgThumbnail= driver.findElement(By.xpath("(//img[parent::a[contains(@href,'id_product=3')]])[1]"));
		
		actions.moveToElement(imgThumbnail).build().perform();
		WebElement quickViewBtn=driver.findElement(By.xpath("(//a[following-sibling::div/span[contains(text(),'26.00')]])[2]"));
		System.out.println(quickViewBtn.getText());
		quickViewBtn.click();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[contains(@id,'fancybox-frame')]"));
		
		driver.switchTo().frame(frame);
		
		//after clicming this button a new window popsup
		driver.findElement(By.xpath("//button[child::i[@class='icon-facebook']]")).click();
		
		//here we are collecting window handles for old and new windows
		ArrayList<String> handles = new ArrayList<>();
		
		Set<String> windowHandles=driver.getWindowHandles();
			
		windowHandles.forEach((k)->{
			handles.add(k);
			System.out.println(k);
		});
		
		
		
		
		//here we are passing new window handle to the driver to switch, in order to enter email address to a textbox which is in a different window
		driver.switchTo().window(handles.get(1));
		
		driver.findElement(By.id("email")).sendKeys("timentraining@gmail.com");
		
		
		
		
	}

}
