package automation_testing_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/codering/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();		
		String baseUrl = "http://www.google.com";
        driver.get(baseUrl);	
        driver.findElement(By.name("q")).sendKeys("Location of India");
        driver.findElement(By.className("gNO89b")).click();
        driver.close();
        
	}
}








