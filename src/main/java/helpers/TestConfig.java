package helpers;

public class TestConfig {

    public static String browser = "chrome";
    public static String headless = "0";
    public static String domain = "tutortime.com";
    public static String env = "https://qa.";
    public static String baseUrl = "https://qa.tutortime.com/";

    public static void initConfig() {
        /*mvn test -Dbrowser=chrome
                   -Dheadless=0
                   -Ddomain=lpa
                   -Denv=qa
                   -DsuiteXmlFile=src/test/resources/testng.xml

          mvn test -Dbrowser=chrome
                   -Dheadless=0
                   -Ddomain=tt
                   -Denv=qa
                   -DsuiteXmlFile=target/surefire-reports/testng-failed.xml

         */

        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        headless = System.getProperty("headless") == null ? "0" : System.getProperty("headless");
        domain = System.getProperty("domain") == null ? "tutortime" : System.getProperty("domain");
        env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
    }

    public static boolean isHeadless() {
        return headless.contains("1");
    }
}
