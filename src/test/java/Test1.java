import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
/**
 * Created by ~_RipTor_~ on 01.04.2017.
 */
public class Test1 {
    @Test
        public void navigateToWebSite() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\~_RipTor_~\\IdeaProjects\\geckodriver-v0.15.0-win32\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
    }
}
