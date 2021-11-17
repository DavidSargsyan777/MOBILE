package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.EpamTestLoc;

public class NativePageObject {
    @AndroidFindBy(id = EpamTestLoc.LOC + "register_button")
    WebElement regBtn;
    @AndroidFindBy(id = EpamTestLoc.LOC + "registration_email")
    WebElement regEmail;
    @AndroidFindBy(id = EpamTestLoc.LOC + "registration_username")
    WebElement regUserName;
    @AndroidFindBy(id = EpamTestLoc.LOC + "registration_password")
    WebElement regPassword;
    @AndroidFindBy(id = EpamTestLoc.LOC + "registration_confirm_password")
    WebElement regConfPassword;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckedTextView")
    WebElement regConfConditions;
    @AndroidFindBy(id = EpamTestLoc.LOC + "register_new_account_button")
    WebElement regNewAccBtn;
    @AndroidFindBy(id = EpamTestLoc.LOC + "login_email")
    WebElement singInEmail;
    @AndroidFindBy(id = EpamTestLoc.LOC + "login_pwd")
    WebElement singInPassword;
    @AndroidFindBy(id = EpamTestLoc.LOC + "email_sign_in_button")
    WebElement signInBtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView")
    WebElement budgetActivityPage;

    public NativePageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
}
