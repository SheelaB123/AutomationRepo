package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfTestNG {
    @Test
    public void demoOfTestNG_1(){
      System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//upcasting
        driver.get("https://www.makemytrip.com/bus-tickets/");
        driver.manage().window().maximize();
        driver.close();
}
@Test
public void demoOfTestNG_2(){
    System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//upcasting
    driver.get("https://demoqa.com/frames");
    driver.manage().window().maximize();
    driver.close();
}
@Test
public void demoOfTestNG_3(){
    System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//upcasting
    driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.9.0");
    driver.manage().window().maximize();
    driver.close();
}}


