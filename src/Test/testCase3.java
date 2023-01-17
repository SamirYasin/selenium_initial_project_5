package Test;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        if(!driver.findElement(By.cssSelector(".single-widget")).isDisplayed()) System.out.println("Subscription form test has FAILED");
        else if(!driver.findElement(By.id("susbscribe_email")).isDisplayed() | !driver.findElement(By.cssSelector("[placeholder]")).getAttribute("placeholder").equals("Your email address")) System.out.println("Subscription form test has FAILED");
        else if(!driver.findElement(By.cssSelector("#subscribe")).isDisplayed())System.out.println("Subscription form test has FAILED");
        else if(!driver.findElement(By.cssSelector(".searchform p")).isDisplayed()) System.out.println("Subscription form test has FAILED");
        else System.out.println("Subscription form test has PASSED");

        Driver.quitDriver();
    }


}
