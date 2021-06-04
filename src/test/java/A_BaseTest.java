import app.App;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import helpers.Driver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import static helpers.Driver.currentDriver;

class A_BaseTest {

    protected App app;
    protected SoftAssert softAssert;
    protected Logger logger;
    protected String otsStartLocation;

    @BeforeClass
    @Parameters("otsStartLocation")
    public void setUp(String otsStartLocation) {

        Driver.initDriver();

        this.otsStartLocation = otsStartLocation;

        app = new App();
        softAssert = new SoftAssert();

        logger = LogManager.getLogger("");
        DOMConfigurator.configure("src/main/resources/log4j.xml");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {

        try {
            if (result.getStatus() == ITestResult.FAILURE) {
                Driver.takeScreenshot();
            } else if (result.getStatus() == ITestResult.SKIP) {
            } else if (result.getStatus() == ITestResult.SUCCESS){
                Driver.getBrowserLogs(); //get browser console logs and attach to the report
                Driver.clearCookies();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    public void tearDown() {
        Driver.close();
    }
}
