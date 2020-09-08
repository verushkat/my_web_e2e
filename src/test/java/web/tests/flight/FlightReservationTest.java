package web.tests.flight;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.functions.fights.FlightReservationFunction;
import web.pages.flights.FlightReservationPage;
import web.utils.TestBase;

/**
 * Created by verushkat on 9/5/2020
 */
public class FlightReservationTest extends TestBase {

    private FlightReservationFunction flightReservationFunction;



    @BeforeClass
    public void runBeforeClass(){

        flightReservationFunction = new FlightReservationFunction(driver);
    }

    @Test
    public void bookAFlightForRoundTrip(){

        flightReservationFunction.clickRoundTripOption();
        flightReservationFunction.selectFromCountry("Delhi");
        flightReservationFunction.selectToCountry("Mumbai");
        flightReservationFunction.selectFromDatePicker("15");
        flightReservationFunction.selecToDatePicker("17");
        flightReservationFunction.clickSearchBtn();
        flightReservationFunction.clickPriceArrowSorting();
        flightReservationFunction.clickFlightSelectRadioButton();
        flightReservationFunction.clickBookBtn();
        flightReservationFunction.clickRiskTripRadioButton();


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
