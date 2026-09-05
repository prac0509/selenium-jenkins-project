package stqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class testng1 {

		@Test
	    public void testGoogle() {

	        WebDriverManager.chromedriver().setup();

	        ChromeDriver d = new ChromeDriver();

	        d.get("https://google.com");

	        System.out.println("Test Passed");

	        d.quit();
	    }
		
	
	

}
