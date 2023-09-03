package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver(); Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");Thread.sleep(2000);
		//driver.navigate().to("https://www.facebook.com/"); Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click(); Thread.sleep(2000); //click on create new a/c
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Parth"); Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kurane"); Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8530013395");
		WebElement BirthMonth=driver.findElement(By.xpath("//select[@id='month']"));Thread.sleep(2000);
		//X-path ref birthmonth or BirthMonth or birthMonth or Birthmonth it ok no matter
		
		Select month=new Select(BirthMonth);    //object of select [class birthMonth is x-path ref. and month is only-x-path]
				
		month.selectByVisibleText("Jan");Thread.sleep(2000);
		System.out.println(month.getFirstSelectedOption().getText());
		
		month.selectByIndex(1); Thread.sleep(2000);
		System.out.println(month.getFirstSelectedOption().getText());
		
		month.selectByIndex(2); Thread.sleep(2000);
		System.out.println(month.getFirstSelectedOption().getText()); //show the month like jan feb mar in console bcoz of this statement
		
		month.selectByIndex(3); Thread.sleep(2000);
		System.out.println(month.getFirstSelectedOption().getText());
		
	}

}
