package StepDef;

import io.cucumber.java.en.Given;

import static Pages.HomePage.*;

public class BasePage {
    @Given("User navigates to the login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        Menu_button_click();
        Sign_in_click();
    }
}
