package testpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4_HandleDifferentFrames {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
		    WebDriver driver = new ChromeDriver(); 
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//dynamic wait
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://fido-global.monday.com/users/sign_in");
			driver.findElement(By.name("user[email]")).sendKeys("rogersassist3@gmail.com");
	        driver.findElement(By.name("user[password]")).sendKeys("Qwerty@123");
			driver.findElement(By.xpath("//*[@id=\"form-inner-wrapper\"]/div/div[4]/button/span[1]")).click();
			Thread.sleep(3000);
			
			driver.switchTo().frame(""); // put frame name This will switch the control from webpage to frame
		
			driver.findElement(By.name("SignIn")).click();
			
	}

}
