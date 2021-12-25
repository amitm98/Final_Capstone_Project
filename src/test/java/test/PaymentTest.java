package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.Payment_Page;

public class PaymentTest {

	@Test
	public void payment() {
		Payment_Page obj = new Payment_Page();
		
		obj.purchase();
	}
}