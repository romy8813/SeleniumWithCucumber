package step.definition;
import org.openqa.selenium.WebDriver;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import org.junit.*;;

public class loginStepDefinition {
	
	WebDriver driver ;
	
	@Given("^User is already on login page$")
public void userOnLoginPAge() {
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window size
		driver.get("http://www.facebook.com");
			
	}
	
	@When("^Title of login page is Facebook$")
	public void titlepgeISDisplayed() {
		String Title = driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up", Title);
		
		
	}
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")  //can also use \"([^\"]*)\"
	public void enterUserNameAndPassword(String username,String password) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}

	
	@Then("^user clicks on login button$")
	public void clickLoginButton() {
		driver.findElement(By.id("loginbutton")).click();
		
	}
		
	
	@Then("^home page is displayed$")
	public void homePageDisplayed() {
    driver.findElement(By.id("userNav"));
    driver.quit();
	}
	    

}
	

