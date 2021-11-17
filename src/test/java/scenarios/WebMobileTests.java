package scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.WebPageObject;
import setup.BaseTest;
import utils.Constants;

public class WebMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Make sure that we've opened EPAM google search")
    public void simpleWebTest()
        throws InterruptedException {

        Constants constants = new Constants();

        getDriver().get(constants.getGoogleUrl()); // open Google homepage

        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
            wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        new WebPageObject(getDriver()).getGoogleSearchField().googleSearch("EPAM");

        Thread.sleep(constants.getWaitTime());

        // Check EPAM search in google
        assert (new WebPageObject(getDriver()).getGoogleSearchField().correctRefIsDisplayed().equals(true)) :
            "This is not correct search";

        // Log that test finished
        System.out.println("Google search is done");
    }
}
