package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dp {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();  Thread.sleep(2000);
		
		
		Actions act=new Actions(driver);
		WebElement Plgu=driver.findElement(By.xpath("//a[text()='Plugins']"));
		act.contextClick(Plgu).build().perform(); Thread.sleep(2000);
		
		WebElement Found=driver.findElement(By.xpath("//a[text()='JS Foundation']"));
		act.moveToElement(Found).build().perform(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		driver.switchTo().frame(0);
		WebElement Drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		act.dragAndDrop(Drag, Drop).build().perform();
		
		driver.close();
		
		
		
		
		
	}

}
