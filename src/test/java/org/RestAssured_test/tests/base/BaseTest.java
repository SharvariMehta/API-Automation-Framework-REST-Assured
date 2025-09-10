package org.RestAssured_test.tests.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.RestAssured_main.endpoints.APIConstants;
import org.RestAssured_main.modules.PayloadManager;
import org.RestAssured_test.tests.asserts.AssertActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;

    @BeforeMethod
    public void setup(){
        System.out.println("Test Execution is Started");
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type", "application/json")
                .build().log().all();
    }

    public String getToken() {
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri(APIConstants.BASE_URL)
                .basePath(APIConstants.AUTH_URL);
        String payload = payloadManager.setAuthPayload();
        response = requestSpecification.contentType(ContentType.JSON).body(payload).when().post();
        String token = payloadManager.getTokenFromJSON(response.asString());
        return token;
    }

    @AfterMethod
    public void teardown(){
        System.out.println("Test Execution Finished");
    }
}
