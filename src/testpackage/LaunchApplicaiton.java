package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplicaiton {
public static void main(String[] args) {
	
		
			System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe"); 
			WebDriver driver =new ChromeDriver();
			driver.get("https://qa03-ciam.rogers.com/");
			//driver.findElement(By.id())
	}
	}
