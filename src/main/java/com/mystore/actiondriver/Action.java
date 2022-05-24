package com.mystore.actiondriver;

import com.mystore.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Action extends BaseClass implements actionInterface{
    @Override
    public void scrollByVisibilityOfElement(WebDriver ldriver, WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView()",element);
    }
    @Override
    public void scrollDown(WebDriver driver,WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,350)");
    }
    @Override
    public void click(WebDriver driver,WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    @Override
    public boolean isDisplayed(WebDriver ldriver, WebElement ele) {
        boolean flag = false;
        flag  = findElement(ldriver,ele);

        if(flag){
            flag = ele.isDisplayed();
            if(flag){
                System.out.println("The element is displayed");
            }else {
                System.out.println("The element is not displayed");
            }
        }else {
            System.out.println("Not displayed");
        }
        return flag;
    }

    @Override
    public boolean type(WebElement ele, String text) {
        return false;
    }

    public boolean findElement(WebDriver driver, WebElement element){
        boolean flag = false;
        try {
            element.isDisplayed();
            flag = true;
        }catch (Exception e){
            flag = false;
        }finally {
            if (flag){
                System.out.println("Successfully Found element at");
            }else {
                System.out.println("Unable to locate element at");
            }
        }

        return flag;
    }

    @Override
    public boolean isSelected(WebDriver ldriver, WebElement ele) {
        boolean flag = false;
        flag = findElement(ldriver,ele);
        if (flag){
            flag = ele.isSelected();
            if (flag){
                System.out.println("The element is Selected");
            }else {
                System.out.println("The element is not Selected");
            }
        }else {
            System.out.println("Not selected ");
        }
        return flag;
    }

    @Override
    public boolean isEnabled(WebDriver ldriver, WebElement ele) {
        boolean flag = false;
        flag = findElement(driver, ele);
        if (flag) {
            flag = ele.isEnabled();
            if (flag) {
                System.out.println("The element is Enabled");
            } else {
                System.out.println("The element is not Enabled");
            }
        } else {
            System.out.println("Not Enabled ");
        }
        return flag;
    }

    @Override
    public boolean selectBySendkeys(String value, WebElement ele) {
        boolean flag = false;
        try {
            ele.sendKeys(value);
            flag = true;
            return true;
        } catch (Exception e) {

            return false;
        } finally {
            if (flag) {
                System.out.println("Select value from the DropDown");
            } else {
                System.out.println("Not Selected value from the DropDown");
                // throw new ElementNotFoundException("", "", "")
            }
        }
    }

    @Override
    public boolean selectByIndex(WebElement element, int index) {
        boolean flag = false;
        try {
            Select s = new Select(element);
            s.selectByIndex(index);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by Index");
            } else {
                System.out.println("Option not selected by Index");
            }
        }
    }

    @Override
    public boolean selectByValue(WebElement element, String value) {
        boolean flag = false;
        try {
            Select s = new Select(element);
            s.selectByValue(value);
            flag = true;
            return true;
        } catch (Exception e) {

            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by Value");
            } else {
                System.out.println("Option not selected by Value");
            }
        }
    }

    @Override
    public boolean selectByVisibleText(String visibletext, WebElement ele) {
        boolean flag = false;
        try {
            Select s = new Select(ele);
            s.selectByVisibleText(visibletext);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Option selected by VisibleText");
            } else {
                System.out.println("Option not selected by VisibleText");
            }
        }
    }

    @Override
    public boolean mouseHoverByJavaScript(WebElement locator) {
        return false;
    }

    @Override
    public boolean JSClick(WebDriver driver, WebElement ele) {
        return false;
    }

    @Override
    public boolean switchToFrameByIndex(WebDriver driver, int index) {
        return false;
    }

    @Override
    public boolean switchToFrameById(WebDriver driver, String idValue) {
        return false;
    }

    @Override
    public boolean switchToFrameByName(WebDriver driver, String nameValue) {
        return false;
    }

    @Override
    public boolean switchToDefaultFrame(WebDriver driver) {
        return false;
    }

    @Override
    public void mouseOverElement(WebDriver driver, WebElement element) {

    }

    @Override
    public boolean moveToElement(WebDriver driver, WebElement ele) {
        return false;
    }

    @Override
    public boolean mouseover(WebDriver driver, WebElement ele) {
        return false;
    }

    @Override
    public boolean draggable(WebDriver driver, WebElement source, int x, int y) {
        return false;
    }

    @Override
    public boolean draganddrop(WebDriver driver, WebElement source, WebElement target) {
        return false;
    }

    @Override
    public boolean slider(WebDriver driver, WebElement ele, int x, int y) {
        return false;
    }

    @Override
    public boolean rightclick(WebDriver driver, WebElement ele) {
        return false;
    }

    @Override
    public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
        return false;
    }

    @Override
    public boolean switchToNewWindow(WebDriver driver) {
        return false;
    }

    @Override
    public boolean switchToOldWindow(WebDriver driver) {
        return false;
    }

    @Override
    public int getColumncount(WebElement row) {
        return 0;
    }

    @Override
    public int getRowCount(WebElement table) {
        return 0;
    }

    @Override
    public boolean Alert(WebDriver driver) {
        return false;
    }

    @Override
    public boolean launchUrl(WebDriver driver, String url) {
        return false;
    }

    @Override
    public boolean isAlertPresent(WebDriver driver) {
        return false;
    }

    @Override
    public String getCurrentURL(WebDriver driver) {
        return null;
    }

    @Override
    public String getTitle(WebDriver driver) {
        return null;
    }

    @Override
    public boolean click1(WebElement locator, String locatorName) {
        return false;
    }

    @Override
    public void fluentWait(WebDriver driver, WebElement element, int timeOut) {

    }

    @Override
    public void implicitWait(WebDriver driver, int timeOut) {

    }

    @Override
    public void explicitWait(WebDriver driver, WebElement element, int timeOut) {

    }

    @Override
    public void pageLoadTimeOut(WebDriver driver, int timeOut) {

    }

    @Override
    public String screenShot(WebDriver driver, String filename) {
        return null;
    }

    @Override
    public String getCurrentTime() {
        String currentDate  = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
        return currentDate;
    }

}
