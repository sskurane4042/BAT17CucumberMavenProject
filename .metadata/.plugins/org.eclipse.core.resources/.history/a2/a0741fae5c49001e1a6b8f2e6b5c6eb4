package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwar Testing\\Chrome_116\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/"); 
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		WebElement Drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);

        Actions action=new Actions(driver);
        action.dragAndDrop(Drag, Drop).build().perform(); 
        Thread.sleep(2000);
        
        

		
		
		
		
		
		
		
		
		
		
		//driver.switchTo().frame(0);
		
		//WebElement Drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement Drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Actions act=new Actions(driver);
		
		//act.dragAndDrop(Drag, Drop).build().perform(); Thread.sleep(2000);
		
		
		
		
		
	}
	
}
