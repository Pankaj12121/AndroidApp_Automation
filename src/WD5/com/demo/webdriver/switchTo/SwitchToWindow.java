package WD5.com.demo.webdriver.switchTo;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchToWindow {

	static WebDriver driver;

	@FindBy(linkText = "LOGIN")
	static WebElement loginlink;

	@FindBy(linkText = "Call-N-Trade")
	static WebElement callNtrade;

	@FindBy(linkText = "click here")
	static WebElement clickHere;

	@FindBy(id = "searchStock")
	static WebElement searchStock;

	@FindBy(id = "txtuid")
	static WebElement userName;

	static String baseWindowTitle = "ICICI Direct";
	static String titlecustService = "ICICI Direct - Customer Service";
	static String titlecustService2 = "Customer Service";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, new SwitchToWindow());
		String baseUrl = "http://icicidirect.com";
		driver.get(baseUrl);
		String BaseTitle = driver.getTitle();

		try {
			SwitchToWindow Obj = new SwitchToWindow();
			loginlink.click();
			bringElementintoView(callNtrade);
			callNtrade.click();
			Obj.switchToWindow(titlecustService);
			clickHere.click();
			driver.close();
			Obj.switchToWindow(titlecustService2);
			searchStock.sendKeys("bajaj");
			System.out.println("Switched to new window successful");
			Obj.switchToWindow(baseWindowTitle);
			userName.sendKeys("Test123");
			System.out.println("switch back to default window successful");
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Element not displayed");

		}
	}

	public void switchToWindow(String title) {
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			driver.switchTo().window(handle);
			// driver.manage().window().maximize();

			if (driver.getTitle().contains(title)) {
				break;
			}
		}

	}

	public static void bringElementintoView(WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
}