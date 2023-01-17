package Test;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        System.out.println(driver.findElement(By.cssSelector("p[class='pull-left']")).getText());

        if(driver.findElement(By.cssSelector("p[class='pull-left']")).getText().equals("Copyright © 2021 All rights reserved")) System.out.println("Footer Test has PASSED");
        else System.out.println("Footer Test has FAILED");

        Driver.quitDriver();
    }
}
