package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BaseClass {
    Action action = new Action();

    public AddToCartPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#quantity_wanted")
    private WebElement quantity;
    @FindBy(css = "#group_1")
    private WebElement size;
    @FindBy(css = "button[name='Submit'] span")
    private WebElement addToCartBtn;
    @FindBy(xpath = "//i[@class='icon-ok']")
    private WebElement addToCartMsg;
    @FindBy(css = "a[title='Proceed to checkout'] span")
    private WebElement proceedToCheckOut;

    public void enterQuantity(String lquantity){
        action.type(quantity,lquantity);
    }

    public void selectSize(String lsize){
        action.selectByVisibleText(lsize,size);
    }

    public void clickAddToCart(){
        action.click(driver,addToCartBtn);
    }

    public boolean validateAddToCart(){
        return action.isDisplayed(driver,addToCartMsg);
    }

    public OrderPage validateProceedToCheckOut(){
        action.JSClick(driver,proceedToCheckOut);
        return new OrderPage();
    }
}
