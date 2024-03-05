package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class testingApi {

    private static RequestSpecification req;
    private static Response res;

    @Test
    public void getUser(){
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "64dc4ca440e42010ace619a0");
        res = req.get("https://dummyapi.io/data/v1/user");

        String firstId = res.jsonPath().getString("data[0].id");

        assertThat(firstId).isNotNull();
    }


    @Test
    public void postCreate(){
        System.out.println("Test 2");
    }
}
