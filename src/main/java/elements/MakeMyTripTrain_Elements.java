package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class MakeMyTripTrain_Elements {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='rsw']/div[@class='rsw_inner']")
    public WebElement displayofoptions;

    @FindBy(xpath = "//div/div[@class='calc50']/p[1]/span")
    public static List<WebElement> fromlocation;

    @FindBy(xpath = "//div[@role='combobox']/input")
    public  WebElement tolocation;

    @FindBy(xpath = "//p/span[contains(text(),'Nizamabad Railway Station')]")
    public static WebElement selectToLocation;

    @FindBy(xpath = "//a[text()= 'Search']")
    public WebElement searchbtn;

    @FindBy(xpath = "//p[text()='Quick Filters']")
    public WebElement quickFilter;


    @FindBy(xpath="//ul[@class='filterList']/li/span/label")
    public static List<WebElement> quickFilterLists;

    @FindBy(xpath = "//ul[@class='travelForPopup']/li")
    public  static List<WebElement> selectClass;

    @FindBy(xpath="//h2[text()='Select Travellers']")
    public WebElement displaySelectTraveller;

    @FindBy(xpath = "//span[text()='Change']")
    public WebElement clickboardingDropdown;

    @FindBy(xpath = "//ul[@class='quotaBox quotaCurtainDown makeAbsolute textLeft font14 darkGreyText']/li")
    public static List<WebElement> boardingDropdown;

    @FindBy(xpath ="//label[contains(text(),'cancellation')]")
    public static List<WebElement> cancellationCharges;

    @FindBy(xpath = "//span[contains(text(),'Add Traveller')]")
    public WebElement addtraveller;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "age")
    public WebElement age;

    @FindBy(xpath = "//span[text()='Select']")
    public WebElement selectGender;

    @FindBy(xpath = "//ul/li/span[contains(text(),'ale')]")
    public static List<WebElement> provideGender;

    @FindBy(xpath = "//span[text()='No Berth Preference']")
    public WebElement selectberthpreference;

    @FindBy(xpath = "//div[5]/div/ul/li/span[@class='appendRight30']")
    public static List<WebElement> provideberthPreference;

    @FindBy(xpath ="//button[text()='Add']")
    public WebElement addBtn;

    @FindBy(xpath ="//input[@id='irctcUserName']")
    public WebElement irctcUserName;

    @FindBy(xpath ="//input[@id='IRCTCUserName']")
    public WebElement IRCTCUserName;

    @FindBy(xpath ="//span[text()='Submit']")
    public WebElement SubmitBtn;

    @FindBy(css="span.modalClose.railSprite.crossIcon")
    public WebElement crossIcon;

    @FindBy(xpath ="//input[@id='contactEmail']")
    public WebElement contactEmail;

    @FindBy(xpath ="//input[@id='mobileNumber']")
    public WebElement contactMobile;

    @FindBy(xpath ="//span[contains(text(),'Pay & Book Now')]")
    public WebElement PayNow;



    public MakeMyTripTrain_Elements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
