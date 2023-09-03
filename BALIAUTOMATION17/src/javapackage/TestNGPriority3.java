package javapackage;

import org.testng.annotations.Test;

public class TestNGPriority3 {
	
	@Test (priority = 2)
	public void pooja()
	{
		System.out.println("He is Anchor of family");
	}
	
	@Test (priority = 3)
	public void parth()
	{
		System.out.println("He is Heart of family");
	}
	
	@Test (priority = 1)
	public void sanjay()
	{
		System.out.println("He is Head of family");
	}
}
