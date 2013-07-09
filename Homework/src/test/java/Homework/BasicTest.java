package Homework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


/**
 * Created with IntelliJ IDEA.
 * User: C13T
 * Date: 26.06.13
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 */
public class BasicTest {
    protected WebDriver driver;
    @BeforeSuite

    public void iniDriver(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void destruct(){
        driver.quit();
    }
}

