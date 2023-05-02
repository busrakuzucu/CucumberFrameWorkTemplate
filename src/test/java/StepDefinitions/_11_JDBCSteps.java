package StepDefinitions;

import Pages.DialogConcent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    @Then("Send The query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        //DB den gerekli bilgileri alalım
        ArrayList<ArrayList<String>> dbList= DBUtility.getListData(sorgu);
        //UI dan gerekli bilgileri alalım
        DialogConcent dc=new DialogConcent();
        List<WebElement> UIList=dc.nameList;
        for (int i = 0; i <dbList.size() ; i++) {
            System.out.print(dbList.get(i).get(1).trim());
            System.out.println("\t" + UIList.get(i).getText().trim());

            Assert.assertEquals(
                    dbList.get(i).get(1).trim(),
                    UIList.get(i).getText().trim()
                    );
        }
    }
}
