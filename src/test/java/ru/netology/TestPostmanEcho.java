package ru.netology;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

class TestPostmanEcho {
        @Test
        void shouldReturnDemoAccounts() {

            given()
                    .baseUri("https://postman-echo.com")
                    .body("some data")
                    .when()
                    .post("/post")
                    .then()
                    .statusCode(200)
                    .body("data", equalTo("some data"))
            ;
        }
    }
