package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void MakeMyTrip() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//upcasting
        driver.navigate().to("https://www.makemytrip.com/bus-tickets/");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        WebElement element= driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']']"));
        element.click();
        softAssert.assertEquals(title,"makemytriplg in or sign up","Makemytrip sign in");
        softAssert.assertTrue(element.isEnabled(),"element should be enable");
        softAssert.assertAll();
        Thread.sleep(4000);
        driver.close();

    }


}
