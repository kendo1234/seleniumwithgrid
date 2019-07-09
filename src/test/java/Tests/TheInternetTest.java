package Tests;

import Components.TheInternetHome;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TheInternetTest {

    static WebDriver driver;

        @BeforeClass
        public static void setupTest() throws MalformedURLException {

                DesiredCapabilities dcap = DesiredCapabilities.chrome();
                ChromeOptions options = new ChromeOptions();
                dcap.setCapability(ChromeOptions.CAPABILITY, options);
                dcap.setBrowserName("chrome");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dcap);
            }

        @Test
        public void addElement() {
            TheInternetHome home = new TheInternetHome(driver);
            home.testAddElementFunctionality();

            }
    //Close Driver
    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}

