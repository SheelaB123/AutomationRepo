package TestNG;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = -1)
    public void TestCaseY()
    {
        System.out.println("TestCaseY");
    }
    @Test(priority = 'A')
    public void TestCaseQ()
    {
        System.out.println("TestCaseQ");
    }
    @Test(priority = 2)
    public void TestCaseA()
    {
        System.out.println("TestCaseA");
    }
    @Test(priority = 4)
    public void TestCaseX()
    {
        System.out.println("TestCaseX");
    }
}
