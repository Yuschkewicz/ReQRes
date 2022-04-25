package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SingleUser {
    @Test
    public void singleUser() {
        given().
                log().all().
        when().
                get("https://reqres.in/api/users/2").
        then().
                log().all().
                statusCode(200).
                body("data.id",equalTo(2),"data.first_name",equalTo("Janet"),
                        "data.last_name",equalTo("Weaver"));

    }
}
