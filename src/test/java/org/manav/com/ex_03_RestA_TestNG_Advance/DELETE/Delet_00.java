package org.manav.com.ex_03_RestA_TestNG_Advance.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Delet_00 {

    RequestSpecification r;
    Response res;
    ValidatableResponse vr;

    @Test
    public void testDeKNonBDD() {

        String token = "db3f40af96b28b3";
        String bookingId = "42";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking" + bookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);

        res = r.when().log().all().delete();

        vr = res.then().log().all();
        vr.statusCode(201).log().all();

    }


}
