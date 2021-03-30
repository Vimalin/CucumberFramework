package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Steps {
	
	WebDriver driver;
	
	//Constructor
	public HomePage_Steps (Common_Steps common_steps)  {
		this.driver = common_steps.getDriver();
	}
	
	
	@Given("I am on Google Search Home Page")
	public void i_am_on_google_search_home_page() {
		driver.get("https://www.google.com/");
	}

	@When("I input {string} in Search bar")
	public void i_input_cucumber_in_search_bar(String search) {
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(search);
	}

	@When("click Google Search")
	public void click_google_search() throws Exception {
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
		Thread.sleep(5000);
	}

	@Then("Google will return results")
	public void google_will_return_results() {
		String expectedResults = "About";
		String actualResults = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
		actualResults = actualResults.substring(0, 5);
		if (!expectedResults.equals(actualResults)) {
			System.out.println("Expected result: " + expectedResults);
			System.out.println("Actual result: " + actualResults);
			fail("Page not returning results");
		}

	}

	
}
