package steps;

import actions.Common_Actions;
import actions.MakeMyTripTrain_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static elements.MakeMyTripTrain_Elements.*;

public class MakeMyTripTrain_Steps {

    MakeMyTripTrain_Actions makemytriptrain_actions;
    Driver_Steps driver_steps;

    public MakeMyTripTrain_Steps(Driver_Steps driver_steps, MakeMyTripTrain_Actions makemytriptrain_actions){
        this.makemytriptrain_actions=makemytriptrain_actions;
        this.driver_steps=driver_steps;
    }

    @Then("I verify the {string} for booking Train Tickets.")
    public void i_verify_the_for_booking_train_tickets(String string) throws InterruptedException {
        makemytriptrain_actions.displayOfOptions();

    }
    @When("I enter {string} as the pickup location in the From City field.")
    public void i_enter_as_the_pickup_location_in_the_field(String fromLocation) {
        makemytriptrain_actions.enterFromLocation(fromLocation);
        makemytriptrain_actions.ListValues(fromlocation,fromLocation);
    }
    @When("I enter {string} as the drop location in the To City field.")
    public void i_enter_as_the_drop_location_in_the_field(String toLocation) throws InterruptedException {
        makemytriptrain_actions.ToLocationDetails();

    }
    @When("I select the {string} and {string} for the train ticket booking.")
    public void i_select_the_and_for_the_train_ticket_booking(String traveldate, String classy) throws InterruptedException {
        makemytriptrain_actions.travelDate("17");
        makemytriptrain_actions.ListValues(selectClass,classy);

    }
    @When("I click the {string} to view available tickets.")
    public void i_click_the_to_view_available_tickets(String Search) throws InterruptedException {
        makemytriptrain_actions.clicksearchbtn();
    }
    @Then("I navigate to the {string} page.")
    public void i_navigate_to_the_page(String string) {
    makemytriptrain_actions.trainTicketBooking();
    }
    @When("I select the departure date as {string}.")
    public void i_select_the_and_navigate_to(String date) throws InterruptedException {
    makemytriptrain_actions.departureDate(date);
    }

    @When("I select {string} checkbox available in Quick Filters")
    public void i_select_checkbox_available_in_quick_filters_and_navigate_to(String filter) throws InterruptedException {
        makemytriptrain_actions.ListValues(quickFilterLists,filter);
    }

    @When("I select train as {string} and class as {string}.")
    public void i_navigate_to_and_click_on(String TrainName, String className) throws InterruptedException {
       makemytriptrain_actions.availableTrainTicket(TrainName,className);


    }


    @Then("I navigate to {string} page.")
    public void i_navigate_to_page(String string) throws InterruptedException {
        makemytriptrain_actions.displayTravellerPage();
    }

    @When("I change the Boarding station to {string}.")

    public void i_change_the_boarding_station_to(String newLocation) throws InterruptedException {
        makemytriptrain_actions.clickBoardingDropdown();
        Thread.sleep(3000);
        makemytriptrain_actions.ListValues(boardingDropdown,newLocation);

    }

    @When("I select the radio button for {string}.")
    public void i_select_the_radio_button_for(String cancellationcharges) {
        makemytriptrain_actions.ListValues(cancellationCharges,cancellationcharges);

    }

    @When("I provide Add Travellers gender as {string} and berth Preference as {string}.")
    public void i_provide_add_travellers_gender_as_and_berth_preference_as(String gender, String birthpreference) throws InterruptedException {
        makemytriptrain_actions.AddTravellerInformation();
        makemytriptrain_actions.ListValues(provideGender, gender);
        makemytriptrain_actions.selectBerthPreference();
        makemytriptrain_actions.addbtn();
    }

    @When("I provide the {string} and click on the submit button.")
    public void i_provide_the_and_click_on_the_submit_button(String string) throws InterruptedException {
    makemytriptrain_actions.provideIRCTCusername();
    }
    @When("I provide the {string} and Additional Preferences details.")
    public void i_provide_the_and_details(String string) throws InterruptedException {
        makemytriptrain_actions.contactInformation();


    }
    @Then("I click on the {string} button.")
    public void i_click_on_the_paybutton(String string) throws InterruptedException {
        makemytriptrain_actions.bookAndPay();

        }

    }

