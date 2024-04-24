package steps;

import actions.Common_Actions;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Common_Steps {

    Common_Actions common_actions;

    WebDriver driver;

    Driver_Steps driver_steps;

    public Common_Steps(Driver_Steps driver_steps, Common_Actions common_actions) {
        this.common_actions=common_actions;
        this.driver_steps = driver_steps;

    }
    @When("I click on the {string} option.")
    public void i_click_on_the_option(String Transit) {
        common_actions.journeyHub(Transit);
    }

}
