package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import commonFunctions.CommonUtils;

public class ToolsQADemo {

    @Given("verify user is able to fetch account details")
    public void verify_user_is_able_to_fetch_account_details() {
        RestAssured.baseURI = CommonUtils.getValue("url");
        Response response = RestAssured.given().get();
    }
    @When("user enter the resource details")
    public void user_enter_the_resource_details() {

    }

    @Then("user will see a response with account details")
    public void user_will_see_a_response_with_account_details() {

    }
}