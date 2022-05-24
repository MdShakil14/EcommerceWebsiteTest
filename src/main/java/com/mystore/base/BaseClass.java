package com.mystore.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public static Properties properties ;
    public static WebDriver driver;

    public void loadConfig() throws IOException {
        properties = new Properties();
        System.out.println("Super constructor invoked");
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
        properties.load(fis);
        System.out.println("driver"+ driver);

    }

    public void launchApp(){

        String browserName = properties.getProperty("browser");
        if (browserName.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
        }else if(browserName.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
        }else if(browserName.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
        }



    }

}
