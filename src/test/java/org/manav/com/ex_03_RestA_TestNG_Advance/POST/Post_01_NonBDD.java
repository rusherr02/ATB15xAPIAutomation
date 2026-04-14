package org.manav.com.ex_03_RestA_TestNG_Advance.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Post_01_NonBDD {

    RequestSpecification r;
    Response res;
    ValidatableResponse vr;


    @Test
    public void test_authToken() {
        String url = "https://restful-booker.herokuapp.com";
        String path = "/auth";
        String payload = "{\"username\": \"admin\", \"password\": \"password123\"}";


        r = RestAssured.given();
        r.baseUri(url);
        r.baseUri(path);
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();


        res = r.when().log().all().post();

        vr = res.then().log().all();
        vr.statusCode(200).log().all();
    }
}
