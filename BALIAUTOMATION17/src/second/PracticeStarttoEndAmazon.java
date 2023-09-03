package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeStarttoEndAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sanjay@gmai.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sanjay1234"); Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Parth");Thread.sleep(2000); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9226763395");
		WebElement Birthday=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement Birthmonth=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement Birthyear=driver.findElement(By.xpath("//select[@id='year']"));
				
		Select day=new Select(Birthday); 
		Select month=new Select(Birthmonth);
		Select year=new Select(Birthyear);
		
		day.selectByVisibleText("10"); //Thread.sleep(2000);
		month.selectByVisibleText("May");//Thread.sleep(2000);
		year.selectByVisibleText("2020");//Thread.sleep(2000);
		
		List <WebElement> Radio=driver.findElements(By.xpath("//input[@name='sex']"));
		
		Radio.get(0).click();Thread.sleep(2000);
		Radio.get(2).click();Thread.sleep(2000);
		Radio.get(1).click();Thread.sleep(2000);
		
	}


	
}
