package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.BrandDataSwitch;
import helpers.TestConfig;

import static com.codeborne.selenide.Selenide.*;

public class DMAPage extends BasePage {

    public SelenideElement otsDmaHero = $(".dma-promo").$(".btn.scheduleLink");
    public SelenideElement otsDmaCard = $$(".locationCard").first().$(".scheduleLink.iframeLightBoxLink");
    public SelenideElement otsDmaCrossBrandCard = $$(".locationCard.crossBrand").first().$(".scheduleLink.iframeLightBoxLink");
    public SelenideElement schoolNameLinkFirstCrossBrand = $$(".locationCard.crossBrand").first().$(".schoolNameLink");
    public SelenideElement pinA = $x("//div[@aria-label='A']");//$("#gmimap0").parent();
    public SelenideElement otsDmaMap = $(".scheduleLink.gMapOTSlink");
    public SelenideElement locationField = $("#location");
    public SelenideElement fysSearchBtn = $("#fysSearchBtn");
    public SelenideElement crossBrandCardLetter = $$(".locationCard.crossBrand").first().$(".pinLabel");


    public DMAPage(String pageUrl) {
        super(pageUrl);
    }

    public void openSchoolBalloonPinA() {
        sleep(2000);
        pinA.click();
    }

    public void openSchoolBalloonCrossBrand() {
        sleep(2000);
        String x = crossBrandCardLetter.getText();
        String xpath = String.format("//div[@aria-label='%s']", x);
        SelenideElement pinX = $x(xpath);
        pinX.click();
    }

    public void openDMAPageCrossBrand() {
        String url = TestConfig.env + BrandDataSwitch.getCrossBrandForDMA() + "/area/akron";
        Selenide.open(url);
    }

    public void searchForLocation() {
        locationField.setValue(BrandDataSwitch.getLCGandB2Bsearch());
        fysSearchBtn.click();
        $(".loading-circle").should(Condition.disappear);
    }
}
