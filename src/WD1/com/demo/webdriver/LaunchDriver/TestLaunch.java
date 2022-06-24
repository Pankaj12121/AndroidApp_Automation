package WD1.com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.WebDriver;

public class TestLaunch {
	public static void main(String[] args) {
		WebDriver driver = HRMSLoginPage.launchChrome();
		HRMSLoginPage hRMSLoginPage= new HRMSLoginPage(driver);
		hRMSLoginPage.navigateToURL(driver);
		hRMSLoginPage.LoginToHRMSwithInValidCredentials(driver);
		
	}
	
}
