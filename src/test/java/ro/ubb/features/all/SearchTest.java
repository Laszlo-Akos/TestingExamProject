package ro.ubb.features.all;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import ro.ubb.steps.serenity.EndUserSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("D:\\Egyetem\\INFO\\Testare\\Lab\\ProiectBiker\\src\\test\\resources\\searchData.csv")
public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;
    String word, expected, result;

    @Issue("#Search")
    @Test
    public void search_Product() {
        getDriver().manage().window().maximize();
        anna.openHomepage();
        anna.searchFor(word);
        anna.doSearch();
        if (result.equals("ExistentProduct")) {
            ((JavascriptExecutor) webdriver).executeScript("window.scrollBy(0,200);");
            assertTrue(anna.getFirstElementText().contains(expected));
        } else {
            assertTrue(anna.noItemFound().contains(expected));

        }


    }
}