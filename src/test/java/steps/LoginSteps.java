package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.LoginPageObject;
import utils.BaseSteps;

public class LoginSteps extends BaseSteps {


    private BaseSteps base;
    private LoginPageObject loginPage;

    public LoginSteps(BaseSteps base) {
        this.base = base;
        loginPage = new LoginPageObject(base.driver);
    }

    @Given("^I go to navigate$")
    public void i_go_to_navigate() {
        loginPage.navigateTo();
    }

    @When("^I login website$")
    public void i_login_website() {
        System.out.println("deneme132");

    }

    @Then("^I should see login website$")
    public void i_should_see_login_website() {
        System.out.println("deneme132");

    }
}
