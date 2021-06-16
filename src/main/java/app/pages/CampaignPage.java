package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CampaignPage extends BasePage {

    public SelenideElement otsCampaign = $(".campaign-ctas").$(".btn.scheduleLink.iframeLightBoxLink");

    public CampaignPage(String pageUrl) {
        super(pageUrl);
    }

}
