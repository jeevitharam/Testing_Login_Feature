package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class test_step {
	WebDriver driver= new FirefoxDriver();
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page(){
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		
	}

	@When("^enter username and password$")
	public void enter_username_and_password() {
		driver.findElement(By.id("Email")).sendKeys("automail2.2016@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("automail2.2016\\");	 
	}

	@Then("^log in and leave a msg$")
	public void log_in_and_leave_a_msg()  {
		driver.findElement(By.id("signIn")).click();
		System.out.println("sucess");
		
		//driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click(); // To click the flyout menu
		//driver.findElement(By.className("gb_71")).click();
		//driver.findElement(By.className("gb_Za gbii")).click();
		//driver.switchTo().activeElement().click();
		//driver.findElement(By.id("gb_71")).click();
		driver.close();	   
	}


}
