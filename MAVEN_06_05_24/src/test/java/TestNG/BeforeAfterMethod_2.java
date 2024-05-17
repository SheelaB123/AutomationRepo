package TestNG;

import org.testng.annotations.*;

public class BeforeAfterMethod_2 {
    @BeforeClass
    public void defineByClass(){
        System.out.println("Before classes");
    }
    @BeforeMethod
    public void preRequisite() {
        System.out.println("BeforeMethod");
    }
@Test
    public void TestCase_1() {
        System.out.println("testcase1");
    }
    @Test
    public void TestCase_2(){
        System.out.println("TestCase2");
    }
    @AfterMethod
    public void TearDown(){
        System.out.println("Afterclass");
        //driver.close();
    }
    @AfterClass
    public void defineAfterByClass(){
        System.out.println("Before classes");
    }
}
