package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Lazarenok
 * Date: 08.07.13
 * Time: 23:51
 * To change this template use File | Settings | File Templates.
 */
public class SecondTest extends BasicTest {
    @Test
    public  void MenuTest() {

        //Open Buxfer website
        driver.get("https://www.buxfer.com/");
        //Check Buxfer website is opened
        String homeURL = driver.getCurrentUrl();
        Assert.assertEquals(homeURL,"https://www.buxfer.com/");

        //Click Login and enter username and password
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();
        String loginURL = driver.getCurrentUrl();
        Assert.assertEquals(loginURL,"https://www.buxfer.com/slogin");

        WebElement searchField = driver.findElement(By.id("login_username"));
        searchField.sendKeys("lazarenok@i.ua");
        WebElement passwordField = driver.findElement(By.id("login_password"));
        passwordField.sendKeys("020406");
        WebElement loginButton2 = driver.findElement(By.linkText("Login"));
        loginButton2.click();

        //Maximize window to make all items visible
        driver.manage().window().maximize();

        //Check that URL corresponds to Home
        WebElement searchTab = driver.findElement(By.id("search"));
        searchTab.click();
        String summaryURL = driver.getCurrentUrl();
        Assert.assertEquals(summaryURL,"https://www.buxfer.com/home#/home");

        //Click on Add Transactions on Menu, click on its icon and check URL
        WebElement addTransaction = driver.findElement(By.id("tab-add_transaction"));
        addTransaction.click();
        WebElement radioButton1 = driver.findElement(By.id("rd-inp-transType-2"));
        radioButton1.click();
        String transactURL = driver.getCurrentUrl();
        Assert.assertEquals(transactURL,"https://www.buxfer.com/home#/transaction/add");

        //Click on Reports on Menu, click on its icon and check URL
        WebElement reports = driver.findElement(By.id("tab-reports"));
        reports.click();
        WebElement reportsImage = driver.findElement(By.id("8a068-2-tab-ic"));
        reportsImage.click();
        String reportsURL = driver.getCurrentUrl();
        Assert.assertEquals(reportsURL,"https://www.buxfer.com/home#/reports");

        //Click on Budgets on Menu, click on its icon and check URL
        WebElement budgets = driver.findElement(By.id("tab-budgets"));
        budgets.click();
        WebElement budgetsImage = driver.findElement(By.id("env-list-tab-ic"));
        budgetsImage.click();
        String budgetsURL = driver.getCurrentUrl();
        Assert.assertEquals(budgetsURL,"https://www.buxfer.com/home#/budgets");

        //Click on Reminders on Menu, click on its icon and check URL
        WebElement reminders = driver.findElement(By.id("tab-reminders"));
        reminders.click();
        WebElement remindersImage = driver.findElement(By.id("rem-cal-tab-ic"));
        remindersImage.click();
        String remindersURL = driver.getCurrentUrl();
        Assert.assertEquals(remindersURL,"https://www.buxfer.com/home#/reminders");

        //Click on Forecast on Menu, click on its icon and check URL
        WebElement forecast = driver.findElement(By.id("tab-forecast"));
        forecast.click();
        WebElement forecastImage = driver.findElement(By.id("pro-tab-ic"));
        forecastImage.click();
        String forecastURL = driver.getCurrentUrl();
        Assert.assertEquals(forecastURL,"https://www.buxfer.com/home#/forecast");

        //Click on Payments on Menu, click on its icon and check URL
        WebElement payments = driver.findElement(By.id("tab-payments"));
        payments.click();
        WebElement paymentsImage = driver.findElement(By.id("payments-input-tab-ic"));
        paymentsImage.click();
        String paymentsURL = driver.getCurrentUrl();
        Assert.assertEquals(paymentsURL,"https://www.buxfer.com/home#/payments");

        //Click on Summary on Menu and check URL
        WebElement summaryTab = driver.findElement(By.id("tab-home"));
        summaryTab.click();
        Assert.assertEquals(summaryURL,"https://www.buxfer.com/home#/home");
        WebElement getStartedButton = driver.findElement(By.linkText("Get Started"));
        getStartedButton.click();

        //Logout
        WebElement account = driver.findElement(By.id("header-account-h"));
        account.click();
        WebElement logoutButton = driver.findElement(By.id("header-account-12"));
        logoutButton.click();

    }


}
