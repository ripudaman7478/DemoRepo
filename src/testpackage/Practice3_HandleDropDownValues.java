package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Practice3_HandleDropDownValues {

	public static void main(String[] args) {
		

			   System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       
		     
		       
		driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        Select select = new Select(driver.findElement(By.id("month")));
        select.selectByVisibleText("Oct");
	
	}
}
