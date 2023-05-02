package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void sendKeysFunction(WebElement element, String text) {
        waitUntilVisible(element);//gözükene kadar bekle
        scrollToElement(element);//scroll yap
        element.clear();//temizle
        element.sendKeys(text);//text gönder
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);

    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitUntilStaleElement(WebElement element) {
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public void verifyContainsTextFunction(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"No Such Text()");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        //açık kutusu varsa kapansın
    }
}