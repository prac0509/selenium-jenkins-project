package stqa;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {

	public static void main(String[] args) throws Exception {

       FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(
            new URL("http://localhost:4444"),
            options
        );
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}
