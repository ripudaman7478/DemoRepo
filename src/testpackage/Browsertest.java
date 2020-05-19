package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertest {

public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ensqa3.rogers.com/ENS/notificationsViewer.action"); 	//navigate to give URL
		driver.manage().window().maximize();	
		
	}

}
