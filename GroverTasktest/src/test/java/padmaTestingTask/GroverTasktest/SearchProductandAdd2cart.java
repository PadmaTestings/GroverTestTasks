package padmaTestingTask.GroverTasktest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;


// this class used do the test task which extends the base class

public class SearchProductandAdd2cart extends BaseTest {
	
	
	// login Grover web page 
	@BeforeMethod

	public void LoginTest() throws Exception

	{

  // used to record screen
	 MyScreenRecorder.startRecording("LoginTest");
// navigating to  Grover page
	 driver.get("https://www.grover.com/us-en"); //URL in the browser 
	 //maximising the page
	driver.manage().window().maximize();
	// printing the web page title
	System.out.println(driver.getTitle());


	}
	
	//Search required item ,verify appropriate page and add product to cart 
	@Test
	public void Test() throws Exception

	{

		// Searching required Item in searchbar
		WebElement searchItem=  driver.findElement(By.xpath("//*[@id=\"groverApp\"]/div/section/section/div/div[1]/div[2]/div[3]/div/form/input"));
		
		// entering the required item in search bar
		searchItem.sendKeys("Apple iPhone 12 - 64GB - Dual SIM");
		
		// clicking on the required item
		searchItem.sendKeys(Keys.ENTER);
		
		// asserting or verifying the required page is shown
		Assert.assertTrue(driver.getTitle().equals("Search results | Rent tech with Grover"));
		Thread.sleep(5000);
		
		//clicking on required item
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[3]/div/div[1]/div[1]/a/div[3]/div[1]/div")).click();
		Thread.sleep(9000);
	
	// adding required Item to the cart
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/section[1]/div[2]/div[1]/div[4]/button")).click();
		Thread.sleep(3000);
		
		//stopping the recording
		 MyScreenRecorder.stopRecording();
	}
	

}
