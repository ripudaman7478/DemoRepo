package TestNG_Package;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GoogleTest_testNG {

	
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
	    driver.get("https://book.spicejet.com/Register.aspx");
	   
	   
	    
	}
	
	@Test(priority=1,groups="Tittle")
	public void launch() throws InterruptedException, IOException {
		String title = driver.getTitle();
	    System.out.println("Title is" + title);	 
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Screenshots\\Tittle.png")); 
	}
	
	/* @Test(priority=2,groups="SignUpForm")
	public void signupform() throws IOException {
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys("firstname");
	File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src1, new File("C:\\Screenshots\\FirstName.png")); 
    
	}
	
	@Test(priority=5,groups="SignUpForm")
	public void signupform1() throws IOException {
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys("Last Name");		
	File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src2, new File("C:\\Screenshots\\LasttName.png"));
	}
	
	@Test(priority=6,groups="Link")
	public void link() {
	boolean b = driver.findElement(By.linkText("Terms and Conditions")).isDisplayed();
	System.out.println(b);
	}
	
	@Test(priority=3,groups="Link")
	public void link1() {
	boolean b1 = driver.findElement(By.linkText("Airports")).isDisplayed();
	System.out.println(b1);
	}
	

	@Test(priority=4,groups="Link")
	public void link2() {
	boolean b2 = driver.findElement(By.linkText("Fleet")).isDisplayed();
	System.out.println(b2);
	} */
	
	@Test(dependsOnMethods="launch")
	public void link3() {
	boolean b2 = driver.findElement(By.linkText("Fleet")).isDisplayed();
	System.out.println(b2);
	}
		
		
	@AfterMethod  // these are post conditions
	public void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
