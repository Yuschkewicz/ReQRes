package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DelayedResponse {
    @Test
    public void delayResponse(){
    given().
            log().all().
    when().
            get("https://reqres.in/api/users?delay=3").
    then().
                log().all().
                statusCode(200).
            body("data[0].last_name",equalTo("Bluth"),
                   "data[1].last_name",equalTo("Weaver"),
                    "data[2].last_name",equalTo("Wong"),
                     "data[3].last_name",equalTo("Holt"),
                      "data[4].last_name",equalTo("Morris"),
                       "data[5].last_name",equalTo("Ramos"));
    }
}
