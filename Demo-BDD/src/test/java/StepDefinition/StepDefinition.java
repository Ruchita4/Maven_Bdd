package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	
	WebDriver driver;
    String title;
	@Given("^Login application should be available$")
	public void login_application_should_be_available() {
		driver = new FirefoxDriver();
		  driver.get("http://opensource-demo.orangehrmlive.com");
	    
	}

	@When("^Validate login application$")
	public void validate_login_application() {
	   
		title=driver.getTitle();
	    System.out.println(title);
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful()  {
	    
		Assert.assertEquals("OrangeHRM", title);
	}
}
