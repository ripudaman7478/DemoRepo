package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Practice2_Findelements {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
			
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    // get the countWebElementon the page
	    
	   java.util.List<WebElement> linklist = driver.findElements(By.tagName("a"));
	  //  System.out.println(linklist.size());
	    		
	    // get the test of all links of the page
		
		
		for (int i=0 ; i<linklist.size(); i++) {
			String link = linklist.get(i).getText();
			System.out.println(link);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
