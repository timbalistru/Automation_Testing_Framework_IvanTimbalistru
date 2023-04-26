package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends Page {

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean allTheElementsAreDisplayed() {
        return false;
    }

    @Override
    public void fillInTheRegisterForm(String elevul, String bun, String s, String s1, String stromgpsw_) {

    }
}