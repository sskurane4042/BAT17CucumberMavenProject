package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePrac {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://paytm.com/"); Thread.sleep(2000);
		driver.manage().window().maximize(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//Span[text()='Sign In']")).click();Thread.sleep(2000);
		
		List <WebElement> TotalIFRAME=driver.findElements(By.tagName("iframe"));
		
		System.out.println(TotalIFRAME.size());   Thread.sleep(2000);
		
		for (int i=0; i<TotalIFRAME.size(); i++)
		{
			driver.switchTo().frame(i);
		}
		
		
		
		
				
		//List <WebElement> Totalframe=driver.findElements(By.tagName("iframe"));
		
		//System.out.println(Totalframe.size());
		
		//for (int i=0; i<Totalframe.size(); i++) {
			
		//	driver.switchTo().frame(i);
			
			//if(driver.findElement(By.xpath("//span[@class='ng-scope']")).isDisplayed()) {
				
			//	driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
				
				
			
		
		//driver.findElement(By.xpath("//Span[text()='Sign In']")).click();
		
		//List <WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		
		//System.out.println(totalframe.size());

	}

}
