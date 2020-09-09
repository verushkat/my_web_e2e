package web.functions.fights;

import org.openqa.selenium.WebDriver;
import web.functions.GUIFunctionBase;
import web.pages.flights.FlightReservationPage;

/**
 * Created by verushkat on 9/5/2020
 */
public class FlightReservationFunction extends GUIFunctionBase {

    private FlightReservationPage flightReservationPage;


    public FlightReservationFunction(WebDriver driver){

        super(driver);
        flightReservationPage = new FlightReservationPage(this.driver);
    }



    public void clickRoundTripOption(){

        flightReservationPage.clickRoundTripOption();

    }


    public void selectFromCountry(String searchKeyWord) {

        flightReservationPage.typeFromCountry(searchKeyWord);
        flightReservationPage.selectFromCountry();
    }

    public void selectToCountry(String searchKeyWordTo){

        flightReservationPage.typeToCountry(searchKeyWordTo);
        flightReservationPage.selectToCountry();

    }

    public void selectFromDatePicker(String selectionDate){

        flightReservationPage.clickDateInDatePicker(selectionDate);


    }
    public void selecToDatePicker(String SelectedToDate){

        flightReservationPage.clickToDateInDatePicker(SelectedToDate);

    }
    public void clickSearchBtn(){

        flightReservationPage.clickSearchButton();
        flightReservationPage.waitTillSearchResultsAppear();

    }
    public void clickPriceArrowSorting(){

        flightReservationPage.clickPriceArrowIcon();

    }
    public void clickFlightSelectRadioButton(){

        flightReservationPage.clickFlightSelectRbn();
    }
    public void clickBookBtn(){

        flightReservationPage.clickBookButton();
    }
    public void clickRiskTripRadioButton(){

        flightReservationPage.clickRiskTripRbn();

    }


    public boolean isSearchResultsAppeared() {
        return flightReservationPage.isSearchResultsAppeared();
    }
}



