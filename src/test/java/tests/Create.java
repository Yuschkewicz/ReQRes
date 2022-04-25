package tests;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Create {
    @Test
    public void create(){
        String createdAt =given().
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").
                log().all().
        when().
                post("https://reqres.in/api/users").
        then().
                log().all().
                statusCode(201).
        extract().body().jsonPath().getString("createdAt");
        System.out.println(createdAt);

    }
}
