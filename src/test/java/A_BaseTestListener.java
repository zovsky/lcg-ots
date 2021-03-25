import helpers.Driver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class A_BaseTestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult TestResult) {
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Driver.takeScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult TestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult TestResult) {
        Driver.takeScreenshot();
    }

    @Override
    public void onStart(ITestContext TestContext) {
    }

    @Override
    public void onFinish(ITestContext TestContext) {
    }
}
