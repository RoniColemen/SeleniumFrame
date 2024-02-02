package Pages;

import Utils.BrowserDriver;
import org.openqa.selenium.By;

public class ProductCatelogPage extends BrowserDriver {

    public static String Formal_shoes = "//h3[@id='ShoeType' and contains(.,'Formal Shoes')]";

    public static String VisibilityFS(){
        String shoeType = driver.findElement(By.xpath(Formal_shoes)).getText();
        return shoeType;
    }

}
