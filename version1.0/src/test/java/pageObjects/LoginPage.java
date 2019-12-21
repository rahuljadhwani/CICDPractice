package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement usernameTextbox;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement passwordTextbox;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String doOrangeHRMLogin(String username, String password) {
		System.out.println(username+"  "+password);
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		loginButton.click();
		
		return "clicked";
	}
	
	
}
