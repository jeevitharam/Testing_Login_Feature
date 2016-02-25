package seltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seltest {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		driver.findElement(By.id("Email")).sendKeys("automail2.2016@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("automail2.2016\\");
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
