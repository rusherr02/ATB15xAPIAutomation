package org.manav.com.ex_01_RestA_HelloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class HelloWorld {

     @Test
    public void testHelloWorld(){
//         System.out.println("Hello World");

         // Rest Assured

         // Given - pre-requisite

         // When - Action

         // Then - Validation

         RestAssured.
                 given()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("/ping")
                 .when()
                    .get()
                 .then()
                    .statusCode(201 );

     }

}
