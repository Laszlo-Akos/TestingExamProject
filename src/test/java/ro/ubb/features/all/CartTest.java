package ro.ubb.features.all;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ro.ubb.steps.serenity.EndUserSteps;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    @Test
    public void AddToCart()
    {
        anna.openProductPage();
        anna.addToCart();
        anna.addToCart();
        anna.openHomepage();
        anna.openCart();
        assertTrue(anna.getCartNotEmptyMsg().contains("PRODUSELE TALE"));
    }

    @Test
    public void DeleteFromCart()
    {
        getDriver().manage().window().maximize();
        anna.openProductPage();
        anna.addToCart();
        anna.addToCart();
        anna.openHomepage();
        anna.openCart();
        anna.deleteItem();
        assertTrue(anna.getCartEmptyMsg().contains("Nu exista"));

    }
}
