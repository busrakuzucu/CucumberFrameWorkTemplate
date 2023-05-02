package StepDefinitions;

import Pages.DialogConcent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogConcent dc=new DialogConcent();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.paramaters);
        ln.clickFunction(ln.countries);
    }

    @When("create a country")
    public void createACountry() {
        String countryName= RandomStringUtils.randomAlphanumeric(8);// 8 harf
        String countryCode=RandomStringUtils.randomNumeric(4);//4 rakam
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,countryName);
        dc.sendKeysFunction(dc.codeInput,countryCode);
        dc.clickFunction(dc.saveButton);


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage,"success");
    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.codeInput,code);
        dc.clickFunction(dc.saveButton);
    }
}
