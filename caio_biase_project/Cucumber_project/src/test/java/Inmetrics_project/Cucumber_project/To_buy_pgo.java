package Inmetrics_project.Cucumber_project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class To_buy_pgo {
	
	private WebDriver driver;
	 
	 public To_buy_pgo(WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 public To_buy_pgo() {
		
	 }
	
	 public void to_go_website( String url) {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	 }
	 

	 
	 public List_dates purchase(String name, String key_name, String value, String key_value, String email, String key_email) {
		 
		 driver.findElement(By.xpath(name)).sendKeys(key_name);
		 driver.findElement(By.xpath(value)).sendKeys(key_value);
		 driver.findElement(By.xpath(email)).sendKeys(key_email);
		 
		 
		 return new List_dates(driver);
		
	 }

	public void choose_product(WebElement findElement) {
		// TODO Auto-generated method stub
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement product = findElement;
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", product);
	}

	public void buy_product_now(WebElement findElement) {
		// TODO Auto-generated method stub
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement product = findElement;
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", product);
	}
	
	public void submit_purchase(WebElement findElement) {
		// TODO Auto-generated method stub
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement product = findElement;
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", product);
	}
	

	
	
	}