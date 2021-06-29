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

    public B2BFYSPage b2bFYSPage;
    public B2BFYSResultsPage b2bFYSResultsPage;
    public CampaignPage campaignPage;
    public DMAPage dmaPage;
    public FYSResultsPage fysResultsPage;
    public HomePage homePage;
    public InfantsPage infantsPage;
    public LoginPage loginPage;
    public LCGFYSPage lcgFYSPage;
    public LCGFYSResultsPage lcgFYSResultsPage;
    public OTSframe otsFrame;
    public SchoolPage schoolPage;

    public App() {
        visitUsPromo = PageBuilder.buildVisitUsPromo();

        eyeBrow = PageBuilder.buildEyeBrow();
        footer = PageBuilder.buildFooter();
        navUtility = PageBuilder.buildNavUtility();

        b2bFYSPage = PageBuilder.buildB2BFYSPage();
        b2bFYSResultsPage = PageBuilder.buildB2BFYSResultsPage();
        campaignPage = PageBuilder.buildCampaignPage();
        dmaPage = PageBuilder.buildDmaPage();
        fysResultsPage = PageBuilder.buildFYSResultsPage();
        homePage = PageBuilder.buildHomePage();
        infantsPage = PageBuilder.buildInfantsPage();
        loginPage = PageBuilder.buildLoginPage();
        lcgFYSPage = PageBuilder.buildLCGFYSPage();
        lcgFYSResultsPage = PageBuilder.buildLCGFYSResultsPage();
        otsFrame = PageBuilder.buildOTSFrame();
        schoolPage = PageBuilder.buildSchoolPage();

    }

    public void openOTSfrom(String startingLocator) {
        switch (startingLocator)
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
            case "dmahero":
                dmaPage.otsDmaHero.click();
                break;
            case "dmacard":
                dmaPage.otsDmaCard.click();
                break;
            case "dmacardcrossbrand":
                dmaPage.otsDmaCrossBrandCard.click();
                break;
            case "dmamap":
                dmaPage.otsDmaMap.click();
                break;
            case "campaign":
                campaignPage.otsCampaign.click();
                break;
        }
    }
}
