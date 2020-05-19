package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2_Locators {

		public static void main(String[] args) {
			   System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       
		     
		       
		driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        
        //1. Xpath Locator: Hierarchy based Xpath (html/body/div ...) should not be used. Relative xpath should be used just like below example
         /* 
        driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Tom");
        
        driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("Harry");*/
        
        // 2. ID locator
        
        /*driver.findElement(By.id("u_0_n")).sendKeys("Tom"); // copy the id of the field when you inspect
        driver.findElement(By.id("u_0_p")).sendKeys("Peter");*/
         
        // 3. Name locator
        // driver.findElement(By.name("firstname")).sendKeys("Tom"); // copy the name of the field
        
        //
        
        // 4. By LinkText: Sometime position of link changes on webpage, therefore Xpath will not be right way to take
        // as it shows path as per page alignment. therefore use linktext
        // driver.findElement(By.linkText("Cookies Policy")).click();
        
        // 5. By PartialLinktext: (Not Useful) just provide partial text of link , ( not full )
        // driver.findElement(By.partialLinkText("Cookies")).click();
        
        
        // 6. By CSS selector : select the field and copy the css selector or you can use #id
        
       driver.findElement(By.cssSelector("#u_0_s")).sendKeys("First Name");
        
        // 7. By class 
          //driver.findElement(By.className("_58mu")).click();   
        
        // 8. 
      
        
        
        
        
        
        
        
        
        
	}

}
