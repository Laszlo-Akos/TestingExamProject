package ro.ubb.features.all;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import ro.ubb.steps.serenity.EndUserSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("D:\\Egyetem\\INFO\\Testare\\Lab\\ProiectBiker\\src\\test\\resources\\loginData.csv")
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;
    String email,password,expectedvalue;
    @Issue("#WIKI-1")
    @Test
    public void login_test() {
        getDriver().manage().window().maximize();
        anna.openHomepage();
        anna.goToAccount();
        anna.enterEmail(email);
        anna.enterPassword(password);
        anna.login();
        String url =  webdriver.getCurrentUrl();
        assertTrue(url.contains(expectedvalue));

    }

} 