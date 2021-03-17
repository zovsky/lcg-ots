package app.components;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class VisitUsPromo extends BasePage {

    public SelenideElement otsVisitUs = $(".btn.scheduleLink.iframeLightBoxLink");

    public VisitUsPromo(String pageUrl) {
        super(pageUrl);
    }


}
