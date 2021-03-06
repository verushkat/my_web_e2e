package web.pages.flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.pages.PageBase;

import java.util.List;


public class FlightReservationPage extends PageBase {

    protected WebDriver driver;
    private By roundTripBtn = By.xpath("//span[@id='roundTrip']");
    private By fromCountrydrpDown = By.id("gosuggest_inputSrc");
    private By toCountrydrpDown = By.id("gosuggest_inputDest");
    private By SelectFromOption = By.xpath("//ul[@id='react-autosuggest-1']//child::li[contains(normalize-space(.),'Delhi')]");
    private By SelectToOption = By.xpath("//ul[@id='react-autosuggest-1']//child::li[contains(normalize-space(.),'Mumbai')]");
    private By DepartureClnder = By.id("departureCalendar");
    private By ReturnClnder = By.id("returnCalendar");
    private By relativeDepartureCalendarDates = By.xpath("//following::div[@aria-disabled='false']/div[1]");
    private By flightSearchBtn = By.id("gi_search_btn");
    private By priceSortingIcon = By.xpath("//li[@id='PRICE'][1]/span");
    private By clickFlightSelectRadioButton = By.xpath("//li[@id='PRICE'][1]//following::input[@type='radio'][1]//following::label[1]");
    private By clickBookButton = By.xpath("//input[@value='BOOK' and @type='button']");
    private By clickRiskTripRBtn = By.id("risk-trip");
    private By searchResultsFlightDetailCard = By.xpath("//div[contains(@class,'fltHpyRsltCard')]");


    public FlightReservationPage(WebDriver driver) {

        super(driver);

    }

    public void clickRoundTripOption() {

        waitTillElementClickable(roundTripBtn);
        driver.findElement(roundTripBtn).click();



    }

    public void typeFromCountry(String searchKeyWord) {

        WebElement element = driver.findElement(fromCountrydrpDown);

        if (element.isDisplayed()) {
            element.sendKeys(searchKeyWord);

        }


    }

    public void typeToCountry(String searchToKeyword) {

        WebElement element = driver.findElement(toCountrydrpDown);

        if (element.isDisplayed()) {
            element.sendKeys(searchToKeyword);

        }

    }

    public void selectFromCountry() {

        waitTillElementLoaded(SelectFromOption);
        WebElement element = driver.findElement(SelectFromOption);
        element.click();
    }


    public void selectToCountry() {

        waitTillElementLoaded(SelectToOption);
        WebElement element = driver.findElement(SelectToOption);
        element.click();

    }

    public void clickDateInDatePicker(String selectionDate) {

        WebElement dateWidget = driver.findElement(DepartureClnder);


        List<WebElement> dates = dateWidget.findElements(relativeDepartureCalendarDates);

        for (WebElement date : dates) {

            if (date.getText().split("\n")[0].equals(selectionDate)) {
                waitTillElementClickable(date);
                date.click();
                break;
            }
        }

    }

    public void clickToDateInDatePicker(String SelectedToDate) {

        WebElement toDateWidget = driver.findElement(ReturnClnder);

        List<WebElement> dates = toDateWidget.findElements(relativeDepartureCalendarDates);

        for (WebElement date : dates) {

            if(date.getText().split("\n")[0].equals(SelectedToDate)){
                waitTillElementClickable(date);
                date.click();
                break;

            }

            }

        }

    public void clickSearchButton() {
        WebElement element = driver.findElement(flightSearchBtn);

        if (element.isEnabled())
        {
            element.click();

        }
    }
    public void clickPriceArrowIcon() {

        waitTillElementClickable(priceSortingIcon);
        driver.findElement(priceSortingIcon).click();



    }
    public void clickFlightSelectRbn() {

         driver.findElement(clickFlightSelectRadioButton).click();

    }
    public void clickBookButton(){

        WebElement element = driver.findElement(clickBookButton);

        if(element.isEnabled()){

            element.click();
        }

    }
     public void clickRiskTripRbn() {


         waitTillElementClickable(clickRiskTripRBtn);
         driver.findElement(clickRiskTripRBtn).click();

    }

    public void waitTillSearchResultsAppear() {

        new WebDriverWait(driver,10L).until(ExpectedConditions.visibilityOfElementLocated(searchResultsFlightDetailCard));

    }

    public boolean isSearchResultsAppeared() {
        return driver.findElement(searchResultsFlightDetailCard).isDisplayed();
    }
}
