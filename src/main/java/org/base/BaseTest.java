package org.base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
public class BaseTest {
    //@BeforeSuite//hierarchy of annots
//@BeforeClass
//@BeforeTest
//@BeforeMethod


    @BeforeClass(alwaysRun = true, description = "Creating configs for our tests")
    public void configuration(){
        Configuration.holdBrowserOpen = true;//if test die browser is still open
        Configuration.startMaximized = true;//full window
//        Configuration.browserSize = "1920x1080";//we can tell in what size to open window
        Configuration.screenshots = true;//if test die we can find screenshots in one of our packages(build)
        Configuration.headless = true;//test run in "silent mode"
        Configuration.pageLoadStrategy = "normal";//speed od page loading
        Configuration.pageLoadTimeout= 20000;//
        Configuration.timeout = 10000;//time to start looking for element
//        Configuration.reportsFolder= "screenshots
    }

    @BeforeMethod(alwaysRun = true, description = "opening base url")
    public void setUp(){
        Selenide.open("https://www.google.com");
    }

    @AfterMethod(alwaysRun = true, description = "web driver clean up")
    public void cleanWebDriver(){
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        Selenide.open("about blanc");
    }
    @AfterSuite(alwaysRun = true, description = "closing web driver")
    public void tearDown(){
    Selenide.closeWebDriver();
    }


}
//commands:
//start all tests --  mvn clean test
//start one specific --  mvn clean -Dtest=FirstTest
//start package --  mvn clean '-Dtest=testPackage.*Test' test

