package Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome extends DriverFactory {
    private WebDriver driver;

    private static String PAGE_URL="https://www.google.com/";

    @FindBy(css = ".gLFyf")
    private WebElement searchBox;

    //Page Constructor
    public GoogleHome(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void performSearch() {
        searchBox.clear();
        searchBox.sendKeys("google");
    }


}
