package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://paytm.com/");
        
        // Remember to close the browser when you're done
        driver.quit();
    }
}
