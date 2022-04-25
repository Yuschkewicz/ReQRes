package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SingleUserNotFound {
    @Test
    public void singleUserNotFoind(){
        given().
                log().all().
        when().
                get("https://reqres.in/api/users/23").
        then().
                log().all().
                statusCode(404);




    }
}
