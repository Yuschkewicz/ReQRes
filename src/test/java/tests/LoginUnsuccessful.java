package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginUnsuccessful {
    @Test
    public void loginUnSuccessful() {
        given().
                log().all().
                header("Content-Type", "application/json").
        when().
                post("https://reqres.in/api/login").
        then().
                log().all().
                statusCode(400).
                body("error", equalTo("Missing email or username"));
    }
}
