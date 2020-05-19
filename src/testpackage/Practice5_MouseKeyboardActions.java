package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice5_MouseKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.spicejet.com/");
	    driver.manage().window().maximize();
	    
	    Actions action = new Actions(driver); // Actions class object action is created
	    action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"header-addons\"]/ul/li[10]/a")).click();
	    
	    
		
		
		
		
		
		
		
		

	}

}
