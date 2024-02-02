package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions options;
    public BrowserDriver() {
        System.out.println("in driver class");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"src/test/resources/Drivers/chromedriver.exe");
        driver  = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    public void close(){
//Close the working driver
        driver.close();
    }
}
/*

With this constructor we are already instantiating the driver in such
a way that it is getting the values when the class is being called

Class is getting called => constructor will get called => the driver will be initiated

*/