package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common_Element {

    WebDriver driver;

    @FindBy(xpath = "//ul[@class='makeFlex font12 headerIconsGap']/li/span/a/span[@class='headerIconTextAlignment chNavText darkGreyText']")
    public WebElement journeyhub;

    @FindBy(xpath = "//a/i[@class='wewidgeticon we_close']")
    public static WebElement offerAlerts;

    @FindBy(xpath="//span[@class='commonModal__close']")
    public static WebElement signUpClose;

    public Common_Element(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
