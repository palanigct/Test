package stepDeff;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Driver;

public class stepDefinition extends Driver{	
	
	@Given("^I navigate to the browser homepage$")
	public void i_navigate_to_the_browser_homepage() throws Throwable {
	   System.out.println("homepage chrome");
	   startBrowser();  
	   
	}

	@Then("^I enter google search link$")
	public void i_enter_google_search_link() throws Throwable {
		 System.out.println("search link");
		 driver.get("https://www.google.com");
	}

	@Then("^I should see the google search box$")
	public void i_should_see_the_google_search_box() throws Throwable {
		 System.out.println("search box");
		 Thread.sleep(10000);
		 //step.checkElement();
	}

	@When("^I enter \"([^\"]*)\" in search box$")
	public void i_enter_in_search_box(String value) throws Throwable {
		 System.out.println("enter search box");
		 driver.findElement(By.xpath("//*[@id='q' or @name='q']")).click();
			driver.findElement(By.xpath("//*[@id='q' or @name='q']")).sendKeys(value);
			driver.findElement(By.xpath("//*[@id='q' or @name='q']")).sendKeys(Keys.RETURN);
	}

	@Then("^I should see the search results$")
	public void i_should_see_the_search_results() throws Throwable {
		 System.out.println("results");
		 Thread.sleep(10000);
		 closeBrowser();
	}

}
