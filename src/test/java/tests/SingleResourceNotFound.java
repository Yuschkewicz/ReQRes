package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleResourceNotFound {
    @Test
    public void resourceNotFound(){
        given().
                log().all().
        when().
                get("https://reqres.in/api/unknown/23").
        then().
                log().all().
                statusCode(404);
    }
}
