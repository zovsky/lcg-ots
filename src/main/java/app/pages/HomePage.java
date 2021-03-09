package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    public SelenideElement otsEyebrow = $(".eyebrow").$(".scheduleLink");

    public HomePage(String pageUrl) {
        super(pageUrl);
    }
}
