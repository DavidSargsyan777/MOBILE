package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchField {

    WebDriver webDriver;
    @FindBy(xpath = "//div/input[@class]")
    WebElement googleField;
    @FindBy(xpath = "//a[@href='https://www.epam-group.ru/']")
    WebElement epamRef;

    public GoogleSearchField(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void googleSearch(String currentSearch) {
        googleField.sendKeys(currentSearch);
        googleField.sendKeys(Keys.ENTER);
    }

    public Boolean correctRefIsDisplayed () {
        return epamRef.isDisplayed();
    }
}
