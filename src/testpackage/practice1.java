package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class practice1 {



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
       // driver.manage().deleteAllCookies();
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Google")){
        System.out.println("Title is correct");
        }
        else {
        System.out.println("title is not correct");
        }
        
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource()); // to get page source 
        driver.quit(); // to close browser
        }
        
        		
	}


