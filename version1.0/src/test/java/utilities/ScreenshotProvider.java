package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotProvider {
	WebDriver driver  = DriverProvider.getDriverInstance();
	
	public void takeScreenshot() {
	
	TakesScreenshot ts  = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	try {
		org.openqa.selenium.io.FileHandler.copy(temp, new File("C:\\Users\\rahul\\eclipse-workspaceNew\\version1.0\\new3.png"));
	} catch (IOException e1) {
		
		System.out.println("Unable to capture screenshot");
	}
	}
	
}

