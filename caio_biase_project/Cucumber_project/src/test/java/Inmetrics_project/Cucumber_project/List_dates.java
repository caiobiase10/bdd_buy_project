package Inmetrics_project.Cucumber_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class List_dates {
	
	 private WebDriver driver;
	 
	 public List_dates(WebDriver driver) {
	   this.driver = driver;
	 }
	 
	 public boolean isValida() {
		   return temBarraNavegacao(); //&& temListagemProjetos();
		 	
	 }
	 
	 private boolean temBarraNavegacao() {
		   return driver.findElement(By.xpath("//*[@id='call_data_call_request_5_name']"))!= null;
	 }
	
}
