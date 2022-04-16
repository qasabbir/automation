package com.test;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class updateUser extends baseClass{
    @Test
    public  void updateUsers(){
//        Map<String ,Object> stringObjectMap=new HashMap<>();
//        stringObjectMap.put("name", "Sabbir");
//        stringObjectMap.put("job", "SQA");
//        System.out.println("stringObjectMap");
        String Json="{\n" +
                "    \"name\": \"Sabbir\",\n" +
                "    \"job\": \"Software Quality Assurance\"\n" +
                "}";
        given()
                .header("Content-Type", "application/json")
                .accept(ContentType.JSON)
                .body(Json)
                .log().uri()
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .log().body();


    }
}
