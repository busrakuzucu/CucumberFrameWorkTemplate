package StepDefinitions;

import Pages.DialogConcent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _06_DataTableSteps {
    LeftNav ln=new LeftNav();
    DialogConcent dc=new DialogConcent();
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {
        List<String> strButtons= items.asList(String.class);
        for (String strButton:strButtons){
            System.out.println("strButton = " + strButton);
            WebElement element=ln.getWebElement(strButton);
            ln.clickFunction(element);
            //setup a tıklat
            //parametres a tıklat

        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {
        List<String> strButtons=items.asList(String.class);
        for (String strButton:strButtons){
            WebElement element=dc.getWebElement(strButton);
            dc.clickFunction(element);
        }
    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable items) {
        List<List<String>> strButtons=items.asLists(String.class);
        for (int i = 0; i < strButtons.size() ; i++) {
            WebElement element= dc.getWebElement(strButtons.get(i).get(0));
            dc.sendKeysFunction(element, strButtons.get(i).get(1));

        }
    }

    @And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable items) {
        List<String> list=items.asList(String.class);
        for (String stringDeleteText:list){
            dc.deleteITem(stringDeleteText);
        }
    }
}
