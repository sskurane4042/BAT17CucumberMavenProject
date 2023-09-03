package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseStartToEnd {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com/"); 
		driver.manage().window().maximize(); Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		WebElement Sign=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
		WebElement Today=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));
		WebElement CustService=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_customerservice']"));
		WebElement Sale=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_sell']"));
		
		Actions act=new Actions(driver); // Is used for mouse overing
		
		act.moveToElement(Sign).build().perform(); Thread.sleep(2000); //Is used to mouse move on content/tab/option
		act.moveToElement(Today).build().perform(); Thread.sleep(2000); 
		act.contextClick(CustService).build().perform(); Thread.sleep(2000);  // Is used for right click
		act.doubleClick(Sale).build().perform(); Thread.sleep(2000);     // Is used for Right click to open page
		
		driver.close();
		
		
		

		
	
	
		
	}

}
