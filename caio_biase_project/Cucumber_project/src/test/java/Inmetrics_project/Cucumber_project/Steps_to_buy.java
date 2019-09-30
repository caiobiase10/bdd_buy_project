package Inmetrics_project.Cucumber_project;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_to_buy  {

	WebDriver driver;
	
	@Given("^I have a product list$")
	public void go_to_homepage_webcomerce(){	
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();;
		//To_buy_pgo to_buy_pgo = new To_buy_pgo(driver);
		//to_buy_pgo.to_go_website("https://demo.cs-cart.com");
		driver.get("https://demo.cs-cart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@When("^I click on the chosen product$")
	public void user_choose_a_product() {
	   
		To_buy_pgo to_buy = new To_buy_pgo(driver);
		to_buy.choose_product(driver.findElement(By.xpath("//*[@id='icons_240005']/div[1]/div/div[1]/div/a/img")));
	}
	
	@And("^I click to buy now with one-click$")
	public void user_clicks_on_to_buy_one_click_now() {
		
		To_buy_pgo to_buy = new To_buy_pgo(driver);
		to_buy.buy_product_now(driver.findElement(By.xpath("//*[@id=\'opener_call_request_5\']/span")));
		
	}
	
	@Then("^I type \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_name_numberphone_and_email(String name, String value, String email) {
		
		To_buy_pgo obj = new To_buy_pgo(driver);
		List_dates project = obj.purchase("//*[@id='call_data_call_request_5_name']",
		name, "//*[@id='call_data_call_request_5_phone']",
		value, "//*[@id='call_data_call_request_5_email']",
		email);
		
		assertTrue(project.isValida());
	}
	
	
	@And("^I click to submit$")
	public void user_clicks_on_submit() {
	    
		To_buy_pgo to_buy = new To_buy_pgo(driver);
		to_buy.buy_product_now(driver.findElement(By.xpath("//*[@id='form_call_request_5']/div[8]/button")));
		
	}
	
	@Then("^Close the Browser$")
	public void close_the_Browser(){
	    
		driver.close();
	}
	
}

