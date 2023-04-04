package stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    System.out.println("user is on registration page");
	    
//	    WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Vikas\\Chrome.exe\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/droppable/");
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	    List<List<String>>userData=dataTable.asLists(String.class);
	    
	    	for(List<String> e: userData) {
	    		System.out.println(e.get(0));
	    	}
	}
	
	@When("user enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		List<Map<String, String>> userMap= dataTable.asMaps(String.class, String.class);
		
		System.out.println(userMap);
	}
	
	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	    System.out.println("user registration should be successful");
	}
	
}
