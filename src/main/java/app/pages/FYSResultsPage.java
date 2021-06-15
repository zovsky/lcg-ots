package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class FYSResultsPage extends BasePage {

    public SelenideElement otsFYSResultsCard = $$(".locationCard").first().$(".scheduleLink.iframeLightBoxLink");
    public SelenideElement otsFYSResultsMap = $(".scheduleLink.gMapOTSlink");
    private SelenideElement pinA = $("#gmimap0").parent();
    private SelenideElement showMap = $(".showMap");

    public FYSResultsPage(String pageUrl) {
        super(pageUrl);
    }

    public void openSchoolBalloon() {
        showMap.click();
        sleep(2000);
        pinA.click();
    }
}
