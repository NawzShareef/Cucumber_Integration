package steps;

import actions.Common_Actions;
import actions.MakeMyTripHotel_Actions;;
import io.cucumber.java.en.*;
import java.io.IOException;

public class MakeMyTripHotel_Steps {

    MakeMyTripHotel_Actions makemytrip_Hotel_actions;

    Common_Actions common_actions;

    Driver_Steps driver_steps;

    public MakeMyTripHotel_Steps(MakeMyTripHotel_Actions makemytrip_Hotel_actions,Driver_Steps driver_steps, Common_Actions common_actions) {
        this.makemytrip_Hotel_actions = makemytrip_Hotel_actions;
        this.driver_steps=driver_steps;
        this.common_actions=common_actions;
    }

    @Given("I am on the {string} of MakeMyTrip.")
    public void i_am_on_the_of_make_my_trip(String home) throws IOException, InterruptedException {
        makemytrip_Hotel_actions.displayHomeName();
    }
    @When("I close the {string} window.")
    public void i_close_the_window(String offer) throws InterruptedException {
        common_actions.offerAlertClose();
    }

    @Then("I verify the {string} for booking both Domestic and International properties online.")
    public void i_verify_the_for_booking_both_domestic_and_international_properties_online(String optionsDisplay) throws InterruptedException {
        makemytrip_Hotel_actions.displayOptions();
    }

    @When("I select the option to search by {string}.")
    public void i_select_the_option_to_search_by(String cities) throws InterruptedException {
        makemytrip_Hotel_actions.cityBtn();
    }

    @When("I enter {string} in the {string} as the location.")
    public void i_enter_in_the_as_the_location(String location, String searchBox) throws InterruptedException {
        makemytrip_Hotel_actions.provideCity(location);
    }

    @Then("I enter {string} and {string} dates.")
    public void i_enter_and_dates(String checkIN, String checkOUT) throws InterruptedException {
        makemytrip_Hotel_actions.checkInAndCheckOut();
    }

    @Then("I provide values for {string}, {string} and {string} and click on apply.")

    public void i_provide_values_for_and(String Rooms, String Adults, String Children) throws InterruptedException {
        makemytrip_Hotel_actions.roomsAdultsAndChildren();
    }

    @When("I click {string} to view available properties in Hyderabad.")
    public void i_click_the_to_view_available_properties_in_hyderabad(String searchBtn) throws InterruptedException {
        makemytrip_Hotel_actions.searchBtnClick();


    }

    @Then("I click on {string} to provide Hotel name as {string} and click on {string}.")
    public void i_click_on_to_provide_hotel_name_as_and_click_on(String hotelSearch, String hotelName, String viewThisCombo) throws InterruptedException {
        makemytrip_Hotel_actions.hotelNameClickAndViewCombo();

    }

    @Then("I click on {string}")
    public void i_click_on(String selectCombo) throws InterruptedException {
        makemytrip_Hotel_actions.clickSelectCombo();

    }

    @Then("I navigate to {string} page of {string} Hotel.")
    public void i_navigate_to_page_of_hotel(String reviewBooking, String Hotel) throws InterruptedException {
        makemytrip_Hotel_actions.validateReviewBooking();
    }

    @When("I enter {string} and select the {string} option.")
    public void i_enter_and_select_the_option(String guestDetails, String payNow) throws InterruptedException {
        makemytrip_Hotel_actions.guestDetails();
        makemytrip_Hotel_actions.clickPayNow();
    }

}
