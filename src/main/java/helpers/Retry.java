package helpers;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private final int maxRetryCount = 1;

    public String getResultStatusName(int status) {
        String resultName = null;
        if (status == 1)
            resultName = "SUCCESS";
        if (status == 2)
            resultName = "FAILURE";
        if (status == 3)
            resultName = "SKIP";
        return resultName;
    }


    /*
     * Below method returns 'true' if the test method has to be retried else
     * 'false' and it takes the 'Result' as parameter of the test method that
     * just ran
     * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
     */
    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()) {
            if (retryCount < maxRetryCount) {
                retryCount++;
                result.setStatus(ITestResult.SUCCESS);
                String message = Thread.currentThread().getName() +
                        ": Error in " + result.getName() + " Retrying "
                        + (maxRetryCount + 1 - retryCount) + " more times";
                System.out.println(message);
                Reporter.log(message);
                return true;
            } else {
                result.setStatus(ITestResult.FAILURE);
            }
        }
        return false;
    }
}