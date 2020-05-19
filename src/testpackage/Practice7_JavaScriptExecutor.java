package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice7_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		 
		driver.get("https://fido-global.monday.com/users/sign_in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("user_email")).sendKeys("rogersassist3@gmail.com");
	    driver.findElement(By.id("user_password")).sendKeys("Qwerty@123");
	    //driver.findElement(By.xpath("//*[@id=\"form-inner-wrapper\"]/div/div[4]/button")).click();
	    
	    
	    

	}

}
