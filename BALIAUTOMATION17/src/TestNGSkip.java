import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSkip {
	
	public class TestNGAfter {
		
		@Test
		public void A() {
		System.out.println("Print test case method Aa");
		}
		@AfterMethod
		public void AF() {
			System.out.println("After test case method");
			}
		
		@BeforeMethod
		public void BF() {
			System.out.println("Before test case method");
			}
		
		@Test(priority = 1)
		public void B() {
		System.out.println("Print test case method Bb");
		}
		
		@Test(enabled =false)
		public void S() {
		System.out.println("Print test case method Skip");
		}
		
		}

}
