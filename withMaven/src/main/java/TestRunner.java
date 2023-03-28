import managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TestRunner {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://demo.opencart.com/");

        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();

        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
        registerPage.fillInTheRegisterForm("Elevul", "Bun","elevul.bun@chisinau.md", "789652", "stromgpsw ");

        Thread.sleep(10000);

      /*  WebElement myAccountButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span"));
        myAccountButton.click();

        WebElement registerButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a"));
        registerButton.click();

        WebElement firstNameInput = webDriverManager.getDriver().findElement(By.id("input-firstname"));
        firstNameInput.sendKeys("First text Input");

        WebElement lastNameInput = webDriverManager.getDriver().findElement(By.id("input-lastname"));
        lastNameInput.sendKeys("Last text Input");

        WebElement emailInput = webDriverManager.getDriver().findElement(By.id("input-email"));
        emailInput.sendKeys("test@test.com");

        WebElement passwordInput = webDriverManager.getDriver().findElement(By.id("input-password"));
        passwordInput.sendKeys("A!@34768");

        WebElement newsletter = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"input-newsletter-no\"]"));
        newsletter.click();

        WebElement continueButton = webDriverManager.getDriver().findElement(By.cssSelector("#form-register > div > div > button"));
        continueButton.click();

        Thread.sleep(5000);

        webDriverManager.getDriver().close();

        WebDriverManager webDriverManager1 = new WebDriverManager("CHROME");

        webDriverManager1.getDriver().get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

        WebElement emailAddress = webDriverManager1.getDriver().findElement(By.id("input-email"));
        emailAddress.sendKeys("test@test.com");

        WebElement password = webDriverManager1.getDriver().findElement(By.id("input-password"));
        password.sendKeys("TestPassword");

        WebElement login = webDriverManager1.getDriver().findElement(By.cssSelector("#form-login > button"));
        login.click();

        Thread.sleep(2000);

        webDriverManager1.getDriver().close();*/

    }
}
