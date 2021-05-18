package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		if(browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","/home/codering/Downloads/geckodriver");
			return  new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver","/home/codering/Downloads/chromedriver_linux64/chromedriver");
			return  new ChromeDriver();	
		}
	}

}
