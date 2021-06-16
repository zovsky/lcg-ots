package app.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.BrandDataSwitch;
import helpers.TestConfig;
import helpers.Trim;

import static com.codeborne.selenide.Selenide.*;

public class LCGFYSPage extends BasePage {

    public SelenideElement locationField = $("#location");

    public LCGFYSPage(String pageUrl) {
        super(pageUrl);
    }

    public void open() {
        String url = TestConfig.env + "learningcaregroup.com/about-us/find-a-school/";
        Selenide.open(url);
    }

    public void searchForLocation() {
        locationField.setValue(BrandDataSwitch.getLCGFYSsearch()).submit();
        sleep(5000);
    }
}
