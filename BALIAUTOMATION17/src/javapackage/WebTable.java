package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://money.rediff.com/gainers"); //Thread.sleep(2000);
		driver.manage().window().maximize(); //Thread.sleep(2000);
		
		driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[2]")).click();
		
		System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size());
		
		System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td")).size());
		
		driver.close();

		//System.out.println(table[@class='dataTable']/tbody/tr")).size());
		
	}
	

}
