package web.tests.flight;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.functions.heroku.HerokuAppFunction;
import web.utils.TestBase;

import java.util.List;

/**
 * Created by verushkat on 9/9/2020
 */
public class HerokuAppTableVerification extends TestBase {

    private HerokuAppFunction herokuAppFunction;

    @BeforeClass
    public void runBeforeClass(){

        herokuAppFunction = new HerokuAppFunction(driver);
    }

    @Test
    public void printTableDateInHerokuAndVerifyThirdRow(){

        List<String> rows = herokuAppFunction.getAllValuesFromTable();
        printRows(rows);
        softAssert.assertTrue(rows.get(3).contains("Doe Jason jdoe@hotmail.com $100.00 http://www.jdoe.com edit delete"));
        softAssert.assertAll();


    }

    private void printRows(List<String> rows) {
        for(String row : rows){
            System.out.println(row);
        }

    }

}
