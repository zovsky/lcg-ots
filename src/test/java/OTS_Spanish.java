import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

@Listeners (value = AssumptionListener.class)
public class OTS_Spanish extends A_BaseTest {

    public boolean onlyOnProdDomainsThatHaveSpanish() {
        if (Arrays.asList("lapetite.com", "tutortime.com", "childtime.com", "childrenscourtyard.com",
                "montessori.com", "creativekidslearningcenter.com")
                .contains(TestConfig.domain) && TestConfig.env.equals("https://www.")) return true;
        else {
            app.homePage.open();
            return false;
        }
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyOnProdDomainsThatHaveSpanish")
    public void t01_submitSpanishOTS() {
        app.homePage.openSpanish();
        app.openOTSfrom(otsStartLocation); //eyebrow
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithoutSchoolPreselected();
    }
}
