package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwar Testing\\Chrome_116\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/"); Thread.sleep(2000);
		driver.manage().window().maximize(); Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement login=driver.findElement(By.xpath("//*[text()='Login']"));  // move
		
		
		
		
		//a[@data-csa-c-content-id='nav_cs_mobiles']
		
		
		
		WebElement signin=driver.findElement(By.xpath("//*[text()='Sign in']"));  // move
		WebElement electronic=driver.findElement(By.xpath("//*[text()='Electronics']"));   // right click
		WebElement TVappliance=driver.findElement(By.xpath("//*[text()='TVs & Appliances']'")); //right click 
		
		WebElement fashion=driver.findElement(By.xpath("//*[text()='Fashion']"));               //right click
		WebElement mobiles=driver.findElement(By.xpath("//*[text()='Mobiles & Tablets']"));  //double click
		Actions act=new Actions(driver);

		act.moveToElement(signin).build().perform(); Thread.sleep(2000);      //cursor move
		act.moveToElement(login).build().perform();
		act.contextClick(electronic).build().perform(); Thread.sleep(2000);   //Right click
		act.contextClick(TVappliance).build().perform(); Thread.sleep(2000);  //Right click
		act.contextClick(fashion).build().perform(); Thread.sleep(2000);      //Right click
		act.doubleClick(mobiles).build().perform(); Thread.sleep(2000);       //Double click and open that page    
		
		
		
		
		
	}

}
