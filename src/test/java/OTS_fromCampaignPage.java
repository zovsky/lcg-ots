import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

@Listeners (value = AssumptionListener.class)
public class OTS_fromCampaignPage extends A_BaseTest {

    public boolean onlyDomainsThatHaveOTSOnCampaignPage() {
        if (Arrays.asList("montessori.com", "lapetite.com", "tutortime.com", "childtime.com", "childrenscourtyard.com",
                "everbrookacademy.com")
                .contains(TestConfig.domain)) return true;
        else {
            app.homePage.open();
            return false;
        }
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveOTSOnCampaignPage")
    public void t01_submitOTSfromCampaignPage() {
        app.campaignPage.open();
        app.openOTSfrom(otsStartLocation); //campaign
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithoutSchoolPreselected();
    }
}
