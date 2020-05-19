package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGlogin {
	WebDriver driver;
	
  @Test
  public void login() {
	  driver.findElement(By.linkText("SIGN IN")).click();
	  
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rogers.com/home"); 	//navigate to give URL
		//driver.manage().window().maximize();
  }

  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
