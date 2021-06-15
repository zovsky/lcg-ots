package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class DMAPage extends BasePage {

    public SelenideElement otsDmaHero = $(".dma-promo").$(".btn.scheduleLink");
    public SelenideElement otsDmaCard = $$(".locationCard").first().$(".scheduleLink.iframeLightBoxLink");
    private SelenideElement pinA = $("#gmimap0").parent();
    public SelenideElement otsDmaMap = $(".scheduleLink.gMapOTSlink");


    public DMAPage(String pageUrl) {
        super(pageUrl);
    }

    public void openSchoolBalloon() {
        sleep(2000);
        pinA.click();
    }
}
