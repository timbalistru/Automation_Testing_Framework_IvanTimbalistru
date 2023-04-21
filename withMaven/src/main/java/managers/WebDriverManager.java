package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverManager {

    public WebDriverManager(String webDriverType) {
        this.webDriverType = webDriverType;
    }

    private static WebDriver driver;

    private static String webDriverType;

    private static int counter = 0;

    private static WebDriver createDriver() {
        switch (webDriverType) {
            case "CHROME":
                counter++;
                System.out.println("Numarul rularii " + counter);
                System.setProperty("webdriver.chrome.driver", "src/main/drivers/chromedriver.exe");
                driver = new ChromeDriver();

                break;
            case "FIREFOX":
                System.setProperty("webDriver.firefox.driver", "src/main/drivers/geckodriver.exe");
                driver = new FirefoxDriver();

                break;
            default:
                System.out.println("This driver is not created");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));

        return driver;

    }


    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
            System.out.println("Driver is closed");
        }
    }
}