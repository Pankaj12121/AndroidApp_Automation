package WD1.com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleEdgelaunch {
	public static WebDriver driver;

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.ie.driver", "\\Grid\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		String baseUrl = "https://phptravels.org/index.php?rp=/login";
		String expectedTitle = "Login - PHPTRAVELS";
		String actualTitle = "";
		driver.get(baseUrl);
		driver.switchTo().defaultContent();
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

}
