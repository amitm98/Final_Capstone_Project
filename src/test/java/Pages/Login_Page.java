package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import test.BaseClass;

public class Login_Page extends BaseClass {
	
	public void login(String Email, String Password)
	{
		WebElement email = driver.findElement(By.xpath("//input[@name='email_id']"));
		email.sendKeys(Email);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys(Password);
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Login']"));
		button.click();
		
		WebElement title = driver.findElement(By.xpath("//h3[text()]"));
		String actual_title = title.getText();
		
		String expected_title = "SPORTY SHOES - DASHBOARD";
		
		Assert.assertEquals(actual_title, expected_title);
	}

}