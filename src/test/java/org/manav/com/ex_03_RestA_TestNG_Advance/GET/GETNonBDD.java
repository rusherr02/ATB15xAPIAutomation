package org.manav.com.ex_03_RestA_TestNG_Advance.GET;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETNonBDD {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;

    @Test
    public void getNonBDD() {
        pincode = "1234";
        r = r.basePath("");
        r.baseUri("http://localhost:8080/");
    }
}
