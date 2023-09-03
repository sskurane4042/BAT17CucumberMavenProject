package javapackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	@Test
	public void b()
	{
		System.out.println("Print e test method");
	}
	@Test(priority = 1)
	public void e()
	{
		System.out.println("Print e Priority test method");
	}
	@Test
	public void a()
	{
		System.out.println("Print b test method");
	}

}
