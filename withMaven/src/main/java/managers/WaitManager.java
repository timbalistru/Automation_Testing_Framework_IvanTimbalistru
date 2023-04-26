package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitManager {
    private static final WebDriver driver = WebDriverManager.getDriver();
    private static final WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static void waitTillTheElemenentIsClickable(WebElement element) {
        driverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitTillTheElementIsVisibleWebElement(WebElement element) {
        driverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
