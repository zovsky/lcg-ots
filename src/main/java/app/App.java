package app;

import app.navigation.EyeBrow;
import app.navigation.Footer;
import app.navigation.NavUtility;
import app.pages.HomePage;
import app.pages.LoginPage;
import app.pages.OTSframe;

public class App {

    public OTSframe otsFrame;
    public LoginPage loginPage;
    public HomePage homePage;
    public EyeBrow eyeBrow;
    public NavUtility navUtility;
    public Footer footer;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        homePage = PageBuilder.buildHomePage();
        otsFrame = PageBuilder.buildOTSFrame();
        eyeBrow = PageBuilder.buildEyeBrow();
        navUtility = PageBuilder.buildNavUtility();
        footer = PageBuilder.buildFooter();

    }

    public void openOTSfrom(String ots) {
        switch (ots)
        {
            case "eyebrow":
                eyeBrow.otsEyebrow.click();
                break;
            case "navutility":
                navUtility.otsNavUtility.click();
                break;
            default:
                eyeBrow.otsEyebrow.click();
                break;
        }
    }
}
