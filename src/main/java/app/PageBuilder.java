package app;

import app.components.VisitUsPromo;
import app.navigation.EyeBrow;
import app.navigation.Footer;
import app.navigation.NavUtility;
import app.pages.*;
import helpers.BrandDataSwitch;
import helpers.TestConfig;

import java.util.Arrays;

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

    public static VisitUsPromo buildVisitUsPromo() { //TT LPA CK CT CCY YS
        if (Arrays.asList("lapetite.com").contains(TestConfig.domain)) return new VisitUsPromo("/child-care-centers");
        else if (Arrays.asList("youngschool.com").contains(TestConfig.domain)) return new VisitUsPromo("/education/teachers");
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

    public static LCGFYSPage buildLCGFYSPage() {
        return new LCGFYSPage(TestConfig.env + "learningcaregroup.com/about-us/find-a-school/");
    }

    public static B2BFYSPage buildB2BFYSPage() {
        return new B2BFYSPage(TestConfig.env + "learningcaregroup.com/about-us/find-a-school/");
    }

    public static LCGFYSResultsPage buildLCGFYSResultsPage() {
        return new LCGFYSResultsPage("");
    }

    public static B2BFYSResultsPage buildB2BFYSResultsPage() {
        return new B2BFYSResultsPage("");
    }
}

