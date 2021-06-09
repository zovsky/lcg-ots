import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners (value = AssumptionListener.class)
public class OTS_fromVisitUsPromo extends A_BaseTest {

    public boolean onlyDomainsThatHaveVisitUsPromo() {
        if (Arrays.asList("lapetite.com", "tutortime.com", "childtime.com",
                "childrenscourtyard.com", "creativekidslearningcenter.com")
                .contains(TestConfig.domain)) return true;
        else {
            app.homePage.open();
            return false;
        }
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveVisitUsPromo")
    public void t01_submitOTSfromVisitUsPromo() {
        app.visitUsPromo.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithoutSchoolPreselected();
    }
}
