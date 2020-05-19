package testpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice5_DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.141.59/Chrome Driver/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame(0); // if there is no frame then exclude this line
	    
	    Actions action = new Actions(driver);
	    action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"))) //clicking and holding the drop box
	    .moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))) // moving the element to target location
	    .release().build().perform(); // releasing the drag box to target location
	    
	    
	    

	}

}
