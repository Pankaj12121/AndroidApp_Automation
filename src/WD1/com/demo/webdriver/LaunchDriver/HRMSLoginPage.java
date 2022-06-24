package WD1.com.demo.webdriver.LaunchDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMSLoginPage {

	@FindBy(id = "txtUsername")
	WebElement userName;
	@FindBy(id = "txtPassword")
	WebElement password;
	@FindBy(id = "btnLogin")
	WebElement login;
	@FindBy(id = "spanMessage")
	WebElement errMsg;
	
	
	String userNameData = "opensourcecms";
	String passwordData = "opensourcecms";
	String expectedErrorMsgText = "Invalid Login credentials";
	String ActualerrorMsgText;
	
	public HRMSLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebDriver launchChrome() {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launched browser successfully");
		return driver;
	}

	public void navigateToURL(WebDriver driver) {
		String baseUrl = "https://opensource-demo.orangehrmlive.com/";
		driver.get(baseUrl);
		System.out.println("Navigated to " + baseUrl);
	}

	public void LoginToHRMSwithValidCredentials(WebDriver driver) {
		userName.sendKeys(userNameData);
		System.out.println("Typed successfully userName " + userNameData);
		password.sendKeys(passwordData);
		System.out.println("Typed successfully password " + passwordData);
		login.click();
		ActualerrorMsgText = errMsg.getText();
		System.out.println("Clicked successfully on login button ");

	}

	public void LoginToHRMSwithInValidCredentials(WebDriver driver) {
		String userNameData = "opensourcecms";
		String passwordData = "opensourcecms";
		userName.sendKeys(userNameData);
		System.out.println("Typed successfully userName " + userNameData);
		password.sendKeys(passwordData);
		System.out.println("Typed successfully password " + passwordData);
		login.click();
		ActualerrorMsgText = errMsg.getText();

		System.out.println("Clicked successfully on login button ");

	}

	public void closeBrowser(WebDriver driver) {
		sleep(1000);
		driver.close();
		System.out.println("Browser closed successfully");
	}

	public void sleep(int timer) {
		try {
			Thread.sleep(timer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkPoint() {
		if (expectedErrorMsgText.equals(ActualerrorMsgText)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed because " + "Actaual: " + ActualerrorMsgText + " And expected: "
					+ expectedErrorMsgText + " MisMatched");
		}
	}

}
