package Homework;

/**
 * Created with IntelliJ IDEA.
 * User: Lazarenok
 * Date: 08.07.13
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */

import org.openqa.selenium.By;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created with IntelliJ IDEA.
 * User: C13T
 * Date: 26.06.13
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */
public class FirstTest extends BasicTest {

    @Test
    public  void LoginNormalFlow() {
        driver.get("https://www.buxfer.com/");
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();
        WebElement searchField = driver.findElement(By.id("login_username"));
        searchField.sendKeys("lazarenok@i.ua");
        WebElement passwordField = driver.findElement(By.id("login_password"));
        passwordField.sendKeys("020406");
        WebElement loginbutton2 = driver.findElement(By.linkText("Login"));
        loginbutton2.click();
        driver.manage().window().maximize();
        WebElement account = driver.findElement(By.id("header-account-h"));
        account.click();
        WebElement logoutButton = driver.findElement(By.id("header-account-12"));
        logoutButton.click();
    }


}