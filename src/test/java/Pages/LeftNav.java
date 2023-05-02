package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement paramaters;
    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted' and text()='Countries']")
    public WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;
    @FindBy(xpath = "//span[text()='States']")
    public WebElement states;

    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "setup":
                return setup;
            case "parameters":
                return paramaters;
            case "countries":
                return countries;
            case "citizenShip":
                return citizenShip;
            case "nationalities":
                return nationalities;
            case "fees":
                return fees;
            case "entranceExamsOne":
                return entranceExamsOne;
            case "setupTwo":
                return setupTwo;
            case "entranceExamsTwo":
                return entranceExamsTwo;
            case "states":
                return states;
        }
        return null;
    }
}
