package org.someone;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Commands {

    public static WebDriver openChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\" + App.hostname + "\\Documents\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\" + App.hostname + "\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
        options.addArguments("--disable-default-apps");
        return new ChromeDriver(options);
    }

}
