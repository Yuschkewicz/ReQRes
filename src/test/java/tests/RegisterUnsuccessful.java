package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RegisterUnsuccessful {
    @Test
    public void registUnsuccessful() {
        given().
                log().all().
        when().
                header("Content-Type", "application/json").
                post("https://reqres.in/api/register").
        then().
                log().all().
                statusCode(400).
        body("error",equalTo("Missing email or username"));
    }


}
