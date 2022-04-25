package tests;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ListUsers {
    @Test
    public void listUsers(){
       given().
               log().all().
       when().
                get("https://reqres.in/api/users?page=2").
       then().
               log().all().
               statusCode(200).
               body("page",equalTo(2),"data[0].id",equalTo(7),"data[0].last_name",equalTo("Lawson"),
                       "data[1].last_name",equalTo("Ferguson"),"data[2].last_name",equalTo("Funke"));



    }


}
