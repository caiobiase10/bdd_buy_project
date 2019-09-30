package Inmetrics_project.Cucumber_project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		
		features = "C:\\Users\\tayan\\Documents\\pasta_inmetrics\\caio_project\\Cucumber_project\\src\\test\\resources\\purchase.feature",
		plugin = {"pretty", "html:target/cucumber"})

public class Start_test {}
