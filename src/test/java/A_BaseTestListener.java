import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import helpers.Driver;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

import static helpers.Driver.currentDriver;

public class A_BaseTestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult TestResult) {
    }

    @Override
    public void onTestFailure(ITestResult result) {

//        Object currentClass = result.getInstance();
//        WebDriver webDriver = (Driver) currentClass.currentDriver();
//
//        if (webDriver != null)
//        {
//            System.out.println("Attaching a screenshot of the failed step");
//            Allure.addAttachment("Screenshot of the failed step", new ByteArrayInputStream(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES)));
//        }
        //Driver.takeScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult TestResult) {
        //currentDriver().quit();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult TestResult) {
    }

    @Override
    public void onStart(ITestContext TestContext) {
    }

    @Override
    public void onFinish(ITestContext TestContext) {
    }
}
