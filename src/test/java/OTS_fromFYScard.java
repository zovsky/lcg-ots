import helpers.Retry;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (value = AssumptionListener.class)
public class OTS_fromFYScard extends A_BaseTest {

    public boolean schoolBrands() {
        return true;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "schoolBrands")
    public void t01_submitOTSfromSchoolPage() {
        app.schoolPage.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }
}
