package actions;

import elements.MakeMyTripTrain_Elements;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.Driver_Steps;
import java.util.List;

public class MakeMyTripTrain_Actions {

    WebDriver driver;
    MakeMyTripTrain_Elements makemytriptrain_elements;

    public MakeMyTripTrain_Actions(Driver_Steps driver_steps) {
        this.driver = driver_steps.getDriver();
        makemytriptrain_elements = new MakeMyTripTrain_Elements(driver);
    }

    public void displayOfOptions() {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.displayofoptions));

    }

    public void enterFromLocation(String FromLocation) {

        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
    }

    public void ListValues(List<WebElement> elementsList, String featureValue) {
        try {
            Thread.sleep(1000);
            for (WebElement element : elementsList) {
                if (element.getText().equalsIgnoreCase(featureValue)) {
                    element.isEnabled();
                    Thread.sleep(1000);
                    element.click();
                    break;
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Exception is " + e);
        }
    }

    public void travelDate(String n) {

        int count = driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).size();
        for (int i = 2; i <= count; i++) {
            String text = driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).getText();
            if (text.equalsIgnoreCase(n)) {
                driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).click();
                break;
            }
        }
    }

    public void clicksearchbtn() {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.searchbtn)).click();

    }

    public void trainTicketBooking() {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.quickFilter));
    }

    public void departureDate(String date) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[@class='dateNoOcc' and contains(text()," + "'" + date + "')]")).click();
    }


    public void availableTrainTicket(String trainName, String className) throws InterruptedException {
        List<WebElement> trainNames = driver.findElements(By.cssSelector(".train-name"));
        List<WebElement> classNames = driver.findElements(By.cssSelector(".rail-class"));
        for (int i = 0; i < trainNames.size(); i++) {
            WebElement currentTrain = trainNames.get(i);

            if (currentTrain.getText().equalsIgnoreCase(trainName)) {
                for (int j = 0; j < classNames.size(); j++) {
                    WebElement currentClass = classNames.get(j);

                    if (currentClass.getText().equalsIgnoreCase(className) && currentClass.isEnabled()) {
                        currentClass.click();
                        break;
                    }
                }
                break;
            }
        }
    }

    public void displayTravellerPage() throws InterruptedException {

        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.displaySelectTraveller));

    }

    public void clickBoardingDropdown() {
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.clickboardingDropdown)).click();
    }

    public void AddTravellerInformation() throws InterruptedException {
        makemytriptrain_elements.addtraveller.click();
        Thread.sleep(3000);
        makemytriptrain_elements.name.sendKeys("Nawaz");
        makemytriptrain_elements.age.sendKeys("29");
        makemytriptrain_elements.selectGender.click();
    }

    public void selectBerthPreference() {

        makemytriptrain_elements.selectberthpreference.click();
    }

    public void addbtn() {
        makemytriptrain_elements.addBtn.click();
    }

    public void provideIRCTCusername() throws InterruptedException {
        makemytriptrain_elements.irctcUserName.click();
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.IRCTCUserName)).sendKeys("irctc");
        makemytriptrain_elements.SubmitBtn.click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
    }

    public void contactInformation() throws InterruptedException {
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.contactEmail)).sendKeys("test@yopmail.com");
        makemytriptrain_elements.contactMobile.sendKeys("7036705697");
        driver.findElement(By.xpath("//ul/li/div/div/span[1]/span/span[1]")).click();
        driver.findElement(By.xpath("//p[text()='Confirm and save billing details to your profile']")).click();
    }

    public void bookAndPay() throws InterruptedException {
        Thread.sleep(3000);
        makemytriptrain_elements.PayNow.click();
    }

    public void ToLocationDetails() throws InterruptedException {
        makemytriptrain_elements.tolocation.sendKeys("Nizamabad");
        GlobalWait.wait.until(ExpectedConditions.visibilityOf(makemytriptrain_elements.selectToLocation)).click();
    }
}

