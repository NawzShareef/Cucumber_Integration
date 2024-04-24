Feature: Make My trip Home Page Scenarios

  @P1
  Scenario: Hotel Room Booking

    Given  I am on the "homepage" of MakeMyTrip.
    When   I close the "Offer" window.
    When   I click on the "Hotels" option.
    Then   I verify the "display of options" for booking both Domestic and International properties online.
    When   I select the option to search by "City, Property Name, or Location".
    And    I enter "Marigold By Green Park" in the "search box" as the location.
    Then   I enter "check-in" and "check-out" dates.
    And    I provide values for "Rooms", "Adults" and "Children" and click on apply.
    When   I click "search button" to view available properties in Hyderabad.
    Then   I click on "searchInput" to provide Hotel name as "Marigold By Green Park" and click on "viewthiscombo".
    And    I click on "select combo"
    When   I navigate to "Review your Booking" page of "Marigold By Green Park" Hotel.
    Then   I enter "guest details" and select the "Pay Now" option.


  @P1
  Scenario: Train Ticket Booking

    Given  I am on the "homepage" of MakeMyTrip.
    When   I close the "Offer" window.
    When   I click on the "Trains" option.
    Then   I verify the "display of options" for booking Train Tickets.
    When   I enter "Hyderabad" as the pickup location in the From City field.
    And    I enter "Nizamabad" as the drop location in the To City field.
    And    I select the "Travel Date" and "First AC" for the train ticket booking.
    And    I click the "search button" to view available tickets.
    Then   I navigate to the "Train Ticket Booking" page.
    When   I select the departure date as "18 Mar, Mon".
    And    I select "Free Cancellation" checkbox available in Quick Filters
    And    I select train as "Krishna Express" and class as "2S".
    Then   I navigate to "Select Travellers" page.
    When   I provide Add Travellers gender as "Male" and berth Preference as "No Berth Preference".
    And    I provide the "IRCTC Username" and click on the submit button.
    When   I change the Boarding station to "MALKAJGIRI (MJF) - 8:55 PM (18 Feb)".
    And    I select the radio button for "I don't want free cancellation".
    And    I provide the "Contact Information" and Additional Preferences details.
    Then   I click on the "Pay&BookNow" button.


#  @P2
#  Scenario: Bus Ticket Booking
#
#    Given I am  "homepage" of MakeMyTrip.
#
#









