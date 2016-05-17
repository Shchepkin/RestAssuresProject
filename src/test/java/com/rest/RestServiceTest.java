package com.rest;


import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

public class RestServiceTest {
    @Test
    public void getStatusPage() {
        RestAssured.baseURI = "https://google.com";
        expect().statusCode(200);
        when().get("");
    }

    @Test
    public void getStatusPageOne() {
                given().
                        baseUri("https://google.com").
                when().get("").
                then().statusCode(200);

    }
}
