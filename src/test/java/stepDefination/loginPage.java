package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {
	
	WebDriver driver;

	@Given("^User should be there in loginpage$")
	public void User_should_be_there_in_loginpage() {
		 driver = new ChromeDriver();
        driver.get("https://www.dru.care/signup-login-in/#/login");
	}
	
	@When("User enter username and password")
	public void user_enter_username_and_password() {
	   driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("druprudhvi");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Drucare@1");
	}
	
	@When("Users click on login button")
	public void users_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("Login should get succeess with infoe message")
	public void login_should_get_succeess_with_infoe_message() {
	    
	}

	
}