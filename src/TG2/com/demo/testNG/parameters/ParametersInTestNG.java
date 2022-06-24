package TG2.com.demo.testNG.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(name = "txtPassword")
	WebElement password;

	@FindBy(className = "button")
	WebElement submit;

	@FindBy(xpath = "//div[span='Invalid credentials']")
	WebElement errMsg;

	String ActualErrMsg = "";

	WebDriver driver;

	@Test(groups ={ "TestNG", "demo", "TC001", "parameters" })
	@Parameters({ "browsername", "appURL" })
	public void parameters(String browserNmae, String appURL) {
		
		TestBaseSetup base = new TestBaseSetup();
		driver = base.setDriver(browserNmae, appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		String ExpectedErrorMsg = "Invalid credentials";

		userName.sendKeys("Admin");
		password.sendKeys("admin");
		submit.click();
		try {

			ActualErrMsg = errMsg.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ActualErrMsg.contentEquals(ExpectedErrorMsg))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");

		driver.close();

	}
}