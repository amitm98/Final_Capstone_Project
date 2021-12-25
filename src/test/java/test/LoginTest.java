package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Login_Page;

public class LoginTest extends BaseClass{
	
	@Test
	@Parameters({"Email","Password"})
	public void login(String Email, String Password)
	{
		Login_Page obj = new Login_Page();
		obj.login(Email,Password);
	}
	
	

}
