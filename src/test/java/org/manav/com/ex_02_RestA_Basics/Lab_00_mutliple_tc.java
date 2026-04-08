package org.manav.com.ex_02_RestA_Basics;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_00_mutliple_tc {

    @Test
    public void test_positive_tc1(){

        String pincode = "560037";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }


    @Test
    public void test_negative_tc2(){

        String pincode = "";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc3(){

        String pincode = "560037";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }

    @Test
    public void test_negative_tc4_space(){

        String pincode = " ";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc5_special_chars(){

        String pincode = "!@#$%^&*()";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc6_invalid_code(){

        String pincode = "12345";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc6_valid_code_with_space(){

        String pincode = "5 6 0 1 0 2";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc7_valid_code_with_minus(){

        String pincode = "-560037";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc8_all_zeros(){

        String pincode = "0000000";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc9_alphabetic(){

        String pincode = "abcdefghj";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }

    @Test
    public void test_negative_tc10_alphanumeric(){

        String pincode = "abcdefghj12344";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);


    }


}
