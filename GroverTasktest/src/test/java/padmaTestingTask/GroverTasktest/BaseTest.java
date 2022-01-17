package padmaTestingTask.GroverTasktest;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


// class created to add the basic utilities like Chrome setup which required for the application to run on chrome browser


public class BaseTest {

	WebDriver driver;

	@BeforeClass

	public void config()

	{

	// chrome browser setup
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");

		 driver =new ChromeDriver();
	
	}

	//closing the browser
	@AfterClass
	public void tearDown() {
	
		driver.close();
	}
	}
