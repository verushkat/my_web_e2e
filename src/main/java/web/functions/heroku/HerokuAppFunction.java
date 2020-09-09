package web.functions.heroku;

import org.openqa.selenium.WebDriver;
import web.functions.GUIFunctionBase;
import web.pages.heroku.HerokuAppPage;

import java.util.List;


public class HerokuAppFunction extends GUIFunctionBase {

    private HerokuAppPage herokuAppPage;
    public HerokuAppFunction(WebDriver driver) {
        super(driver);

        herokuAppPage = new HerokuAppPage(driver);

    }

    public List<String> getAllValuesFromTable() {
        return herokuAppPage.getAllValuesFromTableAsRows();
    }
}
