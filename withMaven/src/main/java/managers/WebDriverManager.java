package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    public WebDriverManager(String webDriverType) {
        this.webDriverType = webDriverType;
    }

    private WebDriver driver;

    private String webDriverType;

    private WebDriver createDriver() {
        switch (webDriverType) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;

            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            default:
                System.out.println("Optiunea folosita nu este valabila! Mai incearca!");
        }
        return driver;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }

        return driver;

    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
            System.out.println("Driver-ul a fost inchis ! ");
        }
    }

}
