package app;

import app.components.VisitUsPromo;
import app.navigation.EyeBrow;
import app.navigation.Footer;
import app.navigation.NavUtility;
import app.pages.*;
import helpers.BrandDataSwitch;
import helpers.TestConfig;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/login");
    }

    public static HomePage buildHomePage() {
        return new HomePage("/");
    }

    public static OTSframe buildOTSFrame() {
        return new OTSframe();
    }

    public static EyeBrow buildEyeBrow() {
        return new EyeBrow();
    }

    public static NavUtility buildNavUtility() {
        return new NavUtility();
    }

    public static Footer buildFooter() {
        return new Footer();
    }

    public static InfantsPage buildInfantsPage() { //TT CT LPA CCY
        return new InfantsPage("/educational-programs/curriculum/infants/");
    }

    public static VisitUsPromo buildVisitUsPromo() { //TT LPA CK CT CCY
        if (TestConfig.domain.contains("lapetite.com")) return new VisitUsPromo("/child-care-centers");
        else return new VisitUsPromo("/education");
    }

    public static SchoolPage buildSchoolPage() {
        return new SchoolPage(BrandDataSwitch.getSchoolPageURL());
    }

    public static FYSResultsPage buildFYSResultsPage() {
        return new FYSResultsPage(BrandDataSwitch.getFYSResultsPageURL());
    }

    public static DMAPage buildDmaPage() {
        return new DMAPage(BrandDataSwitch.getDMAPageURL());
    }

    public static CampaignPage buildCampaignPage() {
        return new CampaignPage(BrandDataSwitch.getCampaignPageURL());
    }

    public static LCGFYSPage buildLCGFYSResultsPage() {
        return new LCGFYSPage(TestConfig.env + "learningcaregroup.com/about-us/find-a-school/");
    }
}

