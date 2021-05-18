package automation_testing_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class registration {

	public static void main(String[] args) {
		
		String browserType = "firefox";
		String firstname = "roshan";
		String lastname = "roshan";
		String email = "roshanbhagat23april@gmail.com";
		String password = "codering";
		String gender = "Female";

		WebDriver driver = utilities.DriverFactory.open(browserType);
		String baseUrl = "https://www.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C256741357811%7Ce%7Cfb%7C&placement=&creative=256741357811&keyword=fb&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006247131%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297263798525%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwqIiFBhAHEiwANg9szmGQvgOVveQ_lu6Vb3fvXbOlzx4WcuniEwDR4gSzdtt-uU9YV-xtahoCSgkQAvD_BwE";
        driver.get(baseUrl);
        WebElement first_name = driver.findElement(By.name("firstname"));
        WebElement last_name = driver.findElement(By.name("lastname"));
        WebElement Email = driver.findElement(By.name("reg_email__"));
        WebElement Email_confirm = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement Password = driver.findElement(By.name("reg_passwd__"));
        WebElement submit = driver.findElement(By.name("websubmit"));
        first_name.sendKeys(firstname);
        last_name.sendKeys(lastname);
        Email.sendKeys(email);
        Email_confirm.sendKeys(email);
        Password.sendKeys(password);
        new Select(driver.findElement(By.name("birthday_day"))).selectByIndex(6);
        new Select(driver.findElement(By.name("birthday_month"))).selectByIndex(9);
        new Select(driver.findElement(By.name("birthday_year"))).selectByIndex(20);
        
        if(gender.equalsIgnoreCase("Female")) {
            driver.findElement(By.name("sex")).click();
        }
        else {
            driver.findElement(By.xpath("//*[@id=\"u_0_4_Gm\"]")).click();
        }
        submit.click();
  
	}
}








