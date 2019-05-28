package com.automationpractice.framework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@Listeners(com.automationpractice.framework.TestBase.class)
public class TestBase implements WebDriverEventListener, ITestListener{
	
	public WebDriver webdriver;
	public EventFiringWebDriver  driver;
	public UI ui;
	private static ExtentReports extentReports = new ExtentReports();
	private static ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("automationreport.html");
	private static ExtentTest step;
	
	@BeforeSuite
	public void beforeSuite() {
		extentReports.attachReporter(extentHtmlReporter);
	}
	@AfterSuite
	public void afterSuite() {
		extentReports.flush();
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void launchWebDriver(@Optional("chrome") String browser) {
		
		switch ( browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
			webdriver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "lib\\drivers\\geckodriver-windows-64bit.exe");
			webdriver = new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "lib\\drivers\\internetexplorerdriver-windows-32bit.exe");
			webdriver = new InternetExplorerDriver();
			break;
		
		default:
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
			webdriver = new ChromeDriver();
			break;
		}
		
		driver = new EventFiringWebDriver(webdriver);
		driver.register(new TestBase());
		
		
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

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
//		System.err.println("driver is attempting to navigate: "+url );
		step.info("driver is attempting to navigate: "+url );
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
//		System.err.println("driver navigated to: "+url );
		step.info("driver navigated to: "+url); 
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
//		System.err.println("driver is trying to find an element by : "+ by.toString());
		step.info("driver is trying to find an element by : "+ by.toString());
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		if(element!=null)
//		System.err.println("driver found an element by "+ by.toString());
			step.info("driver found an element by "+ by.toString());
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		if(element!=null) {
			if(element.getText()!=null || (!element.getText().isEmpty())) {
//				System.err.println("driver clicked on "+element.getText() );
				step.info("driver clicked on "+element.getText());
			}else {
//				System.err.println("driver clicked on "+ element.getTagName() );
				step.info("driver clicked on "+ element.getTagName() );
			}
		}
		
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filename="error_"+ System.currentTimeMillis();
		try {
			FileUtils.copyFile(screenshot, new File("screenshots\\"+filename+".png"));
			step.addScreenCaptureFromPath("screenshots\\"+filename+".png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestStart(ITestResult result) {
//		System.err.println(result.getName());
		
		step=extentReports.createTest(result.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		step.pass("test passed successfully");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		step.fail("test failed. Reason:\n"+result.getThrowable().getMessage());
		
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
