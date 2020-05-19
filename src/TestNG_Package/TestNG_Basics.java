package TestNG_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {

	@BeforeSuite // First
	public void setup( ) {
		System.out.println("BeforeSuite --->  Setup system property for chrome");
		
	}
	
	@BeforeTest // Second
	public void browserlaunch() {
		System.out.println(" BeforeTest ---> Launch the browser");
		
	}
	
	@BeforeClass // Third 
	public void loginmethod() {
		System.out.println("BeforeClass --> Login in User Account");
	}	
		
	@BeforeMethod // Fourth
	public void enterurl() {
		System.out.println("BeforeMethod --> enter URL");
		
	}
	
	
	
	
	
	
	
	
	//Test Case starting with @Test
	@Test // Fifth - This is one test case
	public void googletittletext( ) {
		System.out.println("TestCase 1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Test Case 2");
	}
	
	@Test
	public void testcase3() {
		System.out.println("Test Case 3");
	}
	
	
	
	/*The sequence of the test case execution will be
	 * @BeforeMethod
	 * @Test- 1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test- 2
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test - 3
	 * @AfterMethod
	 * 
	 * and so on
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	// Post Condition ---> Start with @After
	
	
	@AfterMethod // Sixth
	public void logout() {
		System.out.println("AfterMethod  --> Logout from app");
	}
	
	@AfterClass // Seventh
	public void closebrowser ( ) {
		System.out.println("AfterClass--> Close Browser");
	}
		
	@AfterTest // eight
	public void deleteallcookies( ) {
		System.out.println("AfterTest --> delete all cookies");
	}
			
		
	@AfterSuite // nineth
	public void generatetestreport( ) {
		System.out.println("AfterSuite---> Generate Test report");
		
	}
		
		

}