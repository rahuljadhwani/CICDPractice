

//  ****************  Author: Rahul Jadhwani ******************//
package stepdefs;


import java.io.File;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import utilities.DriverProvider;
import utilities.ScreenshotProvider;

public class OrangeHRMTest {
	WebDriver driver;
	LoginPage ObjLoginPage;
	DriverProvider objDriverProvider;
	ScreenshotProvider objSc;
	
	
	public OrangeHRMTest() {
		System.out.println("In constructor");
		objSc = new ScreenshotProvider();
		objDriverProvider = new DriverProvider();
		driver = DriverProvider.getDriverInstance();
		System.out.println("Got driver instance as "+driver.hashCode());
		ObjLoginPage = new LoginPage(driver);
	}
	
	
	
	
	@Given("^User navigates to OrangeHRM website$")
	public void user_navigates_to_OrangeHRM_website() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	   
	}
	
	@When("^user logins with admin \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logins_with_admin_and(String username, String password) {
		System.out.println(username+"  "+password);
	   String loginStatus = ObjLoginPage.doOrangeHRMLogin(username, password);
	   if(loginStatus.equalsIgnoreCase("clicked")) {
		   
	   }
	   else {
		   System.out.println("Something went wrong with clicking submit login");
		   System.out.println("Push1  - - - tbd");
	   }
	}
	
	@Then("^user navigates to dashboard page$")
	public void user_navigates_to_dashboard_page()  {
		
		try {
	   String message1 = driver.findElement(By.xpath("//a[text()='Welcome Admin']")).getAttribute("innerHTML");
			   System.out.println(message1);
		}
		catch(Exception e) {
			System.out.println("Invalid Credentials");
			objSc.takeScreenshot();
		}
	}
	
	


}
