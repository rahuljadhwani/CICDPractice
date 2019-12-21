package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DriverProvider {
	
	private static WebDriver driver;
	
	@Before
	public void setup(Scenario sc) {
		String scName = sc.getName();
		if(scName.contains("chrome")) {
		System.out.println("In before");
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Jars\\chromedriver.exe");
		System.out.println("after set property");
		this.driver = new ChromeDriver();
		System.out.println("driver is set "+driver.hashCode());
		}
		
		else if(scName.contains("firefox")) {
			System.out.println("Firefox is not available");
		}
		
	}
	
	
	
	
	  @After public void closure() { System.out.println("In after");
	  driver.close(); }
	 
	
	
	public static WebDriver getDriverInstance() {
		System.out.println("checking when it returns driver... to be deleted later"+driver.hashCode());
		return driver;
	}


}
