package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.BaseClass;

public class AddProduct_Page extends BaseClass {
	
	public void Product() {
		WebElement proudct1 = driver.findElement(By.xpath("//a[@href='cartadditem?id=5']"));
		proudct1.click();
		
		back_to_Home();
	
		WebElement proudct2 = driver.findElement(By.xpath("//a[@href='cartadditem?id=106']"));
		proudct2.click();
		
		back_to_Home();
	
		WebElement proudct3 = driver.findElement(By.xpath("//a[@href='cartadditem?id=4']"));
		proudct3.click();
	}
	
	public void back_to_Home() {

		WebElement home = driver.findElement(By.xpath("//a[@href='home']"));
		home.click();

	}
}