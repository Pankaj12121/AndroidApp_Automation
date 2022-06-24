package WD1.com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleIElaunch {
	public static WebDriver driver;
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.edge.driver","\\Grid\\msedgedriver.exe");
		driver = new EdgeDriver();
		String baseUrl = "http://newtours.demoaut.com/index.php";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get(baseUrl);
		driver.switchTo().defaultContent();
		actualTitle = driver.getTitle();
		WebElement userName= driver.findElement(By.name("userName"));
		WebElement password= driver.findElement(By.name("password"));
		WebElement submit= driver.findElement(By.name("login"));
		userName.sendKeys("tutorial");
		password.sendKeys("tutorial");
		submit.click();
		
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();


	}

}
