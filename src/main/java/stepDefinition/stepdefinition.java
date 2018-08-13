package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class stepdefinition {
	
	WebDriver driver;
   @Given("^User is at Login Page$")
   public void user_is_at_Login_Page()
	{   
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		}
	
	@SuppressWarnings("deprecation")
	@When("^The Title of the page is Free CRM$")
    public void the_Title_of_the_page_is_Free_CRM()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		String title=driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
		
	
	}
	
	@Then("^user enters usename and password$")
	public void user_enters_usename_and_password(DataTable dataMap)
	{
	for(Map<String,String> map : dataMap.asMaps(String.class, String.class))
	{
	driver.findElement(By.name("username")).sendKeys(map.get("username"));
	driver.findElement(By.name("password")).sendKeys(map.get("password"));
			
	}
	}
	
	@Then("^User is at Home Page$")
    public void user_is_at_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


	
}
