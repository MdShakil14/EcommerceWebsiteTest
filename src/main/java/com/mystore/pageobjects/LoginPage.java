package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    Action action = new Action();

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    WebElement userName;
    @FindBy(id = "passwd")
    WebElement password;
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement signButton;
    @FindBy(id = "email_create")
    WebElement emailForNewAccount;
    @FindBy(css = "button[id='SubmitCreate'] span")
    WebElement createNewAccountButton;

    public HomePage login(String uName, String pswd){
        action.type(userName,uName);
        action.type(password,pswd);
        action.click(driver,signButton);
        return new HomePage();

    }

    public AccountCreationPage createNewAccount(String newEmail){
        action.type(emailForNewAccount,newEmail);
        return new AccountCreationPage();
    }


}
