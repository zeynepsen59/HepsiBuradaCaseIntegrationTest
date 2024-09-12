import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequestTest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://generator.swagger.io";

        Response response = given()
                .header("access-control-allow-headers", "Content-Type")
                .header("access-control-allow-methods", "GET,POST,DELETE,PUT")
                .header("access-control-allow-origin", "*")
                .header("content-type", "application/json")
                .when()
                .get("/api/gen/servers")
                .then()
                .extract()
                .response();

        int statusCode = response.getStatusCode();
        System.out.println("GET Status Code: " + statusCode);

        Assert.assertEquals("GET Request Failed!", 200, statusCode);
        System.out.println("GET Request Successful");
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
