package com.automationpractice.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase {
	
	public WebDriver driver;
	public UI ui;
	
	
	@Parameters({"browser"})
	@BeforeMethod
	public void launchWebDriver(@Optional("chrome") String browser) {
		
		
		switch ( browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "lib\\drivers\\geckodriver-windows-64bit.exe");
			driver = new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "lib\\drivers\\internetexplorerdriver-windows-32bit.exe");
			driver = new InternetExplorerDriver();
			break;
		
		default:
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		
//		System.setProperty("webdriver.edge.driver", "lib\\msedgedriver.exe");
//		
		
//		driver = new EdgeDriver();
//		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		
		driver.manage().window().setPosition(new Point(2900, 0));
		
//		int x=driver.manage().window().getPosition().getX();
//		int y=driver.manage().window().getPosition().getY();
		
		
		this.ui=new UI(driver);
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
	
	

}
