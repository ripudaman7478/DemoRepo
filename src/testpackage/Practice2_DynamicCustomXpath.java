package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice2_DynamicCustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
			
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box']")).sendKeys("Test");;
        //driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Test");    
        //driver.findElement(By.xpath("//input[contains(@class,'inputtext login_form_input_box')]")).sendKeys("Test");
/* some times we have dynamic ids which changes after refresh of webpage
 * to deal with them we can use dynamic xpath
        id= test_123
        id= test_456 
        id= 123_test   */
        
      //  driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test");
        //driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test"); // id = test_123
        //driver.findElement(By.xpath("//input[ends-with(@id,'_test_t")).sendKeys("test"); // id=123_test_t
        
       // dynamic x path for links
        // all the links are represented by <a> tag
	    
	    
        driver.findElement(By.xpath("//a[contains(text(),'Forgot account')]")).click();
        
}
}
