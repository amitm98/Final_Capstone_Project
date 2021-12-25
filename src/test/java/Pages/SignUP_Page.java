package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.BaseClass;

public class SignUP_Page extends BaseClass{
	
	public void SignUp(String Email, String Password, String ConfirmPass, String FirstName, String LastName, String Age, String Address)
	{
		
		WebElement not_member = driver.findElement(By.xpath("//a[@href='signup']"));
		not_member.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email_id']"));
		email.sendKeys(Email);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys(Password);
		
		WebElement confirm_password = driver.findElement(By.xpath("//input[@name='pwd2']"));
		confirm_password.sendKeys(ConfirmPass);
		
		WebElement first_name = driver.findElement(By.xpath("//input[@name='fname']"));
		first_name.sendKeys(FirstName);
		
		WebElement last_name = driver.findElement(By.xpath("//input[@name='lname']"));
		last_name.sendKeys(LastName);	
		
		WebElement age = driver.findElement(By.xpath("//input[@name='age']"));
		age.sendKeys(Age);
		
		WebElement address = driver.findElement(By.xpath("//input[@name='age']"));
		address.sendKeys(Address);
		
		WebElement signup = driver.findElement(By.xpath("//button[text()='Signup']"));
		signup.click();
		
		WebElement back = driver.findElement(By.xpath("//a[text()='Login to continue shopping']"));
		back.click();
	}
	
	

}
