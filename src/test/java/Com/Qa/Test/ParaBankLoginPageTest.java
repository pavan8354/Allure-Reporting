package Com.Qa.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Com.qa.pages.ParaBankLoginPageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBankLoginPageTest {
	
	private static WebDriver driver = null;

	
	@Test(priority = 1)
	public static void ParaBankappTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=4DAEBB9F2BD5C9D03A5EB2365E06216B?ConnType=JDBC");
		
	}
	
	@Test(priority = 2)
	public static void EnterParaBankUNCredentials() {
		
		ParaBankLoginPageClass parabank = new ParaBankLoginPageClass(driver);
		
		parabank.ParaBankUsernamevalidation("pavanggowda28@gmail.com");
		
		System.out.println("The UN Details Entered Successfully");
	}
	
	@Test(priority = 3)
	public static void EnterParaBankPWDCredentials() {
		
		ParaBankLoginPageClass parabank = new ParaBankLoginPageClass(driver);
		
		parabank.ParaBankPasswordvalidation("@Bail123");
		
		System.out.println("The PWD Details Entered Successfully");
		
		parabank.loginbutton();
		
		System.out.println("Clicked on login button successfully");
	}
	
	@Test(priority = 4)
	public static void teardown() {
		
		driver.close();
		driver.quit();
		
	}
	

}
