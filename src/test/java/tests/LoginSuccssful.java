package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginSuccssful {
    @Test
    public void loginSuccssful(){
        given().
                body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}").
                log().all().
                header("Content-Type", "application/json").
        when().
                post("https://reqres.in/api/login").
        then().
                log().all().
                statusCode(200).
                body("token",equalTo("QpwL5tke4Pnpja7X4"));
    }
}
