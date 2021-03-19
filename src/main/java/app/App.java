package app;

import app.components.VisitUsPromo;
import app.navigation.EyeBrow;
import app.navigation.Footer;
import app.navigation.NavUtility;
import app.pages.*;

public class App {

    public VisitUsPromo visitUsPromo;

    public EyeBrow eyeBrow;
    public Footer footer;
    public NavUtility navUtility;

    public FYSResultsPage fysResultsPage;
    public HomePage homePage;
    public InfantsPage infantsPage;
    public LoginPage loginPage;
    public OTSframe otsFrame;
    public SchoolPage schoolPage;

    public App() {
        visitUsPromo = PageBuilder.buildVisitUsPromo();

        eyeBrow = PageBuilder.buildEyeBrow();
        footer = PageBuilder.buildFooter();
        navUtility = PageBuilder.buildNavUtility();

        fysResultsPage = PageBuilder.buildFYSResultsPage();
        homePage = PageBuilder.buildHomePage();
        infantsPage = PageBuilder.buildInfantsPage();
        loginPage = PageBuilder.buildLoginPage();
        otsFrame = PageBuilder.buildOTSFrame();
        schoolPage = PageBuilder.buildSchoolPage();

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
            case "schoolinfo":
                schoolPage.otsSchoolPageInfo.click();
                break;
            case "twoctaspromo":
                schoolPage.otsSchoolPageTwoCTAsPromo.click();
                break;
            case "fyscard":
                fysResultsPage.otsFYSResultsCard.click();
                break;
            case "fysmap":
                fysResultsPage.otsFYSResultsMap.click();
                break;
            default:
                eyeBrow.otsEyebrow.click();
                break;
        }
    }
}
