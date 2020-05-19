package testpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class testng1 {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	 String driverPath = "C:\\Users\\ripudaman.wahla\\geckodriver-v0.26.0-win64\\geckodriver.exe";
	    public WebDriver driver ; 
	     @AfterTest                            //Jumbled
	      public void terminateBrowser(){
	          driver.close();
	      }
	     @BeforeTest                            //Jumbled
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          System.setProperty("webdriver.gecko.driver", driverPath);
	          driver = new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	      @Test                                //Jumbled
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      
	}

