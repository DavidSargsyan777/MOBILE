package scenarios;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import setup.BaseTest;
import utils.Constants;

public class NativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button")
    public void simpleNativeTest()
        throws IllegalAccessException, NoSuchFieldException, InstantiationException, InterruptedException {
        Constants constants = new Constants();
        // Register a new account
        getPo().getWelement("regBtn").click();
        getDriver().manage().timeouts().implicitlyWait(constants.getWaitTime(), TimeUnit.SECONDS);
        getPo().getWelement("regEmail").sendKeys("dimkaromka2014@mail.ru");
        getPo().getWelement("regUserName").sendKeys("DAVID");
        getPo().getWelement("regPassword").sendKeys("DAVIDEpa777");
        getPo().getWelement("regConfPassword").sendKeys("DAVIDEpa777");
        getPo().getWelement("regConfConditions").click();
        getPo().getWelement("regNewAccBtn").click();
        getDriver().manage().timeouts().implicitlyWait(constants.getWaitTime(), TimeUnit.SECONDS);
        //Sing in with created account
        getPo().getWelement("singInEmail").sendKeys("dimkaromka2014@mail.ru");
        getPo().getWelement("singInPassword").sendKeys("DAVIDEpa777");
        getPo().getWelement("signInBtn").click();
        Thread.sleep(constants.getWaitTime());

        assert (getPo().getWelement("budgetActivityPage").getText().equals("BudgetActivity")) : "This is not BudgetActivity page";

        System.out.println("The BudgetActivity page was opened");
    }
}
