package setup;

import org.openqa.selenium.WebElement;

public interface IPageObject {

    WebElement getWelement(String wename) throws NoSuchFieldException, IllegalAccessException, InstantiationException;
}

