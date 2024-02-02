package Pages;

import Utils.BrowserDriver;
import org.openqa.selenium.By;

import static Utils.BrowserDriver.*;


public class RegistrationPage extends BrowserDriver {

    public static String RegistrationHeader = "//h1[contains(.,'User Registration Page')]";

    public void header(){
        driver.findElement(By.xpath(RegistrationHeader)).isDisplayed();
    }
}
