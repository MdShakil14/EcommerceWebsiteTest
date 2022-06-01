package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderPage extends BaseClass {

    Action action = new Action();
    public OrderPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "span[id='product_price_1_1_0'] span[class='price']")
    WebElement unit_price;
    @FindBy(css = "#total_price")
    WebElement total_price;
    @FindBy(css = "a[class='button btn btn-default standard-checkout button-medium'] span")
    WebElement check_out_btn;

    public Double getUnitPrice(){
        String unitPrice1 = unit_price.getText();
        String unitPrice2 = unitPrice1.replaceAll("[^a-zA-Z0-9]","");
        Double unitPrice = Double.parseDouble(unitPrice2);
        return unitPrice/100;
    }
    public Double getTotalPrice(){
        String totalPrice1=total_price.getText();
        String tot=totalPrice1.replaceAll("[^a-zA-Z0-9]","");
        double finalTotalPrice=Double.parseDouble(tot);
        return finalTotalPrice/100;
    }

    public LoginPage clickOnCheckOut(){
        action.click(driver,check_out_btn);
        return new LoginPage();
    }
}
