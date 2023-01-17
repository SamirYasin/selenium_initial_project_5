package Test;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testCase1 {
    // Validate Automation Exercise site logo
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        if(driver.findElement(By.cssSelector(".logo")).isDisplayed()) System.out.println("Logo Validation has PASSED");
        else System.out.println("Logo validation has FAILED");

        Driver.quitDriver();
    }
}
