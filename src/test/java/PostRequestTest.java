import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostRequestTest {

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://generator.swagger.io";

        String requestBody = "{\n" +
                "  \"spec\": {},\n" +
                "  \"options\": {\n" +
                "    \"additionalProp1\": \"example1\",\n" +
                "    \"additionalProp2\": \"example2\",\n" +
                "    \"additionalProp3\": \"example3\"\n" +
                "  },\n" +
                "  \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n" +
                "  \"authorizationValue\": {\n" +
                "    \"value\": \"example value\",\n" +
                "    \"type\": \"example type\",\n" +
                "    \"keyName\": \"example keyname\",\n" +
                "    \"urlMatcher\": {}\n" +
                "  },\n" +
                "  \"usingFlattenSpec\": true,\n" +
                "  \"securityDefinition\": {\n" +
                "    \"type\": \"example4\",\n" +
                "    \"description\": \"description example\"\n" +
                "  }\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/api/gen/clients/ada")
                .then()
                .extract()
                .response();

        int statusCode = response.getStatusCode();
        System.out.println("POST Status Code: " + statusCode);

        if (statusCode == 200) {
            System.out.println("POST Request Successful");
        } else {
            System.out.println("POST Request Failed!");
            System.out.println("Response Body: " + response.getBody().asString());
        }

        Assert.assertEquals("POST Request Failed! Status code is not 200.", 200, statusCode);
    }
}
