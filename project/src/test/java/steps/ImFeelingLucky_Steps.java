package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImFeelingLucky_Steps	 {
	
	WebDriver driver;
	
	//Constructor
	public ImFeelingLucky_Steps (Common_Steps common_steps)  {
		this.driver = common_steps.getDriver();
	}
	
	@Given("I am on Google home search page")
	public void i_am_on_google_home_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
	}

	@When("I enter Java in the search bar")
	public void i_enter_java_in_the_search_bar() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Java");
	}
	
	@When("I click Im Feeling Lucky")
	public void i_click_im_feeling_lucky() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[2]")).click();
	}
	
	@Then("I should be directed straight to the Java.com website")
	public void i_should_be_directed_straight_to_the_java_com_website() {
	    // Write code here that turns the phrase above into concrete actions
		String expUrl = "https://www.java.com/en/";
		String actUrl =  driver.getCurrentUrl();
		if (!expUrl.equals(actUrl)) {
			fail("this page does not exist");
		}
	}
	
	@When("I click on Privacy")
	public void i_click_on_privacy() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/div[3]/a[1]")).click();
	}
	
	@Then("I should be directed to the Privacy page")
	public void i_should_be_directed_to_the_privacy_page() {
	    // Write code here that turns the phrase above into concrete actions
		String expUrl = "https://policies.google.com/privacy?hl=en-ZA&fg=1";
		String actUrl =  driver.getCurrentUrl();
		if (!expUrl.equals(actUrl)) {
			fail("this page does not exist");
		}
	}
}