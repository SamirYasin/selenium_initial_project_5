package Test;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class testCase2 {
    public static void main(String[] args) {
        //Test Case 2: Validate Automation Exercise site header items

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        List<WebElement> headerItems = driver.findElements(By.cssSelector(".navbar-nav li"));

        for (WebElement headerItem : headerItems) {
            if(!headerItem.isDisplayed() | !headerItem.isEnabled()) System.out.println("Header items validation test has FAILED as the header item " + headerItem + " is not displayed or enabled");
            else System.out.println("Header item validation test has PASSED for the header item " + headerItem);
        }
        Driver.quitDriver();

    }
}
