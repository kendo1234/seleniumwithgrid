package Tests;

import Components.GoogleHome;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    static WebDriver driver;

    //Setup Driver
    @BeforeClass
    public static void setupTest() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();        //For Firefox use below capabilities
        //DesiredCapabilities caps = DesiredCapabilities.firefox();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
    }

    @Test
    public void goToGoogle() {
        //Navigate to google.com
        GoogleHome home = new GoogleHome(driver);
        home.performSearch();

    }

    //Close Driver
    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}