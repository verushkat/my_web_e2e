package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by verushkat on 9/8/2020
 */
public class PageBase {


    public static WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver=driver;
    }



    public void waitTillElementLoaded(By element) {
        new WebDriverWait(driver, 10L).until(ExpectedConditions.visibilityOfElementLocated(element));

    }

    public void waitTillElementClickable(By element){

        new WebDriverWait(driver, 10L).until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitTillElementClickable(WebElement element){

        new WebDriverWait(driver, 10L).until(ExpectedConditions.elementToBeClickable(element));

    }



}
