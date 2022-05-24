package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    Action action = new Action();

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='My wishlists']")
    WebElement wishList;

    @FindBy(xpath = "//span[normalize-space()='Order history and details']")
    WebElement orderHistory;

    public boolean validateMyWishList(){
        return action.isDisplayed(driver,wishList);

    }

    public boolean validateOrderHistory(){
        return action.isDisplayed(driver,orderHistory);
    }

}
