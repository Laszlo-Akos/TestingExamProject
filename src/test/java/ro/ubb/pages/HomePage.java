package ro.ubb.pages;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("https://www.bikermag.ro/")
public class HomePage extends PageObject{

    @FindBy(xpath="/html/body/div[2]/header/div[2]/div/div/div[3]/ul/li[2]/a")
    private WebElementFacade toAccount;

    @FindBy(name="email")
    private WebElementFacade emailTextBox;
    @FindBy(name="password")
    private WebElementFacade passwordTextBox;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div/div[3]/form/a[1]")
    private WebElementFacade loginButton;

    @FindBy(name="c")
    private WebElementFacade searchBar;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div[2]/form/button")
    private WebElementFacade searchButton;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/h2")
    private WebElementFacade firstProduct;

    @FindBy(xpath = "//*[@id=\"result-page\"]")
    private WebElementFacade noItemFoundMessage;

    public void toAccount() {
        toAccount.click();
    }

    public void typeEmail(String email) {
        emailTextBox.type(email);
    }

    public void typePassword(String password){
        passwordTextBox.type(password);
    }

    public void login(){
        loginButton.click();
    }

    public void searchFor(String word){
        searchBar.type(word);
    }

    public void doSearch(){
        searchButton.click();
    }


    public String getFirstProductText(){


        return firstProduct.getText();
    }

    public String getNoProductFoundMesssage(){
        return noItemFoundMessage.getText();
    }


}
