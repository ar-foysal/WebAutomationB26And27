package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDiffAssertion extends  BrowserSetup{
    @Test
    public void testAssert(){
        Assert.assertEquals(1, 1);
        System.out.println("Step 1");
        Assert.assertFalse(true);
        System.out.println("Step 2");
        Assert.assertTrue(true);
        System.out.println("Step 3");
    }

    @Test
    public void testSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1, 1);
        System.out.println("Step 1");
        softAssert.assertFalse(true);
        System.out.println("Step 2");
        softAssert.assertTrue(true);
        System.out.println("Step 3");

        softAssert.assertAll();
    }
}
