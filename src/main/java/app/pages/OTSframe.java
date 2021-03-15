package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class OTSframe {

    //step1
    public SelenideElement locationField = $("#location");
    public SelenideElement panelText = $(".panel-text");
    public SelenideElement searchButton = $("#Panel1SubmitBtn");

    public void searchForLocation () {
        switch (TestConfig.domain) {
            case "tutortime.com":
                locationField.shouldBe(Condition.visible).setValue("TX");
                break;
        }
    }

    public void clickSearchButton() {
        searchButton.shouldBe(Condition.enabled).click();
    }

    //step2
    public SelenideElement resultSummary = $(".result-summary");
    public SelenideElement cityState = $$(".school-results").first().$(".org");
    public SelenideElement selectFirstSchoolButton = $$(".school-results").first().$(".linkText");
    public void selectFirstSchool() {
        selectFirstSchoolButton.shouldBe(Condition.enabled).click();
    }

    //step3
    public SelenideElement virtualText = $("#confirm-school-form").$(By.tagName("p"));
    public SelenideElement nextConfirmSchoolButton = $(".selected-school").$("#Panel3SubmitBtn");
    public void clickNextConfirmSchoolButton() {
        nextConfirmSchoolButton.shouldBe(Condition.visible).click();
    }

    //step4
    public SelenideElement selectTypeText = $(".ots-form-panel-99").$(By.tagName("h3"));
    public SelenideElement virtualTourButton = $("#VirtualTourHeader");
    public SelenideElement inPersonTourButton = $("#InPersonTourHeader");

    //step5 calendar
    public SelenideElement selectedSchoolName = $$(".selected-school-name").first();
    public SelenideElement tomorrow = $$("a.ui-state-default").get(1);
    public SelenideElement secondTimeslot = $$("a.timeslot").get(1);
    public SelenideElement nextButtonCalendar = $("#date-time-form").$(".backNextWrapper").$(".nextLink");

    //step6 form
    public SelenideElement instructions = $(".instructions");
    public SelenideElement firstName = $("#Ots-FirstName");
    public SelenideElement lastName = $("#Ots-LastName");
    public SelenideElement phone = $("#tour-phone");
    public SelenideElement email = $("#tour-email");
    public SelenideElement child1Name = $("#child1fName");
    public SelenideElement child1bDay = $("#child1bDay");
    public SelenideElement submitButton = $("#Panel5SubmitBtn");

    public SelenideElement thankYou = $(".confirmation-panel").$(By.tagName("h2"));

    public OTSframe() {}

    public void switchToFrame() {
        Selenide.switchTo().frame("iFrameResizer0");
    }

    public void typeDate(String string) {
        for (char i : string.toCharArray()) {
            child1bDay.sendKeys("" + i);
            sleep(10);
        }
    }
}
