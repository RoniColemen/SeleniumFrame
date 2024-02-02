package Pages;

import Utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BrowserDriver {

    public static String menu_button = "//input[@type='checkbox']";
    public static String sign_in = "//ul[@id = 'menu']/a[contains(@href,'SignIn')]/li";

    public static void Menu_button_click() throws InterruptedException {
        System.out.println("in menu click button");
        Thread.sleep(3000);
        driver.findElement(By.xpath(menu_button)).click();
    }

    public static void Sign_in_click() throws InterruptedException{
        Thread.sleep(3000);
        driver .findElement(By.xpath(sign_in)).click();
    }
}
