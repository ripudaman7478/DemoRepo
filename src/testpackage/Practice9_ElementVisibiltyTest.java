package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice9_ElementVisibiltyTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		 
		driver.get("http://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    // 1. isDisplayedMethod - applicable for all elements to check visibility of elements
	    
	    boolean b1= driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).isDisplayed(); // verify that create a page link is there on facebook page or not
	    System.out.println(b1);
	    
	    // 2.  isEnabledMethod - to check if button in enable or disabled
	    //You can check mark the button and see if button gets enable or not
	    boolean b2= driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).isEnabled(); // it will verify if button is enable or not True= enabled , False if not enabled
	    System.out.println(b2);
	    
	    // 3. isSelectedMethod -
	     driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
	     boolean b3 = driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).isSelected();
	     System.out.println(b3); // true
	     
	     boolean b4 = driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[2]/label")).isSelected();
	     System.out.println(b4);// false
	     
	    
	    
	    driver.close();
	}

}
