package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6_Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    
	    driver.get("https://Google.com");
	    
	    // navigate from one url to other
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        // forward and back simulation
        
        Thread.sleep(8000);
        
        driver.navigate().forward();
        
        Thread.sleep(8000);
        
        driver.navigate().back();  
         
        driver.navigate().refresh(); // refresh the page
        
	}

}
