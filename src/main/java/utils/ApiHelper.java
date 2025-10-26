package utils;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class ApiHelper {

    private String baseUri;


    public ApiHelper(String baseUri) {
        this.baseUri = baseUri;
        RestAssured.baseURI = baseUri;
    }

    // -------------------- CREATE --------------------
    public Response createUser(String endpoint, Map<String, String> headers, Object payload) {
        return RestAssured.given()
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    // -------------------- READ --------------------
    public Response get(String endpoint, Map<String, String> headers) {
        return RestAssured.given()
                .headers(headers)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    // -------------------- UPDATE --------------------
    public Response put(String endpoint, Map<String, String> headers, Object payload) {
        return RestAssured.given()
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    // -------------------- DELETE --------------------
    public Response delete(String endpoint, Map<String, String> headers) {
        return RestAssured.given()
                .headers(headers)
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }
}
