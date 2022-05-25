package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseClass {

    Action action = new Action();

    public SearchResultPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    WebElement productResult;

    public boolean validateProductAvailability(){
        return action.isDisplayed(driver,productResult);
    }

    public AddToCartPage clickOnProduct(){
        action.click(driver,productResult);
        return new AddToCartPage();
    }
}
