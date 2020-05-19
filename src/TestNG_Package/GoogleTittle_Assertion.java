package TestNG_Package;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTittle_Assertion {
WebDriver driver;
	
	@BeforeMethod // these are preconditons
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true"); // this will disable logs in console
		
		ChromeOptions options = new ChromeOptions(); // "Chrome is being controlled by automated test software" warning bar will not be visible.
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://google.com");
	   
	   
	    
	}
	
	@Test
	public void launch() {
	    String title = driver.getTitle();
	    System.out.println("Title is--->" + title);	 
	   
	   Assert.assertEquals(title, "Google","title does not macth"); // this will match
	    //Assert.assertEquals(title, "Google1","title does not macth"); // this will not match
	}
	
	
	@AfterMethod  // these are post conditions
	public void teardown() {
		driver.close(); }
	}
	
	
	
	
	
	
	
	
	
	
	

