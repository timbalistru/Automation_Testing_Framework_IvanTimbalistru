package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
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
