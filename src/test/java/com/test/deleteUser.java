package com.test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.Matchers.hasItems;

public class deleteUser extends baseClass{
    @Test
    public  void delUsers(){
//        Response response=  given()
//                .when()
//                .log().uri()
//                .get("/users?page=2");
//        int userId=response.jsonPath().getInt("data[2].id");
//
//        System.out.println("Result :"+userId);
//
//        given()
//                .when()
//                //            .log().uri()
//                .header("Content-Type", "application/json")
//                .accept(ContentType.JSON)
//                .delete("/users/{userId}",userId)
//                .then()
//                .log().body()
//                .body("data.id",equalTo(userId))
//                .statusCode(200);

    }
}
