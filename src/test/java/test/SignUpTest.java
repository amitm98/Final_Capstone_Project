package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.SignUP_Page;

public class SignUpTest extends BaseClass {

	@Test(enabled=false)
	@Parameters({"Email", "Password", "ConfirmPass", "FirstName", "LastName","Age", "Address"})
	public void singup(String Email, String Password, String ConfirmPass, String FirstName, String LastName, String Age, String Address)
	{
		SignUP_Page sign = new SignUP_Page();
		sign.SignUp(Email, Password, ConfirmPass, FirstName, LastName, Age, Address);
		
	}
	
}