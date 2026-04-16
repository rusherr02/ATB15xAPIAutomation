package org.manav.com.ex_04_TestValidations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_01_AssertJ {

    @Test
    public void test_Assertions_soft_assertion() {

        SoftAssert sa = new SoftAssert();
        sa.assertEquals("pamod","pramod");
        System.out.println("----------------------------------------------");
        sa.assertAll();
    }

}
