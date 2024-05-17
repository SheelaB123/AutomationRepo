package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DependsOnGroup {
    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("VERIFY LOGIN");
    }
    @Test(dependsOnGroups = {"Smoke"})
    public void verifyFundTransfer(){
        System.out.println("verifyFundTransfer");
    }
    @Test
    public void verifyCardManagement(){
        System.out.println("verifyCardManagement");
    }
    @Test(enabled =false)//for disable testcases,run option will remove
    public void verifyOffers(){
        System.out.println("VERIFY offers");
    }
    @Test
    public void verifyChildScheme(){
        System.out.println("verifyChildScheme");
    }
}
