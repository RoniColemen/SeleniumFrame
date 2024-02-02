package StepDef;

import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import static Pages.ProductCatelogPage.*;
public class ProductCataloguePage {

    @Then("User lands on product catalogue  page")
    public void user_lands_on_product_catalogue_page(){
        System.out.println("On Product category page");
        String actualType = VisibilityFS();
        assertEquals(actualType, "Formal Shoes");
    }
}
