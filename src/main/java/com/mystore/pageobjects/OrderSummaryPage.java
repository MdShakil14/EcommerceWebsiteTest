package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage extends BaseClass {
    Action action = new Action();

    public OrderSummaryPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='I confirm my order']")
    WebElement confirm_orderBtn;

    public void clickConfirm_order_btn(){
        action.click(driver,confirm_orderBtn);
    }
}
