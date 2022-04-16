package com.test;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class listUser extends baseClass{
    @Test
    public void listUsers(){
    given()
                .when()
//            .log().uri()
            .get("/users?page=2")
                .then()
            .body("page",equalTo(2))
            .body("data.id",hasItems(7,8,9))

            .log().body()
            .statusCode(200);


    }
}
