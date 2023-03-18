package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import BasePackage.AllBrowserMethods;
import BasePackage.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hrmHooksClass {
	
	private AllBrowserMethods browsermethods;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	
	@Before(order=0) 
	public void getProperty() {
		configreader=new ConfigReader();
		prop = configreader.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		browsermethods=new AllBrowserMethods();
		driver=browsermethods.init_driver(browserName);
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void screenshotmethod(Scenario scenario) {
		//take screenshot
		if(scenario.isFailed()) {
			String screenshotName=scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}
