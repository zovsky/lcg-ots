package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    public SelenideElement otsFooter;// = $(".util-nav").$(".tour");

    public HomePage(String pageUrl) {
        super(pageUrl);
    }

}
