package WD2.com.demo.webdriver.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

public class TAB_testcase {
	@FindBy(id = "txtUserID")
	WebElement uName;
	@FindBy(id = "txtTradingPassword")
	WebElement password;
	@FindBy(id = "loginBtn")
	WebElement loginButon;

	@FindBy(xpath = "//div[@class='owl-item active']/div/button")
	WebElement popup;
	public WebDriver driver;
	@Test
	public void testcaseTab() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseUrl = "https://trade.angelbroking.com/";
		driver.get(baseUrl);
		// PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fillTABdetails();
	}

	public void fillTABdetails() throws InterruptedException {
		uName.sendKeys("P109861");
		password.sendKeys("pass000");
		loginButon.click();
		Thread.sleep(3000);
		popup.click();
	}

}
