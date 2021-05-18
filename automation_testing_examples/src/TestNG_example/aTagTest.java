package TestNG_example;

import java.util.*;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class aTagTest {
	WebDriver driver;
	String webUrl= "https://www.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C256741357814%7Ce%7Cfb%7C&placement=&creative=256741357814&keyword=fb&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006247131%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297263798525%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwqIiFBhAHEiwANg9szhUSM5AH2tGQzciBTGGdIfME5i5dOf5hTD_8hbw3aRw-skoYvxhqXxoCAAAQAvD_BwE";
	
	@Test
	public void loginPresent() {
		System.out.println("Running Test");

		List <WebElement> elements =  driver.findElements(By.tagName("a"));
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
	}
	
	@BeforeMethod
	public void setUp() {
		driver = utilities.DriverFactory.open("firefox");
		driver.get(webUrl);

		System.out.println("Starting Test");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		 System.out.println("ending  Test");
	}
	

}
