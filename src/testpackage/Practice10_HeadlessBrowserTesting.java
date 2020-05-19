package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice10_HeadlessBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    
		ChromeOptions options = new ChromeOptions(); // These 3 lines will not launch chrome and initiate testing
	    options.addArguments("window-size = 1400,800");
	    options.addArguments("headless");
	    
		
		
		
		
		WebDriver driver = new ChromeDriver(); 
		 
	    driver.get("https://fido-global.monday.com/users/sign_in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    System.out.println("Before Login Title is ==>"+ driver.getTitle());
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("user_email")).sendKeys("rogersassist3@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.id("user_password")).sendKeys("Qwerty@123");
	    driver.findElement(By.xpath("//*[@id=\"form-inner-wrapper\"]/div/div[4]/button")).click();
	    Thread.sleep(5000);
	    System.out.println("After Login Title is ==>"+ driver.getTitle());

	}

}
