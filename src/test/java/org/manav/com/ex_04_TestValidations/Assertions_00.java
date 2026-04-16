package org.manav.com.ex_04_TestValidations;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import io.restassured.specification.RequestSpecification;

public class Assertions_00 {


    RequestSpecification r;
    Response res;
    ValidatableResponse vr;
    String token;
    Integer BookingId;

    public void test_Assertions_00() {
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
        vr.body("bookingid", Matchers.notNullValue());
        vr.body("bookingid.lastname", Matchers.equalTo("admin"));
        vr.body("bookingid.firstname", Matchers.equalTo("admin"));
    }

}
