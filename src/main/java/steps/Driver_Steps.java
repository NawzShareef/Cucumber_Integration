package steps;
import actions.GlobalWait;
import framework.Configuration;
import framework.Driver;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver_Steps {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {

       //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        Driver.add(Configuration.get("browser"), cap);
        driver = Driver.current();
        driver.get(Configuration.get("url"));
        driver.manage().window().maximize();
        GlobalWait.setDriver(driver);
    }


    @AfterStep
    public void tearDown(io.cucumber.java.Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", " " + "failed.screenshot");
        }else {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Thread.sleep(1000);
            scenario.attach(screenshot, "image/png", " " + "passed.screenshot");
        }
        //driver.quit();
        Thread.sleep(1000);
    }


    public WebDriver getDriver() {
        return driver;
    }
}
