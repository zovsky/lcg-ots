package app;

import app.pages.HomePage;
import app.pages.LoginPage;
import app.pages.OTSframe;

public class App {

    public  OTSframe otsFrame;
    public LoginPage loginPage;
    public HomePage homePage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        homePage = PageBuilder.buildHomePage();
        otsFrame = PageBuilder.buildOTSFrame();
    }
}
