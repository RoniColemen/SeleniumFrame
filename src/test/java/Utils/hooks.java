package Utils;

import org.junit.After;
import org.junit.Before;

public class hooks {

    public static BrowserDriver driver;

    @Before
    public void setup(){
        driver = new BrowserDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
