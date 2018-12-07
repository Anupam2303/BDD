package Steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class TestRest {
    @Test
    public void GetWeatherDetailsCondensed()
    {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a GET request call directly by using RequestSpecification.get() method.
        // Make sure you specify the resource name.
        Response response = httpRequest.get("/Hyderabad");

        // Response.asString method will directly return the content of the body
        // as String.
        System.out.println("Response Body is =>  " + response.asString());
    }
}
