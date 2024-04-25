package actions;

import elements.MakeMyTripHotel_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.Driver_Steps;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MakeMyTripHotel_Actions {

    WebDriver driver;
    MakeMyTripHotel_Elements makeMyTrip_Hotel_elements;


    public MakeMyTripHotel_Actions(Driver_Steps driver_steps) {
        this.driver = driver_steps.getDriver();
        makeMyTrip_Hotel_elements = new MakeMyTripHotel_Elements(driver);
    }

    public void displayHomeName() throws InterruptedException {
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.homeLocator));
    }

    public void displayOptions() {

        GlobalWait.wait.until(ExpectedConditions.visibilityOfAllElements(makeMyTrip_Hotel_elements.options));
    }

    public void cityBtn() {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.city)).click();
    }

    public void provideCity(String location) throws InterruptedException {
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.searchbox)).sendKeys(location);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[@class='sr_city']")).click();
    }

    public void checkInAndCheckOut() {

        List<WebElement> dayElements = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
        int selectedCount = 0;
        for (WebElement dayElement : dayElements) {
            String text = dayElement.getText();
            if ((text.equalsIgnoreCase("21") || text.equalsIgnoreCase("25")) && selectedCount < 2) {
                dayElement.click();
                selectedCount++;
            }
            if(selectedCount == 2) {
                break;
            }
        }
    }

        public void roomsAdultsAndChildren() throws InterruptedException {
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.rooms)).click();
        List<WebElement> noOfRooms = driver.findElements(By.xpath("//li[@data-cy='GuestSelect$$_323']"));

        for (int i = 0; i <= noOfRooms.size(); i++) {
            driver.findElement(By.xpath("//li[text()='" + i + "']")).getText();
            if (driver.findElement(By.xpath("//li[text()='" + i + "']")).getText().equalsIgnoreCase("03")) {
                GlobalWait.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
                break;
            }
        }
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.adults)).click();
        List<WebElement> noOfAdults = driver.findElements(By.xpath("//li[@data-cy='GuestSelect$$_323']"));
        for (int i = 3; i <= noOfAdults.size(); i++) {

            driver.findElement(By.xpath("//li[text()='" + i + "']")).getText();
            if (driver.findElement(By.xpath("//li[text()='" + i + "']")).getText().equalsIgnoreCase("05")) {
                driver.findElement(By.xpath("//li[text()='5']")).click();
                break;
            }
        }
            driver.navigate().refresh();
    }

    public void searchBtnClick() {
        makeMyTrip_Hotel_elements.searchbtn.click();
    }

    public void hotelNameClickAndViewCombo() throws InterruptedException {
        makeMyTrip_Hotel_elements.hotelsearch.sendKeys("Marigold By Green Park");
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.hotelsearchdropdown)).click();
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.clickOnHotel)).click();
        String parent = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();
        Thread.sleep(2000);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String child_window = itr.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                makeMyTrip_Hotel_elements.bookThisNow.click();
            }

        }

    }

    public void clickSelectCombo() throws InterruptedException {
       Thread.sleep(3000);
       makeMyTrip_Hotel_elements.selectcombo.click();
    }

    public void validateReviewBooking() {
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.reviewbooking));
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.hotel));
    }

    public void guestDetails() {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makeMyTrip_Hotel_elements.firstName));
        makeMyTrip_Hotel_elements.firstName.sendKeys("Nawaz");
        makeMyTrip_Hotel_elements.lastName.sendKeys("Shareef");
        makeMyTrip_Hotel_elements.emailID.sendKeys("test@yopmail.com");
        makeMyTrip_Hotel_elements.mobileNo.sendKeys("9999999999");
    }

    public void clickPayNow() {

        makeMyTrip_Hotel_elements.payNow.click();
    }


}


