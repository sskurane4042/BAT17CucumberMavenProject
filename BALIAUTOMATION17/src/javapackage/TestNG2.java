package javapackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void creatNewAccout()
	{
		System.out.println("Print New Account");
	}

	@Test
	public void AutoPayment()
	{
		System.out.println("Print Auto Payment");
	}
	@Test
	public void makeAutoPayment()
	{
		System.out.println("Print Make auto payment");
	}
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Print Username, Password and click on login button");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("close the application");
	}

}
