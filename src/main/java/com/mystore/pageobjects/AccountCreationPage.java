package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPage extends BaseClass {

    Action action = new Action();

    public AccountCreationPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement fromTitle;
    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElement mr;
    @FindBy(xpath = "//div[@id='uniform-id_gender2']")
    WebElement mrs;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement customer_firstName;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement customer_lastName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement customer_email;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement customer_password;
    @FindBy(id = "days")
    WebElement customer_birthDay;
    @FindBy(id = "months")
    WebElement customer_birthMonth;
    @FindBy(id = "years")
    WebElement customer_birthYear;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement address_firstName;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement address_lassName;
    @FindBy(xpath = "//input[@id='company']")
    WebElement customer_company;
    @FindBy(name = "address1")
    WebElement customer_address1;
    @FindBy(name = "address2")
    WebElement customer_address2;
    @FindBy(name = "city")
    WebElement customer_city;
    @FindBy(name = "id_state")
    WebElement customer_state;
    @FindBy(name = "postcode")
    WebElement customer_postcode;
    @FindBy(name = "id_country")
    WebElement customer_country;
    @FindBy(name = "phone")
    WebElement customer_homePhone;
    @FindBy(name = "phone_mobile")
    WebElement customer_mobilePhone;
    @FindBy(name = "alias")
    WebElement customer_reference;
    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement register_btn;

    public boolean validateAccountCreatePage(){
        return action.isDisplayed(driver,fromTitle);
    }

    public void createAccount(String gender,String firstName,
                              String lastName,
                              String password,
                              String day,
                              String month,
                              String year,
                              String company,
                              String address,
                              String city,
                              String state,
                              String postcode,
                              String country,
                              String mobilePhone){

        if(gender.equalsIgnoreCase("Mr")){
            action.click(driver,mr);
        }else{
            action.click(driver,mrs);
        }

        action.type(customer_firstName,firstName);
        action.type(customer_lastName,lastName);
        action.type(customer_password,password);
        action.selectByValue(customer_birthDay,day);
        action.selectByValue(customer_birthMonth,month);
        action.selectByValue(customer_birthYear,year);
        action.type(customer_company,company);
        action.type(customer_address1,address);
        action.type(customer_city,city);
        action.selectByVisibleText(state,customer_state);
        action.type(customer_postcode,postcode);
        action.selectByVisibleText(country,customer_country);
        action.type(customer_mobilePhone,mobilePhone);


    }

    public HomePage validateRegistration(){
        action.click(driver,register_btn);
        return new HomePage();
    }



}
