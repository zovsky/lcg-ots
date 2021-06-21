package app.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.BrandDataSwitch;
import helpers.TestConfig;

import static com.codeborne.selenide.Selenide.$;

public class B2BFYSPage extends BasePage {

    public SelenideElement locationField = $("#location");
    public SelenideElement brandDropDown = $("#brand");

    public B2BFYSPage(String pageUrl) {
        super(pageUrl);
    }

    public void open() {
        String url = TestConfig.env + "mylearningcaregroup.com/dominos/find-a-school/";
        Selenide.open(url);
    }

    public void searchForLocation() {
        locationField.setValue(BrandDataSwitch.getLCGandB2Bsearch()).submit();
    }

    public void selectBrand() {
        brandDropDown.selectOption(BrandDataSwitch.getBrandForDropDown());
    }
}
