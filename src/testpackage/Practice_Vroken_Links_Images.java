package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Vroken_Links_Images {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		 
		driver.get("http://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
		
	// get all the links in the page
		
		
		

	}

}
