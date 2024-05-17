package Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\2024\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.in");
}}
