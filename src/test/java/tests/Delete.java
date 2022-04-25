package tests;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Delete {
    @Test
    public void patch() {
        given().
                log().all().
        when().
                delete("https://reqres.in/api/users/2").
        then().
                log().all().
                statusCode(204);

    }

}
