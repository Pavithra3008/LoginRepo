package Packname;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;


@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
//@Cucumber.Options( format={"json:target/cucumber/cucumber.json"})

public class Runner { 
	
}
