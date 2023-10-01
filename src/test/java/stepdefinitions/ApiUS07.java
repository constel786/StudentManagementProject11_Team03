package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;

import java.util.Map;

public class ApiUS07 {

    private RequestSpecification requestSpecification;
    private Response response;
    private String baseURL;
    private String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiZWRvdGVzdGFkbWluIiwiaWF0IjoxNjk2MTU2NTQ4LCJleHAiOjE2OTYxNjUxODh9.IX9IfuAALQLsFpEsrz6WvuEDMNZW1qaeJYxgalfJM67DX6aPLmRhrZzWzPhSJnSOb-iKp6TCLKL7Ylq5DRFRqw";
    private String endpoint = "https://managementonschools.com/app/contactMessages/getAll?page=10&size=10&sort=date&type=desc";
    @Given("I am authorized with credentials {string} and {string}")
    public void i_am_authorized_with_credentials_and(String username, String password) {

        requestSpecification = RestAssured.given().contentType(ContentType.JSON)
                .auth().preemptive().basic(username, password);

    }

    @Given("The base URL is {string}")
    public void the_base_url_is(String baseURL) {
        this.baseURL = baseURL;
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = requestSpecification.when().get(baseURL + endpoint);
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(Integer expectedStatus) {
        response.then().statusCode(expectedStatus);
    }

    @Then("the response should have a message with:")
    public void the_response_should_have_a_message_with(DataTable dataTable) {
        Map<String, String> expectedData = dataTable.asMap(String.class, String.class);

        boolean isMessagePresent = response.jsonPath().getList("$")
                .stream()
                .anyMatch(message -> messageMatchesExpectedData((Map<String, Object>) message, expectedData));

        Assertions.assertTrue(isMessagePresent, "The response should contain the expected message");
    }


    private boolean messageMatchesExpectedData(Map<String, Object> actualData, Map<String, String> expectedData) {
        return expectedData.entrySet().stream().allMatch(entry ->
                actualData.containsKey(entry.getKey()) &&
                        actualData.get(entry.getKey()).toString().equals(entry.getValue())
        );
    }
}
