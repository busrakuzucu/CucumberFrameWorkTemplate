package StepDefinitions;

import Pages.DialogConcent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogConcent dc=new DialogConcent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {


//        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//        dc.username.sendKeys("turkeyts");
//        dc.findAndSend("username", "turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
//        dc.findAndSend("password","TechnoStudy123");
//        dc.loginButton.click();
        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");

        dc.clickFunction(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        dc.verifyContainsTextFunction(dc.txtTechnoStudy,"Techno Study");
    }
}
