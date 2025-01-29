package org.ap.qa.selenium;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeActions {
    static WebDriver driver;
    
    // open chrome browser
    public static void openChromeBrowser() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--Headless=new");
        driver = new ChromeDriver(options);   
        driver.manage().window().maximize();
    }

    // maximize the browser window    
    public static void maximizeBrowserWindow() {
        driver.manage().window().maximize();
    }
    
    // navigate to a URL
    public static void navigateToURL(String url) {
        driver.get(url);
    }

    // close chrome browser
    public static void closeChromeBrowser() {
        driver.quit();
    }
}
