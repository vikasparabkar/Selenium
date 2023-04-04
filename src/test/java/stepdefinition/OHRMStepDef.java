package stepdefinition;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePackage.AllBrowserMethods;
import POMclassQRM.GoogleWebElementsAndMethods;
import POMclassQRM.OHRM_LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OHRMStepDef {
	public WebDriver driver;
	private OHRM_LoginPage HRM=new OHRM_LoginPage(AllBrowserMethods.getDriver());

@Given("user should nevigate to url {string}")
public void user_should_nevigate_to_url(String url) {
	AllBrowserMethods.getDriver().get(url);
}

@When("User should enter the valid email and password")
public void user_should_enter_the_valid_email_and_password() {
    HRM.username();
    HRM.password();
}

@When("user should click on the login")
public void user_should_click_on_the_login() {
HRM.Login();

}

@Then("user should successfully login")
public void user_should_successfully_login() {
	String actual=HRM.gettitleMethod();
	System.out.println(actual);
	String expected="OrangeHRM";
	Assert.assertEquals(actual, expected);
	
   
}}
