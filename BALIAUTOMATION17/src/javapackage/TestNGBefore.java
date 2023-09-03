package javapackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBefore {
	@Test
	public void AA() {
	System.out.println("Print test case method Aa");
	}
	@BeforeMethod
	public void BF() {
		System.out.println("Before test case method");
		}
	
	@Test
	public void BB() {
	System.out.println("Print test case method Bb");
	}
	
	}


