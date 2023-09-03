package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrower2 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32_2\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    Thread.sleep(2000);
	    driver.navigate().to("https://www.flipkart.com/");Thread.sleep(2000);
	    driver.manage().window().maximize(); Thread.sleep(2000);
	    //driver.navigate().back();Thread.sleep(2000);
	    //driver.navigate().forward();Thread.sleep(2000);
	   // driver.navigate().refresh(); Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).
	    sendKeys("Oppo Mobile"); Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	    //driver.close();Thread.sleep(2000);
	    

}}
