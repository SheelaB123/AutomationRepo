package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test (priority = 1)
    public void verifyLogin(){
        System.out.println("VERIFY LOGIN");
    }
    @Test(priority = 2,dependsOnMethods = {"verifyLogin"})
    public void verifyFundTransfer(){
        System.out.println("verifyFundTransfer");
    }
    @Test(priority = 3)
    public void verifyCardManagement(){
        System.out.println("verifyCardManagement");
    }
    @Test(priority = 4)
    public void verifyOffers(){
        System.out.println("VERIFY offers");
    }
    @Test(priority = 5)
    public void verifyChildScheme(){
        System.out.println("verifyChildScheme");
    }
}
