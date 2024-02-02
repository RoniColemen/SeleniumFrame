package Pages;

import Utils.BrowserDriver;
import org.openqa.selenium.By;

public class SignInPage extends BrowserDriver {

    public static String user_name = "//input[@id='usr']";
    public static String pwd = "//input[@id='pwd']";
    public static  String loginBTN = "//input[@value='Login']";
    public static String newUser = "//button[@id='NewRegistration']";

    public static void EnterUserName() {
        driver.findElement(By.xpath(user_name)).sendKeys("sa");
    }

    public static void EnterPassword() {
        driver.findElement(By.xpath(pwd)).sendKeys("sa");
    }

    public static void clickLoginBTN() {
        driver.findElement(By.xpath(loginBTN)).click();
    }

    public static void clickRegisterBTN() {
        driver.findElement(By.xpath(newUser)).click();
    }
}
