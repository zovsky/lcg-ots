import helpers.Retry;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (value = AssumptionListener.class)
public class OTS_fromFYSResults extends A_BaseTest {

    public boolean allDomainsAllowed() {
        return true;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "allDomainsAllowed")
    public void t01_submitOTSfromFYSCard() {
        app.fysResultsPage.open();
        app.openOTSfrom(otsStartLocation); //fyscard
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "allDomainsAllowed")
    public void t02_submitOTSfromFYSMap() {
        app.fysResultsPage.open();
        app.fysResultsPage.openSchoolBalloon();
        app.openOTSfrom(otsStartLocation); //fysmap
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }
}
