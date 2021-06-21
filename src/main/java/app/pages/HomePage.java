package app.pages;

import com.codeborne.selenide.Selenide;
import helpers.TestConfig;

public class HomePage extends BasePage {

    public HomePage(String pageUrl) {
        super(pageUrl);
    }

    public void openSpanish() {
        String url = "https://es." + TestConfig.domain;
        Selenide.open(url);
    }
}
