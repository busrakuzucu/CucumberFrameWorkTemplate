package StepDefinitions;

import Pages.DialogConcent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenShipCreate {
    LeftNav lc=new LeftNav();
    DialogConcent dc=new DialogConcent();
    @And("Navigate to CitizenShip Page")
    public void navigateToCitizenShipPage() {
        lc.clickFunction(lc.setup);
        lc.clickFunction(lc.paramaters);
        lc.clickFunction(lc.citizenShip);


    }

    @When("User a CitizenShip name as {string} short name as {string}")
    public void userACitizenShipNameAsShortNameAs(String name, String shortName) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortNameInput,shortName);
        dc.clickFunction(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist,"already");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchText) {
       dc.deleteITem(searchText);

    }
}
