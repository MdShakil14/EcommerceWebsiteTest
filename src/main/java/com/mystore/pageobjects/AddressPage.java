package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseClass {
    Action action = new Action();

    public AddressPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "button[name='processAddress'] span")
    WebElement check_out_btn;

    public ShippingPage clickOnProceedToCheckOut(){
        action.click(driver,check_out_btn);
        return new ShippingPage();
    }

}
