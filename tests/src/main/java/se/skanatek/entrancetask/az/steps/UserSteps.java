package se.skanatek.entrancetask.az.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import se.skanatek.entrancetask.az.pages.LoginPage;


/**
 * @author alexey.zakharchenko@gmail.com
 */
public class UserSteps extends ScenarioSteps {
    LoginPage loginPage;

    @Step
    public void visitWebApp(String url) {
//      @todo Remove line
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\skanatek\\skanatek-entrance-task\\tests\\lib\\chromedriver.exe");

//        loginPage.open();
        loginPage.open(url);
    }


    @Step
    public void logIn(String email, String password) {
        loginPage.doLogIn(email, password);
    }

    @Step
    public void checkUserSeeUsername(String name) {
        String text = loginPage.getLoginResultText();
        String expected = "Welcome, " + name;
        // Have some troubles with std assertThat() here - it is ignored by mvn run
        if (!text.equals(expected))
            throw new AssertionError("Expected " + expected + ", found " + text);
    }
}
