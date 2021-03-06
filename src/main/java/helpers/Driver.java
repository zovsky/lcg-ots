package helpers;

import com.codeborne.selenide.*;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.codeborne.selenide.Selenide.sleep;

public class Driver {

    public static void initDriver() {

        // Get settings from command line
        TestConfig.initConfig();



        // Set settings for selenide browser
        Configuration.pageLoadStrategy = "normal"; //normal-eager-none
        Configuration.timeout = 20000;
        Configuration.browserSize = "1500x1100";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;

        if(TestConfig.isHeadless()) {
            Configuration.headless = true;
        } else {
            Configuration.headless = false;
        }

        switch (TestConfig.browser)
        {
            case "chrome":
                Configuration.browser = Browsers.CHROME;
                break;
            case "firefox":
                Configuration.browser = Browsers.FIREFOX;
                break;
            case "edge":
                Configuration.browser = Browsers.EDGE;
                break;
        }

        switch (TestConfig.domain)
        {
            case "tt":
                TestConfig.domain = "tutortime.com";
                break;
            case "pla":
                TestConfig.domain = "pathwayslearningacademy.com";
                break;
            case "mu":
                TestConfig.domain = "montessori.com";
                break;
            case "lpa":
                TestConfig.domain = "lapetite.com";
                break;
            case "ea":
                TestConfig.domain = "everbrookacademy.com";
                break;
            case "ck":
                TestConfig.domain = "creativekidslearningcenter.com";
                break;
            case "ct":
                TestConfig.domain = "childtime.com";
                break;
            case "ccy":
                TestConfig.domain = "childrenscourtyard.com";
                break;
            case "ug":
                TestConfig.domain = "u-gro.com";
                break;
            case "ys":
                TestConfig.domain = "youngschool.com";
                break;
        }

        switch (TestConfig.env)
        {
            case "qa":
                TestConfig.env = "https://qa.";
                break;
            case "stage":
                TestConfig.env = "https://stage.";
                break;
            case "prod":
                TestConfig.env = "https://www.";
                break;
        }

        TestConfig.baseUrl = TestConfig.env+TestConfig.domain;

    }

    public static WebDriver currentDriver() {
        return WebDriverRunner.getWebDriver();
    }

    public static void open(String url) {
        Selenide.open(url);
    }

    public static void refresh() {
        Selenide.refresh();
    }

    public static void executeJs(String script) {
        JavascriptExecutor js = (JavascriptExecutor)currentDriver();
        try {
            js.executeScript(script);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForUrlContains(String urlChunk) {
        WebDriverWait wait = new WebDriverWait(currentDriver(), 10);
        wait.until(ExpectedConditions.urlContains(urlChunk));
    }

    public static void waitForUrlDoesNotContain(String urlChunk) {
        int maxTime = 20;
        while(  currentDriver().getCurrentUrl().contains(urlChunk)  && maxTime > 0) {
            wait(1);
            maxTime--;
        }
    }

    public static void maximize() {
        currentDriver().manage().window().maximize();
    }

    public static void changeWindowSize(int width, int height) {
        currentDriver().manage().window().setSize(new Dimension(width, height));
    }

    public static void clearCookies() {
        //open(TestConfig.baseUrl);
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

    public static void close() {
        currentDriver().quit();
    }

    public static void wait(int seconds)
    {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot() {

        //File scrFile = ((TakesScreenshot) currentDriver()).getScreenshotAs(OutputType.FILE);

        Allure.addAttachment("Screenshot of the failed step", new ByteArrayInputStream(((TakesScreenshot) currentDriver()).getScreenshotAs(OutputType.BYTES)));

//        String path = System.getProperty("user.dir")
//                + File.separator + "test-output"
//                + File.separator + "screenshots"
//                + File.separator + " " + "screenshot_" +  (new SimpleDateFormat("HHmmssSSS").format(new Date())) + ".png";
//        try {
//            FileUtils.copyFile(scrFile, new File(path));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void getBrowserLogs() { //List<LogEntry>
        if (TestConfig.browser.contains("chrome")) {
            sleep(2000);
            LogEntries log = currentDriver().manage().logs().get(LogType.BROWSER);
            List<LogEntry> logList = log.getAll();
            for (LogEntry entry : logList) {
                System.out.println(entry.getLevel() + " " + entry.getMessage());
                Allure.addAttachment("Console log", entry.toString());
            }
        }
        //return logList;
    }

    // COOKIES

    public static void addCookie(Cookie cookie) {
        currentDriver().manage().addCookie(cookie);
    }

    public static Cookie getCookie(String cookieName) {
        return currentDriver().manage().getCookieNamed(cookieName);
    }

    public static void deleteCookie(String cookieName) {
        currentDriver().manage().deleteCookieNamed(cookieName);
    }

}
