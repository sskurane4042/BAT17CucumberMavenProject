package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver(); Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");Thread.sleep(2000);
		//driver.navigate().to("https://www.facebook.com/"); Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click(); Thread.sleep(2000); //click on create new a/c
		
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));Thread.sleep(2000);
	    radios.get(0).click(); Thread.sleep(2000); 
	    radios.get(1).click(); Thread.sleep(2000);
	    radios.get(2).click(); Thread.sleep(2000);
	    

		

}}
