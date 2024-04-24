package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GlobalWait {

    public static WebDriverWait wait;

    public static WebDriver driver;

    static {
             wait = null;
    }
    public static void setDriver(WebDriver driver) {
        GlobalWait.driver = driver;
        GlobalWait.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

}
