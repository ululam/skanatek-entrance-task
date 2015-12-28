package se.skanatek.entrancetask.az.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.support.FindBy;

/**
 * @author alexey.zakharchenko@gmail.com
 */
@DefaultUrl("http://localhost:8000/login")
public class LoginPage extends PageObject {
    @FindBy(id="loginEmail")
    WebElementFacade loginEmail;
    @FindBy(id="loginPassword")
    WebElementFacade loginPassword;
    @FindBy(id="loginButton")
    WebElementFacade submitButton;


    public void doLogIn(String login, String password) {
        loginEmail.type(login);
        loginPassword.type(password);
        submitButton.click();
    }

    public String getLoginResultText() {
        WebElementFacade div = $("#helloDiv");

        return div == null ? "" : div.getText();
    }
}
