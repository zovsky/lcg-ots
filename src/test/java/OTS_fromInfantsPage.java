import com.codeborne.selenide.Condition;
import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners (value = AssumptionListener.class)
public class OTS_fromInfantsPage extends A_BaseTest {

    public boolean onlyDomainsThatHaveOTSOnInfantsPage() {
        if (Arrays.asList("lapetite.com", "tutortime.com", "childtime.com", "childrenscourtyard.com")
                .contains(TestConfig.domain)) return true;
        else {
            app.homePage.open();
            return false;
        }
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveOTSOnInfantsPage")
    public void t01_submitOTSfromInfantsPage() {
        app.infantsPage.open();
        app.openOTSfrom(otsStartLocation); //infants
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithoutSchoolPreselected();
    }
}
