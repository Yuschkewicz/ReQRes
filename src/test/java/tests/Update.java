package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Update {
    @Test
    public void update(){
       String check= given().
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}").
                log().all().
        when().
                put("https://reqres.in/api/users/2").
        then().
                log().all().
                statusCode(200).
                extract().body().asString();
       System.out.println(check);
    }
}
