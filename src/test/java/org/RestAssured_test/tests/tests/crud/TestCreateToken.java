package org.RestAssured_test.tests.tests.crud;

import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.RestAssured_main.endpoints.APIConstants;
import org.RestAssured_main.pojos.response.TokenResponse;
import org.RestAssured_test.tests.base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.requestSpecification;

public class TestCreateToken extends BaseTest {
    @Test(description = "TC#1 - Verify that Token can be Created", groups = "reg", priority = 1)
    @Owner("SharvariMehta")
    public void testCreateToken() {

        requestSpecification.basePath(APIConstants.AUTH_URL);
        //Using Serialization
        response = RestAssured.given(requestSpecification).when().body(payloadManager.setAuthPayload()).log().all().post();
        System.out.println(response.asString());

        // Extraction ( JSON String response to Java Object)
        //Using Deserialization
        String token = payloadManager.getTokenFromJSON(response.asString());
        System.out.println(token);

        // Validation of the request.
        assertActions.verifyStringKeyNotNull(token);


    }
}
