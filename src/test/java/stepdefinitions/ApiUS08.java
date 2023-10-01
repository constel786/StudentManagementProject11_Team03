package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertTrue;

public class ApiUS08 {

    private static String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiZWRvdGVzdGFkbWluIiwiaWF0IjoxNjk2MDExNjY3LCJleHAiOjE2OTYwMjAzMDd9.NBzNf_1Zd5QsoabHvK6gPxbgRny1uzrX95uQ9k76WTx7l-ug2UYwTj6adOfmwhfAvd2mE-GkLaCe3RaHTLGH4Q";
    private RequestSpecification request;
    private Response response;

    @Given("i am authorized with token {string}")
    public void i_am_authorized_with_token(String string) {



    }
    @Given("the request body is:")
    public void the_request_body_is(String requestBody) {
        request = RestAssured.given().contentType("application/json").body(requestBody);
        // Assuming the token and base URL are hardcoded for simplicity
        request.header("Authorization", "Bearer your_access_token_here");
    }

    @When("I send a POST request to {string}")
    public void i_send_a_post_request_to(String endpoint) {
        String baseURL = "https://managementonschools.com/app";
        response = request.when().post(baseURL + endpoint);
    }

    @Then("the response should contain the lesson details")
    public void the_response_should_contain_the_lesson_details() {
        assertTrue(response.getBody().asString().contains("lessonId"));
        assertTrue(response.getBody().asString().contains("lessonName"));
        assertTrue(response.getBody().asString().contains("creditScore"));
        assertTrue(response.getBody().asString().contains("compulsory"));
    }

}
