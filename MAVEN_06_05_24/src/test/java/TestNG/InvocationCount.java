package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
    @Test(invocationCount = 56 ,invocationTimeOut = 100)
    public void TestCasesMethod() {
        System.out.println("TESTCASEMETHOD");}
        @Test(invocationCount = 96, invocationTimeOut = 10)
        public void TestCasesMethod_1() {
            System.out.println("TESTCASEMETHOD1");}
            @Test(invocationCount = 856, invocationTimeOut = 100)
            public void TestCasesMethod_2() {
                System.out.println("TESTCASEMETHOD2");
            }
        }
