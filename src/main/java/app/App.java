package app;

import app.components.VisitUsPromo;
import app.navigation.EyeBrow;
import app.navigation.Footer;
import app.navigation.NavUtility;
import app.pages.HomePage;
import app.pages.LoginPage;
import app.pages.OTSframe;
import app.pages.InfantsPage;

public class App {

    public OTSframe otsFrame;
    public LoginPage loginPage;
    public HomePage homePage;
    public EyeBrow eyeBrow;
    public NavUtility navUtility;
    public Footer footer;
    public InfantsPage infantsPage;
    public VisitUsPromo visitUsPromo;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        homePage = PageBuilder.buildHomePage();
        otsFrame = PageBuilder.buildOTSFrame();
        eyeBrow = PageBuilder.buildEyeBrow();
        navUtility = PageBuilder.buildNavUtility();
        footer = PageBuilder.buildFooter();
        infantsPage = PageBuilder.buildInfantsPage();
        visitUsPromo = PageBuilder.buildVisitUsPromo();

    }

    public void openOTSfrom(String ots) {
        switch (ots)
        {
            case "eyebrow":
                eyeBrow.otsEyebrow.click();
                break;
            case "navutil":
                navUtility.otsNavUtility.click();
                break;
            case "footer":
                footer.otsFooter.scrollTo().click();
                break;
            case "infants": //TT, LPA, CT, CCY
                infantsPage.otsInfants.scrollTo().click();
                break;
            case "visitus": //TT, LPA, CT, CCY, CK
                visitUsPromo.otsVisitUs.scrollTo().click();
                break;
            default:
                eyeBrow.otsEyebrow.click();
                break;
        }
    }
}
