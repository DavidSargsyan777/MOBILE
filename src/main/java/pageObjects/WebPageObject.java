package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import utils.GoogleSearchField;

public class WebPageObject {
    private GoogleSearchField googleSearchField;

    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
        googleSearchField = new GoogleSearchField(appiumDriver);
    }

    public GoogleSearchField getGoogleSearchField() {
        return googleSearchField;
    }
}
