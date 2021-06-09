package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SchoolPage extends BasePage {

    public SelenideElement otsSchoolPageInfo = $(".school-info").$(".scheduleLink.iframeLightBoxLink.btn");
    public SelenideElement otsSchoolPageTwoCTAsPromo = $$(".promo").last().$(".scheduleLink.iframeLightBoxLink.btn");

    public SchoolPage(String pageUrl) {
        super(pageUrl);
    }
}
