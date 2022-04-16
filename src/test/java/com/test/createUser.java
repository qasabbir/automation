package com.test;

import com.thedeanda.lorem.LoremIpsum;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class createUser extends baseClass{
    @Test
    public  void createUsers(){
//        Map<String ,Object> stringObjectMap=new HashMap<>();
//        stringObjectMap.put("name", "Sabbir");
//        stringObjectMap.put("job", "SQA");
//        System.out.println("stringObjectMap");
    String Json="{\n" +
            "    \"name\": \"Md Sabbir Hossain\",\n" +
            "    \"job\": \"SQA\"\n" +
            "}";
        given()
                .header("Content-Type", "application/json")
                .accept(ContentType.JSON)
                .body(Json)
                .log().uri()
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().body();


    }
}
