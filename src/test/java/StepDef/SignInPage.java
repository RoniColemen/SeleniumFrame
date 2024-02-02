package StepDef;

import io.cucumber.java.en.When;

import static Pages.SignInPage.*;
public class SignInPage {

    @When("User successfully enters the login credentials")
    public void user_successfully_enters_the_login_credentials(){
        System.out.println("On Sign in page");
        EnterUserName();
        EnterPassword();

        clickLoginBTN();
    }

}
