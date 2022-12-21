package automation.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends BaseSteps{
    @Then("user verify home page it's displayed")
    public void user_verify_home_page_it_s_displayed() {

        homePage.verifyUserIsOnHomePage();
    }
    @When("user clicks on profile menu link")
    public void user_clicks_on_profile_menu_link() {

    }
}
