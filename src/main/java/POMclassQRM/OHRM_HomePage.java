package POMclassQRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.util.Assert;

public class OHRM_HomePage {

public WebDriver driver;
	
	public  OHRM_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void SuccessFullLogin() {
		
	}
	
}
