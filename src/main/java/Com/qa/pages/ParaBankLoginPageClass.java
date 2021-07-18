package Com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ParaBankLoginPageClass {
	
	WebDriver driver = null;
	By EnterValidUserName = By.xpath("//input[@type='text']");
	By EnterValidPassword = By.xpath("//input[@type='password']");
	By ClickLoginButton = By.xpath("//input[@type='password']");
	
	
	public ParaBankLoginPageClass(WebDriver driver) {
		
		this.driver = driver;
		
			}
	
	public void ParaBankUsernamevalidation(String text) {
		
		driver.findElement(EnterValidUserName).sendKeys(text);
	}
	
	
public void ParaBankPasswordvalidation(String text) {
		
		driver.findElement(EnterValidPassword).sendKeys(text);
	}

public void loginbutton() {
	
	driver.findElement(ClickLoginButton).sendKeys(Keys.ENTER);
}
	
	
	
}
