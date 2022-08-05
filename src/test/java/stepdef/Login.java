package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import commonFunctions.CommonUtils;

public class Login {

    @Given("user has launched the url for Amazon")
    public void user_has_launched_the_url_for_amazon() {
        CommonUtils util = new CommonUtils();
        util.launchBrowser("url_amazon");
    }

    @When("user has entered credentials")
    public void user_has_entered_credentials() {


    }

    @Then("user has successfully authenticated")
    public void user_has_successfully_authenticated() {

    }

}
