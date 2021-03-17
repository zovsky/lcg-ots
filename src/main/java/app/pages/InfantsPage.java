package app.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class InfantsPage extends BasePage {

    public SelenideElement otsInfants = $(".btn.scheduleLink");

    public InfantsPage(String pageUrl) {
        super(pageUrl);
    }

}
