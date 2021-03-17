import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

@Listeners (value = AssumptionListener.class)
public class OTS_fromSchoolPage extends A_BaseTest {

    public boolean visitUsBrands() {
        if (Arrays.asList("lapetite.com", "tutortime.com", "childtime.com", "childrenscourtyard.com", "creativekidslearningcenter.com")
                .contains(TestConfig.domain)) return true;
        else return false;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "visitUsBrands")
    public void t01_submitOTSfromVisitUsPromo() {
        app.visitUsPromo.open();
        app.openOTSfrom(otsStartLocation);
        app.otsFrame.switchToFrame();
//        app.otsFrame.searchForLocation();
//        app.otsFrame.clickSearchButton();
//        app.otsFrame.selectFirstSchool();
//        app.otsFrame.clickNextConfirmSchoolButton();
//        app.otsFrame.selectInPersonTour();
//        app.otsFrame.selectTomorrow();
//        app.otsFrame.selectSecondTimeslot();
//        sleep(3000);
//        app.otsFrame.clickNextButtonCalendar(); //todo uncomment
//        app.otsFrame.fillOTSFormAndSubmit();
//        Assert.assertEquals(app.otsFrame.thankYou.shouldBe(Condition.visible).getText(),
//                "Thank You!");
    }
}
