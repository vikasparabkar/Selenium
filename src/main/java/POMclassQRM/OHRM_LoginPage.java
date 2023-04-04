package POMclassQRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRM_LoginPage {
public WebDriver driver;
	
	public  OHRM_LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	public void  username() {
		username.sendKeys("Admin");
	}
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	public void  password() {
		password.sendKeys("Admin");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	
	public void  Login() {
		login.click();
	}
	
	public String gettitleMethod() {
		return driver.getTitle();
	}
}
