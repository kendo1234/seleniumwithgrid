package Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheInternetHome extends DriverFactory {
    private WebDriver driver;

    private static String PAGE_URL="https://the-internet.herokuapp.com/";

    @FindBy(css = "#content > ul > li:nth-child(2) > a")
    private WebElement addElementLink;

    public TheInternetHome(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);

    }

    public void testAddElementFunctionality() {
        addElementLink.click();
    }


}
