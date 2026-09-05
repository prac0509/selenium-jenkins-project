package stqa;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac1 {
public static void main(String [] args)
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver d=new ChromeDriver();
	d.get("https://google.com");
	System.out.print("Test Passesd");
	d.quit();
	
}
}
