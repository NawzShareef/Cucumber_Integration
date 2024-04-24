package actions;

import elements.Common_Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.Driver_Steps;
import java.util.List;

public class Common_Actions {

    private WebDriver driver;
    Common_Element common_element;
    public Common_Actions(Driver_Steps driver_steps) {
        this.driver = driver_steps.getDriver();
        common_element = new Common_Element(driver);
    }


    public void journeyHub(String Transit) {
        try {
            GlobalWait.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li/span/a/span[@class='headerIconTextAlignment chNavText darkGreyText']")));
      List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li/span/a/span[@class='headerIconTextAlignment chNavText darkGreyText']"));

            for (WebElement element : elements) {
                if (element.getText().equalsIgnoreCase(Transit)) {
                    element.click();
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("select option from menu   " + e);
        }
    }
    public void offerAlertClose() throws InterruptedException {
        GlobalWait.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@name='notification-frame-~197145416']")));
        WebElement notificationFrame=driver.findElement(By.xpath("//iframe[@name='notification-frame-~197145416']"));
        driver.switchTo().frame(notificationFrame);
        boolean image=driver.findElement(By.xpath("//a/i[@class='wewidgeticon we_close']")).isDisplayed();
        if (image) {
            GlobalWait.wait.until(ExpectedConditions.visibilityOf(common_element.offerAlerts)).click();
        }
        driver.switchTo().defaultContent();
    }
}
