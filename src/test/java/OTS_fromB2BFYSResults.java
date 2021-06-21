import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (value = AssumptionListener.class)
public class OTS_fromB2BFYSResults extends A_BaseTest {

    public boolean allDomainsAllowed() {
        return true;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "allDomainsAllowed")
    public void t01_submitOTSfromB2BFYSCard() {
        app.b2bFYSPage.open();
        app.b2bFYSPage.selectBrand();
        app.b2bFYSPage.searchForLocation();
        Assert.assertTrue(app.b2bFYSResultsPage.schoolNameLink.getAttribute("href").contains(TestConfig.domain));
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "allDomainsAllowed")
    public void t02_submitOTSfromB2BFYSMap() {
        app.b2bFYSPage.open();
        app.b2bFYSPage.selectBrand(); //todo enable all b2b brands for dominos on stage
        app.b2bFYSPage.searchForLocation();
        Assert.assertTrue(app.b2bFYSResultsPage.schoolNameLink.getAttribute("href").contains(TestConfig.domain));
        app.b2bFYSResultsPage.openSchoolBalloon();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }
}
