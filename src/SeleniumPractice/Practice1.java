package SeleniumPractice;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver","C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	System.setProperty("webdriver.chrome.silentOutput","true"); // this will disable logs in console
	
	ChromeOptions options = new ChromeOptions(); // "Chrome is being controlled by automated test software" warning bar will not be visible.
	options.setExperimentalOption("useAutomationExtension", false);
	options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
	
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // Refer copy to find difference between them
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    
    driver.get("https://book.spicejet.com/Register.aspx");
    Thread.sleep(3000);
    System.out.println("Tittle is ==>"+driver.getTitle());
    
    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("C:\\Screenshots\\Spicejet.png")); // This will take screenshot
    
    Select select = new Select(driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle")));
    select.selectByVisibleText("MS"); // drop down selection
    
    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys("First Name");
    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys("Last Name");
    
   
    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER")).sendKeys("9814766530");
    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).sendKeys("Qwerty@123");
    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm")).sendKeys("Qwerty@123");
    driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys("ROGERSASSIST@gmail.com");
 
    
    
    
    
    WebElement radio1 = driver.findElement(By.id("chkSpiceClubTnC")); // selecting radio button
    radio1.click();
    File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src1, new File("C:\\Screenshots\\FormFill.png"));
    
    
     
     
    
    
    
    
    
    
    //driver.close();
    //driver.quit(); // close the browser
    
    
}
	
	
	
	
}
