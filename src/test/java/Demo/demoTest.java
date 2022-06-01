package Demo;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoTest {



    @Test
    public void scrollDown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,500)");
    }

    @Test
    public void scrollIntoView(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//li[@class='htmlcontent-item-4 col-xs-4']//img[@class='item-img']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView()",element);
    }

    @Test
    public void click(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@title='Log in to your customer account']"))).click().build().perform();


    }
}
