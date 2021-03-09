package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class OTSframe {

    public SelenideElement locationField = $("#location");

    public SelenideElement panelText = $(".panel-text");

    public SelenideElement searchButton = $("#Panel1SubmitBtn");

    public SelenideElement resultSummary = $(".result-summary");

    public OTSframe() {
        super();
    }

    public void switchToFrame() {
        Selenide.switchTo().frame("iFrameResizer0");
    }
}
