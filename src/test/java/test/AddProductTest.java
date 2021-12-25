package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.AddProduct_Page;

public class AddProductTest {
	
	@Test
	public void AddProduct()
	{
		AddProduct_Page obj = new AddProduct_Page();
		
		obj.back_to_Home();
		obj.Product();	
		
	}

}
