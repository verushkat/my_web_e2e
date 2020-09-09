package web.pages.heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.pages.PageBase;

import java.util.ArrayList;
import java.util.List;

public class HerokuAppPage extends PageBase {

    private By firstTable = By.xpath("//table[@id='table1']");
    private By relativeXpathToRows = By.xpath("//table[@id='table1']//descendant::tr");
    public HerokuAppPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getAllValuesFromTableAsRows() {
        List<String> rowsList = new ArrayList<>();
        waitTillElementLoaded(firstTable);
        List<WebElement> rows = driver.findElements(relativeXpathToRows);
        for(WebElement element : rows){
            rowsList.add(element.getText());

        }
        return rowsList;
    }
}
