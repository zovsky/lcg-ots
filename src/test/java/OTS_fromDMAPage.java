import com.codeborne.selenide.Selenide;
import helpers.Retry;
import helpers.TestConfig;
import nl.javadude.assumeng.Assumption;
import nl.javadude.assumeng.AssumptionListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Arrays;

@Listeners (value = AssumptionListener.class)
public class OTS_fromDMAPage extends A_BaseTest {

    public boolean onlyDomainsThatHaveDMAInBrand() {
        if (Arrays.asList("lapetite.com", "tutortime.com", "childtime.com", "childrenscourtyard.com", "montessori.com",
                "everbrookacademy.com", "u-gro.com")
                .contains(TestConfig.domain)) return true;
        else {
            app.homePage.open();
            return false;
        }
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveDMAInBrand")
    public void t01_submitOTSfromDMAHero() {
        app.dmaPage.open();
        app.openOTSfrom(otsStartLocation); //dmahero
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithoutSchoolPreselected();
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveDMAInBrand")
    public void t02_submitOTSfromSchoolCard() {
        app.dmaPage.open();
        app.openOTSfrom(otsStartLocation); //dmacard
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveDMAInBrand")
    public void t03_submitOTSfromMap() {
        app.dmaPage.open();
        app.dmaPage.openSchoolBalloonPinA();
        app.openOTSfrom(otsStartLocation); //dmamap
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }

    public boolean onlyDomainsThatHaveDMACrossBrand() { //todo cross-brand
        return true;
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveDMACrossBrand")
    public void t04_submitOTSfromSchoolCard() {
        app.dmaPage.openDMAPageCrossBrand();
        app.dmaPage.searchForLocation();
        Assert.assertTrue(app.dmaPage.schoolNameLinkFirstCrossBrand.getAttribute("href").contains(TestConfig.domain));
        app.openOTSfrom(otsStartLocation); //dmacardcrossbrand
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }

    @Test (enabled = true, retryAnalyzer = Retry.class)
    @Assumption(methods = "onlyDomainsThatHaveDMACrossBrand")
    public void t05_submitOTSfromMap() {
        app.dmaPage.openDMAPageCrossBrand();
        app.dmaPage.searchForLocation();
        Assert.assertTrue(app.dmaPage.schoolNameLinkFirstCrossBrand.getAttribute("href").contains(TestConfig.domain));
        app.dmaPage.openSchoolBalloonCrossBrand();
        app.openOTSfrom(otsStartLocation); //dmamap
        app.otsFrame.switchToFrame();
        app.otsFrame.submitOTSwithSchoolPreselected();
    }
}
