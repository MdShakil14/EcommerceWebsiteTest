package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BaseClass{
    Action action = new Action();
    public OrderConfirmationPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//strong[normalize-space()='Your order on My Store is complete.']")
    WebElement confirmationText;

    public boolean validateConfirmOrder(){
        return action.isDisplayed(driver,confirmationText);
    }
    public String validateConfirmMessage() {
        String confirmMsg = confirmationText.getText();
        return confirmMsg;
    }
}
