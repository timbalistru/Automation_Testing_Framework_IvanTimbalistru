import managers.WebDriverManager;

public class TestRunner {

    public static void main(String[] args) {

        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://www.instagram.com/");

        webDriverManager.getDriver().close();

        WebDriverManager webDriverManager1 = new WebDriverManager("FIREFOX");

        webDriverManager1.getDriver().get("https://ro-ro.facebook.com/");

        webDriverManager1.getDriver().close();

    }
}
