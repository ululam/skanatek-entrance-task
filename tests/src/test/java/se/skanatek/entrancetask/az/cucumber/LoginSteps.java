package se.skanatek.entrancetask.az.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import se.skanatek.entrancetask.az.steps.UserSteps;

/**
 * @author alexey.zakharchenko@gmail.com
 */
// Basic login into the user's area
public class LoginSteps {
    @Steps
    UserSteps userSteps;

    @Given("I visit '(.*)'")
    public void userVisitsWebApp(String url) {
        userSteps.visitWebApp(url);
    }

    @When("I log in using email '(.*)' and password '(.*)'")
    public void userLogsIn(String email, String password) {
        userSteps.logIn(email, password);
    }


    @Then("I should see the text 'Welcome, (.*)'")
    public void userShouldSeeHisUsername(String name) {
        userSteps.checkUserSeeUsername(name);
    }
}
