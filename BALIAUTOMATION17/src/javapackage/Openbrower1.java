package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrower1 {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwar Testing\\Chrome_116\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    WebDriver driver =new ChromeDriver();
	    
	    //driver.get("https://www.facebook.com/");Thread.sleep(2000); OR second method below navigate command
	    
	    driver.navigate().to("https://www.facebook.com/");   Thread.sleep(2000);
	    driver.manage(). window(). maximize();               Thread.sleep(2000);
	    //driver.navigate().back();                            Thread.sleep(2000);
	    //driver.navigate().forward();                         Thread.sleep(2000);
	   // driver.navigate().refresh();                         Thread.sleep(2000);  
	    driver.findElement(By.xpath("//input[@id='email']")). sendKeys("Sanjay");  Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pass']")). sendKeys("12345");           Thread.sleep(2000);
	    //driver.findElement(By.xpath("//button[@name='login']")).click();                 Thread.sleep(2000); 
	      driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click(); Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	   //driver.close();
	    //Thread.sleep(2000);
	    
	    

        
        
	
	}

}