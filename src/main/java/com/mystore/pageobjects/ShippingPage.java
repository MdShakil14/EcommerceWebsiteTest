package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BaseClass {
    Action action = new Action();
    public ShippingPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "cgv")
    WebElement checkBox;
    @FindBy(css = "button[name='processCarrier'] span")
    WebElement proceedToCheckOutBtn;

    public void clickCheckBox(){
        action.click(driver,checkBox);
    }

    public PaymentPage clickOnProceedToCheckOut(){
        action.click(driver,proceedToCheckOutBtn);
        return new PaymentPage();
    }
}
