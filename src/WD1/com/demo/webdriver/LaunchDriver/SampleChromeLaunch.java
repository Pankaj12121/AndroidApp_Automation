package WD1.com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class SampleChromeLaunch {
	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"\\Grid\\test.log");
		driver = new ChromeDriver();
		String baseUrl = "https://phptravels.org/index.php?rp=/login";
		String expectedTitle = "Login - PHPTRAVELS";
		String actualTitle = "";
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
	
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

}