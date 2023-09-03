import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAfter {
	
	@Test
	public void Aa() {
	System.out.println("Print test case method Aa");
	}
	@AfterMethod
	public void BF() {
		System.out.println("After test case method");
		}
	
	@Test
	public void BB() {
	System.out.println("Print test case method Bb");
	}
	
	}
	
	


