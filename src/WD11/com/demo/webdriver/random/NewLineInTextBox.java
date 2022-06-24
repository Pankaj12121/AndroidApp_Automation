package WD11.com.demo.webdriver.random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLineInTextBox {
	@FindBy(linkText = "Admin")
	WebElement adminMenu;
	@FindBy(linkText = "Organization")
	WebElement organization;
	@FindBy(linkText = "General Information")
	WebElement generalInfo;
	@FindBy(id = "btnSaveGenInfo")
	WebElement editButton;
	@FindBy(id = "organization_note")
	WebElement note;
	@FindBy(id = "btnSaveGenInfo")
	WebElement save;
	@FindBy(id = "txtUsername")
	WebElement userName;
	@FindBy(name = "txtPassword")
	WebElement password;
	@FindBy(className = "button")
	WebElement submit;
	static WebDriver driver;

	public NewLineInTextBox() {
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		NewLineInTextBox obj = new NewLineInTextBox();
		obj.fillLoginDetails();
		obj.menuNaviagte();
		obj.updateGenInfo();

	}

	public void fillLoginDetails() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		password.sendKeys(Keys.TAB);
		submit.submit();

	}

	public void updateGenInfo() {
		editButton.click();
		note.clear();
		note.sendKeys(("Open Sourec Software \n useful for demo \n demo scripts build using HRM \n thanks HRM Team"));
		save.click();
		driver.close();
	}

	public void menuNaviagte() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(adminMenu).perform();
		action.moveToElement(organization).perform();
		action.click(generalInfo).perform();
	}

}
