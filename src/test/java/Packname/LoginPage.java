package Packname;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class LoginPage{

@Before
public void before_method(){
	  System.setProperty("webdriver.chrome.driver",
				"./src/main/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
} 
WebDriver driver;

@Given("^I open guru99 website$")
public void open_guru99() throws Throwable {
	driver.navigate().to("http://demo.guru99.com/test/login.html#");
  
    System.out.println("Login page of the website opened");
}

@When("^User enters valid data$")
public void enter_data(DataTable tables) throws Throwable {
	
	List<List<String>> data1=tables.raw();
	
	driver.findElement(By.id("email")).sendKeys(data1.get(1).get(0));
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("passwd")).sendKeys(data1.get(1).get(1));
	  Thread.sleep(500);
	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
	
	
    System.out.println("data entered in the application");
    }

    @Then("^Successful Login$")
    public void successful_login() throws Throwable {
        driver.getTitle().contains("Title");
      
        System.out.println("Matching the title of the page after successful Registration.");
      
    }


    @After
    public void Close_the_browser() throws Throwable {
    	boolean funcLogin ;
    	if(driver.findElement(By.xpath("//h3[contains(text(),'Successfully Logged in...')]")).isDisplayed())
    	 {
    	funcLogin = true;
    	}
    	else {
    	funcLogin = false;
    	}
    	if(funcLogin) {
    	System.out.println("Successfull login");
    	 //Convert web driver object to TakeScreenshot

        TakesScreenshot ts =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File Src=ts.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File Desti=new File("./target/Snapshot/Loginsuccess.png");

                //Copy file at destination
                FileUtils.copyFile(Src, Desti);

               
    	
    	}
    	else {
    	System.out.println("UnSuccessful login");
    	}
    	
        driver.close();
        System.out.println("Closes the browser opened through selenium");
       
    }
    
           
    
}
    


