package org.manav.com.ex_03_RestA_TestNG_Advance.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PUT_00 {

    RequestSpecification r;
    Response res;
    ValidatableResponse vr;

    @Test
    public void testPutNonBDD() {

        String token = "db3f40af96b28b3";
        String bookingId = "1";
        String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Sugat\"\n" +
                "}";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking" + bookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload).log().all();

        res = r.when().log().all().put();

        vr = res.then().log().all();
        vr.statusCode(200).log().all();

    }
}
