package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatever {

    public static void main(String[] args) throws InterruptedException {
        // Set the system property to the location of your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuran\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Flipkart website
        driver.get("https://www.flipkart.com/");

        // Wait for a specified amount of time (2 seconds in this case)
        Thread.sleep(2000);

        // Close the browser window and terminate the WebDriver instance
        driver.quit();
    }
}

