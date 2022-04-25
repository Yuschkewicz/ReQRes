package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SingleResource {
    @Test
    public void singleResource(){
        given().
                log().all().
        when().
                get("https://reqres.in/api/unknown/2").
        then().
                log().all().
                statusCode(200).
                body("data.color",equalTo("#C74375"));


    }
}
