package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.CheckOut_Page;

public class CheckOutTest extends BaseClass{
	
	@Test
	public void checkout()
	{
		
		CheckOut_Page obj = new CheckOut_Page();
		
		obj.cart();
		obj.payment();
	}

}
