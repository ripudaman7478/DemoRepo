package testpackage;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Practice6_ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.get("https://amazon.com");
        clickOn()
	}

	private static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new Webdriverwait(driver , timeout).ignoring(StaleElementReferenceException.class).untill(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
