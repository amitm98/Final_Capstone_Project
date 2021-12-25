package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.BaseClass;

public class CheckOut_Page extends BaseClass{
	
	public void cart() {
		WebElement cart = driver.findElement(By.xpath("//a[@href='cart']"));
		cart.click();
		
		WebElement check_out = driver.findElement(By.xpath("//a[@href='checkout']"));
		check_out.click();	
		
	}
	
	public void payment()
	{
		WebElement pay = driver.findElement(By.xpath("//a[@href='gateway']"));
		pay.click();
		
		WebElement exp_title = driver.findElement(By.xpath("//h3[text()]"));
		String expected = exp_title.getText();
		String actual = "SPORTY SHOES - PAYMENT GATEWAY";
		Assert.assertEquals(actual, expected);
	}
	
	
	

}
