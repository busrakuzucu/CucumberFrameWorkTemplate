package Pages;

import Utilities.GWD;
import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//POM: Page Object Model
public class DialogConcent extends Parent {
    public DialogConcent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button/div")
    public WebElement searchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;


    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement priority;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Integration Code']")
    public WebElement integrationCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;
    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    public WebElement academicPeriod;
    @FindBy(xpath = "(//mat-option/span)[1]")
    public WebElement academicPeriod1;
    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    public WebElement gradeLevel;
    @FindBy(xpath = "(//mat-option//span)[2]")
    public WebElement gradeLevel2;
    @FindBy(xpath = "(//mat-option//span)[3]")
    public WebElement gradeLevel3;
    @FindBy(xpath = "(//mat-option//span)[4]")
    public WebElement gradeLevel4;
    @FindBy(xpath = "(//mat-option//span)[5]")
    public WebElement gradeLevel5;

    @FindBy(xpath = "//tr[contains(@class, 'mat-row')]/td[2]")
    public List<WebElement> nameList;


    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "addButton":
                return addButton;
            case "saveButton":
                return saveButton;
            case "nameInput":
                return nameInput;
            case "searchNameInput":return searchNameInput;
            case "codeInput":
                return codeInput;
            case "priority":
                return priority;
            case "integrationCode":
                return integrationCode;
            case "toggleBar":
                return toggleBar;
            case "academicPeriod":return academicPeriod;
            case "academicPeriod1":return academicPeriod1;
            case "gradeLevel": return gradeLevel;
            case "gradeLevel2": return gradeLevel2;
            case "gradeLevel3": return gradeLevel3;
            case "gradeLevel4": return gradeLevel4;
            case "gradeLevel5": return gradeLevel5;

        }
        return null;
    }


    public void deleteITem(String searchText) {
        sendKeysFunction(searchNameInput, searchText);
        clickFunction(searchButton);
        //wait olması gerekiyor
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        ////fuse-proggress-bar/ * bu 0 olana kadar beklet
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(deleteImageButton);
        clickFunction(deleteDialogButton);

    }
}
