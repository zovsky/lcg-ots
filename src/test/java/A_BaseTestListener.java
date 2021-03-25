import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import helpers.Driver;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        System.out.println("Attaching a screenshot of the failed step");
        Allure.addAttachment("Screenshot of the failed step", new ByteArrayInputStream(((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES)));
    }

    @Override
    public void onTestSkipped(ITestResult TestResult) {
        currentDriver().getTitle();
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
