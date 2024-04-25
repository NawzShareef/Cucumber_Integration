package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripHotel_Elements {

 WebDriver driver;
 @FindBy(xpath = "//a[@data-cy='mmtLogo']")
 public WebElement homeLocator;
 @FindBy(css = ".chHotels")
 public WebElement transit;
 @FindBy(css = ".hsw_inner")
 public WebElement options;
 @FindBy(xpath = "//input[@data-cy='city']")
 public WebElement city;
 @FindBy(xpath = "//input[@title='Where do you want to stay?']")
 public WebElement searchbox;
 @FindBy(xpath = "//div[1]/ul/li/div/div/div[@class='hw__recentSearchTextWrapper']/p[@class='sr_city']")
 public WebElement selectLocation;
 @FindBy(css = "div.DayPicker-Day--today")
 public WebElement checkIn;
 @FindBy(xpath = "//div[@class='DayPicker-Day']")
 public WebElement checkout;
 @FindBy(xpath = "//div[1]/div[@class='gstSlctCont']/div")
 public WebElement rooms;
 @FindBy(xpath = "//li[@data-cy='GuestSelect$$_323']")
 public WebElement ROOMS;
 @FindBy(xpath = "//div[2]/div[@class='gstSlctCont']/div")
 public WebElement adults;
 @FindBy(xpath = "//div[3]/div[@class='gstSlctCont']/div")
 public WebElement Children;
// @FindBy(xpath = "//button[@data-cy='RoomsGuestsNew_327']")
// public WebElement Apply;

 @FindBy(xpath="//div[@class='`makeFlex flexOne spaceBetween']")
 public WebElement Apply;

@FindBy(xpath = "//button[@data-cy='submit']")
public WebElement searchbtn;
@FindBy(xpath = "//input[@aria-label='Search for locality / hotel name']")
public WebElement hotelsearch;
@FindBy(xpath = "//span[text()='Marigold By Green Park, Hyderabad, Telangana']")
public WebElement hotelsearchdropdown;

 @FindBy(xpath = "//button[text()='BOOK THIS NOW']")
 public WebElement bookThisNow;

@FindBy(xpath="//span[@id='htl_id_seo_201211011552481969']")
public WebElement clickOnHotel;

 @FindBy(xpath = "//span[text()='Select Combo']")
 public WebElement selectcombo;
 @FindBy(xpath = "//h2[text()='Review your Booking']")
 public WebElement reviewbooking;
 @FindBy(xpath = "//h3[text()='Marigold By Green Park']")
 public WebElement hotel;
 @FindBy(xpath = "//input[@id='fName']")
 public WebElement firstName;
 @FindBy(xpath = "//input[@id='lName']")
 public WebElement lastName;
 @FindBy(xpath = "//input[@id='email']")
 public WebElement emailID;
 @FindBy(xpath = "//input[@id='mNo']")
 public WebElement mobileNo;

 @FindBy(xpath="//a[text()='Pay Now']")
 public WebElement payNow;



  public MakeMyTripHotel_Elements(WebDriver driver) {
  this.driver = driver;
  PageFactory.initElements(driver, this);
}
}
