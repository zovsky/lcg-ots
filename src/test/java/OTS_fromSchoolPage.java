import helpers.Retry;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (value = AssumptionListener.class)
public class OTS_fromSchoolPage extends A_BaseTest {

    public boolean allDomains() {
        return true;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "allDomains")
    public void t01_submitOTSfromSchoolPage() {
        app.schoolPage.open();
        app.openOTSfrom(otsStartLocation); //schoolinfo, twoctaspromo
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }
}
