package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FYSResultsPage extends BasePage {

    public SelenideElement otsFYSResultsCard = $$(".locationCard").first().$(".scheduleLink.iframeLightBoxLink");
    public SelenideElement otsFYSResultsMap = $(".scheduleLink.gMapOTSlink");
    public SelenideElement pinA = $("#gmimap0").parent();
    public SelenideElement showMap = $(".showMap");

    public FYSResultsPage(String pageUrl) {
        super(pageUrl);
    }

    public void openSchoolBalloon() {
        showMap.click();
        pinA.click();
    }
}
