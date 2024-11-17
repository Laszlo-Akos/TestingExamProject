package ro.ubb.pages;


import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://www.bikermag.ro/suporti-smartphone-si-tablete/suport-telefon-ram-mount-x-grip-stem-kit.html")
public class ProductPage extends PageObject{
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div[1]/div[3]/div[6]/a")
    private WebElementFacade addToCartButton;

    @FindBy (xpath = "/html/body/div[2]/header/div[2]/div/div/div[3]/ul/li[5]")
    private WebElementFacade cartButton;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/ul[1]/li[1]")
    private WebElementFacade cartNotEmptyMessage;

    @FindBy (xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/ul[2]/li/div[2]/a[2]")
    private WebElementFacade deleteItemButton;

    @FindBy (xpath = "/html/body/div[1]/div[3]/p")
    private WebElementFacade cartEmptyMsg;
    public void addToCart(){
        addToCartButton.click();
    }

    public void openCart(){
        cartButton.click();
    }


    public String getCartNotEmptyMessage(){
        return cartNotEmptyMessage.getText();
    }

    public void deleteItem(){
        deleteItemButton.click();
    }

    public String getCartEmptyMessage(){
       return cartEmptyMsg.getText();
    }

}
