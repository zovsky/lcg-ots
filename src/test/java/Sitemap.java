import com.codeborne.selenide.Configuration;
import helpers.Retry;
import helpers.TestConfig;
import org.testng.annotations.Test;
import DataProviders.TTsitemap;

import static com.codeborne.selenide.Selenide.open;

public class Sitemap {

    @Test(enabled = true, dataProvider = "TTsitemap", dataProviderClass = TTsitemap.class, retryAnalyzer = Retry.class)
    public void consoleLogs(String url) {
        Configuration.baseUrl = TestConfig.env + TestConfig.domain;
        open(url);

        //get logs and search for severe records
    }
}
