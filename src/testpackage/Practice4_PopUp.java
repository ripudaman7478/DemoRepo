package testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4_PopUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	       
	     
	       
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.manage().window().maximize();
    driver.findElement(By.name("proceed")).click();
    
    Thread.sleep(5000);
    
    Alert alert = driver.switchTo().alert(); // any name can be given instead of alert
    System.out.println(alert.getText()); // prints the text of the pop up window
    String text = alert.getText();
    
    if(text.equals("Please enter a valid user name")) { // Validating the Pop window Text
    System.out.println("Correct Text");
    }
    else {
    System.out.println("In-Correct");
    }
    	    
    alert.accept(); // click on the ok button  of the pop up
   // alert.dismiss(); Click on the cancel button of the pop up 
    
      
	}

}
