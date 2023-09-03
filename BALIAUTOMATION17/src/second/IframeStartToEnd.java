package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeStartToEnd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://paytm.com/"); Thread.sleep(2000);
		driver.manage().window().maximize(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click(); Thread.sleep(2000);
		List <WebElement> TotalIframe=driver.findElements(By.xpath("iframe"));
		
		System.out.println(TotalIframe.size());
	  
		for (int i=0; i<TotalIframe.size(); i++)
		{
			driver.switchTo().frame(i);
			if (driver.findElement(By.xpath("//span[@class='ng-scope']")).isDisplayed()) 
			{
				
				driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
					
				}
			}
			
			
				
		
		
		
		
		
	 
			
	}

}
