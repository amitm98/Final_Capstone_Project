package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	
	

	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/Section7LEP2/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		}
	
	@AfterTest
	public void teardown()
	{
//		driver.quit();
	}

}