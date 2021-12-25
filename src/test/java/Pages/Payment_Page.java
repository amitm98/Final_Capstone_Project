package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.BaseClass;

public class Payment_Page extends BaseClass{
	
	public void purchase() {
		
		WebElement purchase = driver.findElement(By.xpath("//a[@href='completepurchase']"));
		purchase.click();
		
		WebElement order = driver.findElement(By.xpath("//a[@href='memberpurchases']"));
		order.click();
		
		WebElement title= driver.findElement(By.xpath("//h3[text()]"));
		String actual = title.getText();
		
		String expected ="SPORTY SHOES - YOUR ORDERS";
		Assert.assertEquals(actual, expected);
		

	}

}