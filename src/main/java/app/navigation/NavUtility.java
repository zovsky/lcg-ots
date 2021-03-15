package app.navigation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NavUtility {

    public SelenideElement otsNavUtility = $(".util-nav").$(".tour");

    public SelenideElement otsFooter;// = $(".util-nav").$(".tour");

    public NavUtility() {

    }


}
