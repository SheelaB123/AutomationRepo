package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod_1 {
    public WebDriver driver;
    @BeforeMethod
    public void BeforeMethod()
    {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//upcasting
    }
    @Test
    public void demoOfTestNG_1(){
        driver.get("https://www.makemytrip.com/bus-tickets/");
        driver.manage().window().maximize();

    }
    @Test
    public void demoOfTestNG_2(){
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

    }
    @Test
    public void demoOfTestNG_3() {
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.9.0");
        driver.manage().window().maximize();
    }
        @AfterMethod
        public void AfterMe(){
        driver.close();


    }}
