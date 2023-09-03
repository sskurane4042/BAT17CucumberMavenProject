package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/"); Thread.sleep(2000);
		driver.manage().window().maximize(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click(); Thread.sleep(2000);
		WebElement Birthday=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement Birthmonth=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement Birthyear=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select day=new Select(Birthday);
		day.selectByVisibleText("17"); Thread.sleep(2000);  //OR below second way can write another way
		//day.selectByIndex(16); Thread.sleep(2000);
		
		Select month=new Select(Birthmonth);
		month.selectByVisibleText("Mar"); Thread.sleep(2000);  //OR below second way can write another way
		//month.selectByIndex(2); Thread.sleep(2000);
		
		Select year=new Select(Birthyear);
		year.selectByVisibleText("1981"); Thread.sleep(2000);   //OR below second way can write another way
		//year.selectByIndex(42); Thread.sleep(2000);
		
	}
}
