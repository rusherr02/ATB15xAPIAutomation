package org.manav.com.ex_03_RestA_TestNG_Advance.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Post_00 {


    @Test
    public void test_authToken() {
        String url = "https://restful-booker.herokuapp.com";
        String path = "/auth";
        String payload = "{\"username\": \"admin\", \"password\": \"password123\"}";


        RestAssured.given().baseUri(url).basePath(path).contentType(ContentType.JSON).log().all()
                .body(payload).when().post().then().log().all().statusCode(200).extract().body().path("token");
    }
}
