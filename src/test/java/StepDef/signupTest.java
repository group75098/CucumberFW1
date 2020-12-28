package StepDef;

import Base.BaseUtil;
import Base. BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.SignUpPage;

public class signupTest extends BaseUtil {
    SignUpPage signup = new SignUpPage(driver);

    @Given("I am at talentTEK signup page")
    public void iAmAtTalentTEKSignupPage() {
        // Write selenium code
        signup.goToSignupPage();
    }

    @And("I fill out all the form with valid info")
    public void iFillOutAllTheFormWithValidInfo() {
        signup.test2();
    }

    @When("I click on Create My Account button")
    public void iClickOnCreateMyAccountButton() {

    }

    @Then("I will verify my account is created successfully")
    public void iWillVerifyMyAccountIsCreatedSuccessfully() {
    }


}
