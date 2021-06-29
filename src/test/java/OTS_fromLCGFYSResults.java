import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Listeners (value = AssumptionListener.class)
public class OTS_fromLCGFYSResults extends A_BaseTest {

    public boolean allDomainsAllowed() {
        return true;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "allDomainsAllowed")
    public void t01_submitOTSfromLCGFYSCard() {
        app.lcgFYSPage.open();
        app.lcgFYSPage.searchForLocation();
        Assert.assertTrue(app.lcgFYSResultsPage.schoolNameLink.getAttribute("href").contains(TestConfig.domain));
        app.openOTSfrom(otsStartLocation); //fyscard
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "allDomainsAllowed")
    public void t02_submitOTSfromLCGFYSMap() {
        app.lcgFYSPage.open();
        app.lcgFYSPage.searchForLocation();
        Assert.assertTrue(app.lcgFYSResultsPage.schoolNameLink.getAttribute("href").contains(TestConfig.domain));
        app.lcgFYSResultsPage.openSchoolBalloon();
        app.openOTSfrom(otsStartLocation); //fysmap
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }
}
