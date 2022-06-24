package WD1.com.demo.webdriver.LaunchDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLocatorsScripts {
	static WebElement userName;
	static WebElement password;
	static WebElement submit;
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();// maximize browser
		
		String ExpectedErrorMsg = "Invalid credentials";
		try {
			userName = driver.findElement(By.id("txtUsername1"));// By id
			password = driver.findElement(By.name("txtPassword"));// By name
			submit = driver.findElement(By.className("button"));// By name
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		userName.sendKeys("admin");
		password.sendKeys("admin");
		submit.click();

		WebElement errMsg = driver.findElement(By.xpath("//div[span='Invalid credentials']"));// By xpath
		String ActualErrMsg = errMsg.getText();

		if (ActualErrMsg.contentEquals(ExpectedErrorMsg))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");

		driver.close();

	}

}
