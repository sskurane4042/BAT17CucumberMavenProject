package javapackage;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDependentAssert {
	
	@Test(priority = 1)
	public void signup() {
	
		Assert.assertTrue(3>10);
		System.out.println("This is singup page");
	}
	@Test(dependsOnMethods = "signup")
	public void login() {
		
		System.out.println("This is login page depend upon singup page");
	}
	
	
	}


