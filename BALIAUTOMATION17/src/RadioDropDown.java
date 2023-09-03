import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioDropDown {
	
	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/"); Thread.sleep(2000);
	driver.manage().window().maximize(); Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")). click(); Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@*='open-registration-form-button']")). click(); Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).   sendKeys("SANJAY"); Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).    sendKeys("KURANE"); Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")). sendKeys("9226763395"); Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-type='password']")). sendKeys("9226763395"); Thread.sleep(2000);
		
	WebElement birthDay=driver.findElement(By.xpath("//select[@id='day']"));
	WebElement birthmonth=driver.findElement(By.xpath("//select[@id='month']"));
	WebElement birthyear=driver.findElement(By.xpath("//select[@id='year']"));
	
	Select day=new Select(birthDay);
	 day.selectByVisibleText("17"); Thread.sleep(2000);
	 
	Select month=new Select(birthmonth); 
	month.selectByVisibleText("Mar"); Thread.sleep(2000);
	 
	Select year=new Select(birthyear);
	year.selectByVisibleText("1981"); Thread.sleep(2000);
	
		
	List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
	radios.get(0).click();Thread.sleep(2000);
	radios.get(1).click();Thread.sleep(2000);
	radios.get(2).click();Thread.sleep(2000);
	
	
	driver.close();
	}

}
