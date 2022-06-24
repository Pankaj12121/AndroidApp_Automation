package WD5.com.demo.webdriver.switchTo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchToFrame {

	@FindBy(tagName = "iframe")
	List<WebElement> iframeElements;

	@FindBy(name = "cardNumberMask")
	WebElement cardNumber;

	@FindBy(name = "returnUrl")
	WebElement returnURL;

	@FindBy(name = "cardSecurityCode")
	WebElement cardNumberCode;

	@FindBy(name = "customStylesheet")
	WebElement css;

	static WebDriver driver;
	public SwitchToFrame(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://merchant.juspay.in/merchant/iframe-demo");
		SwitchToFrame Objswitchclass = new SwitchToFrame(driver);
		
		// driver.manage().window().maximize();
		Objswitchclass.totalNumberOfFramesByJavaScript();
		Objswitchclass.totalNumberOfFramesByTagName();

		// Action in default frame first time
		Objswitchclass.defaulframeFirstTime();

		// SwitchTo Frame by index
		Objswitchclass.switchToFramebyIndex(0);

		// Action in switched frame
		Objswitchclass.actionInSwitchedFrame();

		// Again Switch back To default frame
		driver.switchTo().defaultContent();

		// Action in default frame second time
		Objswitchclass.defaulframesecondTime();

		// Close browser
		Objswitchclass.closeBrowser();
	}

	public int totalNumberOfFramesByJavaScript() {
		// By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes using javascript on the page are " + numberOfFrames);

		return numberOfFrames;
	}

	public int totalNumberOfFramesByTagName() {
		// By finding all the web elements using iframe tag
		System.out.println("The total number of iframes using tagname are " + iframeElements.size());
		Integer numberOfFrames = iframeElements.size();
		return numberOfFrames;
	}

	public void switchToFramebyIndex(int i) {
		driver.switchTo().frame(i);
		System.out.println("driver switched to frame by index " + i);
	}

	public void switchToFramebyName() {
		driver.switchTo().frame("guest");
		System.out.println("driver switched to frame by name ");
	}

	public void switchToFramebyWebElement() {
		driver.switchTo().frame(cardNumber);
	}

	public void defaulframeFirstTime() {
		String url = "http://www.icicibank.com";
		returnURL.sendKeys(url);
		System.out.println("driver in default frame first time and typed text-> " + url);

	}

	public void actionInSwitchedFrame() {
		String cNumber = "123";
		cardNumberCode.sendKeys(cNumber);
		System.out.println("driver successfully switched to frame and typed text-> " + cNumber);

	}

	public void defaulframesecondTime() {
		String cssText = "Test case 0001";
		css.sendKeys("Test case 0001");
		System.out.println("driver in default frame second time and typed text ->" + cssText);
	}

	public void closeBrowser() {
		driver.close();
	}
}
