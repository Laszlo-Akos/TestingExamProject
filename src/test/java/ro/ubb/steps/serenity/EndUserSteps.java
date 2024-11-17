package ro.ubb.steps.serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import ro.ubb.pages.HomePage;
import net.thucydides.core.annotations.Step;
import ro.ubb.pages.ProductPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    HomePage homePage;
    ProductPage productPage;

    @Step
 public void openHomepage(){
        homePage.open();
    }

    @Step
    public void goToAccount() {
       homePage.toAccount();
    }

    @Step
    public void enterEmail(String email){
        homePage.typeEmail(email);
    }
    @Step
    public void enterPassword(String password){
        homePage.typePassword(password);
    }

    @Step
    public void login(){
        homePage.login();
    }


    @Step
    public void searchFor(String word){
        homePage.searchFor(word);
    }

    @Step
    public void doSearch(){
        homePage.doSearch();
    }

    @Step
    public String getFirstElementText(){

        return homePage.getFirstProductText();
    }

    @Step
    public String noItemFound(){
       return homePage.getNoProductFoundMesssage();
    }

    @Step
    public void openProductPage(){
        productPage.open();
    }
    @Step
    public void addToCart(){
        productPage.addToCart();
    }

    @Step
    public void openCart(){
        productPage.openCart();
    }

    @Step
    public String getCartNotEmptyMsg(){
        return productPage.getCartNotEmptyMessage();
    }

    @Step
    public void deleteItem(){
        productPage.deleteItem();
    }

    @Step
    public String getCartEmptyMsg(){
        return productPage.getCartEmptyMessage();
    }
}