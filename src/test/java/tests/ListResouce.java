package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ListResouce {
    @Test
    public void listResource(){
        given().
                log().all().
        when().
                get("https://reqres.in/api/unknown").
        then().
                log().all().
                statusCode(200).
                body("page",equalTo(1),"data[0].color",equalTo("#98B2D1"),
                        "data[1].color",equalTo("#C74375"),"data[2].color",equalTo("#BF1932"));

    }
}
