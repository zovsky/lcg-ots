package app.pages;
import com.codeborne.selenide.Selenide;
import helpers.TestConfig;
import helpers.Trim;

public abstract class BasePage {

    protected String pageUrl;

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = Trim.rtrim(TestConfig.baseUrl, "/") + "/" + Trim.ltrim(pageUrl, "/");
        Selenide.open(url);
    }
}
