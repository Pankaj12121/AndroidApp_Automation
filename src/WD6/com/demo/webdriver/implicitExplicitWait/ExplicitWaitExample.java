package WD6.com.demo.webdriver.implicitExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExplicitWaitExample extends WebPage {
	By name = By.id("name");
	By organisation = By.id("organisation");
	By mobile = By.id("mobile");
	By emailid = By.id("emailid");
	By location = By.id("location");
	By query = By.id("query");
	By ce = By.linkText("CORPORATE ENQUIRY");

	WebDriver driver;
	String expicitWaitType = "type2";

	@Test
	public void fillDominoEnquiry() {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dominos.co.in/");

		if (expicitWaitType.equals("type1")) {
			WebElement ceTxtBox = explicitWait(driver, 2, ce);
			ceTxtBox.click();

			WebElement nameTxtBox = explicitWait(driver, 2, name);
			nameTxtBox.sendKeys("psy");

			WebElement organisationTxtBox = explicitWait(driver, 2, organisation);
			organisationTxtBox.sendKeys("Angel");

			WebElement mobileTxtBox = explicitWait(driver, 2, mobile);
			mobileTxtBox.sendKeys("1231231231");

			WebElement emailidTxtBox = explicitWait(driver, 2, emailid);
			emailidTxtBox.sendKeys("psy@gmail.com");

			WebElement locationTxtBox = explicitWait(driver, 2, location);
			locationTxtBox.sendKeys("India");

			WebElement queryTxtBox = explicitWait(driver, 2, query);
			queryTxtBox.sendKeys("pizza in 10 mins");
		} else {
			WebElement ceTxtBox = explicitWait2(driver, 2, ce);
			ceTxtBox.click();

			WebElement nameTxtBox = explicitWait2(driver, 2, name);
			nameTxtBox.sendKeys("psy");

			WebElement organisationTxtBox = explicitWait2(driver, 2, organisation);
			organisationTxtBox.sendKeys("Angel");

			WebElement mobileTxtBox = explicitWait2(driver, 2, mobile);
			mobileTxtBox.sendKeys("1231231231");

			WebElement emailidTxtBox = explicitWait2(driver, 2, emailid);
			emailidTxtBox.sendKeys("psy@gmail.com");

			WebElement locationTxtBox = explicitWait2(driver, 2, location);
			locationTxtBox.sendKeys("India");

			WebElement queryTxtBox = explicitWait2(driver, 2, query);
			queryTxtBox.sendKeys("pizza in 10 mins");

		}

	}
}
