package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RegisterSuccessful {
    @Test
    public void registSucc(){
      given().
              body("{\"email\": \"eve.holt@reqres.in\",\n" +
                      "    \"password\": \"pistol\"}").
              header("Content-Type", "application/json").
              log().all().
      when().
              post("https://reqres.in/api/register").
      then().
              log().all().
              statusCode(200).
              body("token",equalTo("QpwL5tke4Pnpja7X4"));
    }
}
