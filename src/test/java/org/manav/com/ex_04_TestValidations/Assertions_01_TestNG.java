package org.manav.com.ex_04_TestValidations;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.SoftAssertions;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_01_TestNG {

    @Test
    public void test_Assertions_soft_assertion() {

        SoftAssert sa = new SoftAssert();
        sa.assertEquals("pamod","pramod");
        System.out.println("----------------------------------------------");
        sa.assertAll();
    }

}
