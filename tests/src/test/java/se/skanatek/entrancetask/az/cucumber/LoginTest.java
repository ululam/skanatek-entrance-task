package se.skanatek.entrancetask.az.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="src/test/resources/features/login/Login.feature")
@CucumberOptions(features="classpath:features/login/Login.feature")
public class LoginTest {
}
