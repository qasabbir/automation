package com.test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class singleUser extends baseClass{
    @Test
    public void singleUser(){
        given()
                .when()
//            .log().uri()
                .header("Content-Type", "application/json")
                .accept(ContentType.JSON)
                .get("/users/2")
                .then()
                .log().body()
                .body("data.id",equalTo(2))
                .body("data.first_name",equalTo("Janet"))
                .statusCode(200);
    }

    @Test
    public void singleUserCheck(){
      Response response=  given()
                .when()
                     .log().uri()
                    .get("/users?page=2");
                    int userId=response.jsonPath().getInt("data[2].id");
                    String first_name=response.jsonPath().getString("data[2].first_name");
                    System.out.println("Result :"+userId);
                    System.out.println("Result :"+first_name);

                    given()
                            .when()
            //            .log().uri()
                            .header("Content-Type", "application/json")
                            .accept(ContentType.JSON)
                            .get("/users/{userId}",userId)
                            .then()
                            .log().body()
                            .body("data.id",equalTo(userId))
                            .body("data.first_name",equalTo(first_name))
                            .statusCode(200);
    }
}
