package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {

    Action action = new Action();

    public IndexPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signInBtn;

    @FindBy(id = "search_query_top")
    WebElement searchProductBox;

    @FindBy(name = "submit_search")
    WebElement searchButton;

    @FindBy(xpath = "//img[@alt='My Store']")
    WebElement myStoreLogo;

    public LoginPage clickOnSignIn(){
        action.click(driver,signInBtn);
        return new LoginPage();
    }

    public boolean validateLogo(){
        return action.isDisplayed(driver,myStoreLogo);
    }

    public String getMyStoreTitle(){
        return driver.getTitle();
    }

    public SearchResultPage searchProduct(String searchKey){
        action.type(searchProductBox,searchKey);
        action.click(driver,searchButton);
        return new SearchResultPage();
    }





}
