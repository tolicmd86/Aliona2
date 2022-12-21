package automation.stepDef;


import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;


public class LoginSteps extends BaseSteps{
    @Given("user navigate to the login page")
    public void user_navigate_to_the_login_page() {

        loginPage.openWebSite();

    }
    @When("user verify login page it's displayed")
    public void user_verify_login_page_it_s_displayed() {
        loginPage.verifyLoginPage();
    }
    @When("user enters the valid username and password")
    public void user_enters_the_valid_username_and_password() {

        loginPage.doLogin();
        loginPage.submitButton();

    }


}
