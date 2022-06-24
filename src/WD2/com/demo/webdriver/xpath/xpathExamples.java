

package WD2.com.demo.webdriver.xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

public class xpathExamples {

	@FindBy(xpath = "//span[contains(text(),'Metro')]")
	WebElement Metro;

	@FindBy(xpath = "//div[@class='_3QlS']/div/input")
	WebElement MetroFrom;

	@FindBy(xpath = "//div/div[@class='_3_cL ']/div/following::div/div/input")
	WebElement ticketType;

	@FindBy(xpath = "//label[text()='Card Number']/preceding-sibling::input")
	WebElement cardnumber;

	@FindBy(xpath = "//label[text()='Card Number']/following::div/input")
	WebElement amount;

	@FindBy(xpath = "//label[text()='Card Number']/following::div/input/following::div/div/i")
	WebElement fastFwd;

	@FindBy(xpath = "//button[text()='Recharge Now']")
	WebElement submit;

	@FindBy(xpath = "//div//li/div[text()='Please enter a valid Card Number.']")
	WebElement cardValidationErrorMesage;

	@FindBy(xpath = "//li/div[contains(text(),'Please enter an amount')]")
	WebElement amountValidationErrorMesage;

	@FindBy(xpath = "//li[text()='Paytm Wallet']")
	WebElement payTMwallet;

	@FindBy(xpath = "//a[text()='Add Money to Wallet']")
	WebElement AddMoneyToWallet;

	@FindBy(xpath = "//div//li//input[text()='Enter Amount to be Added in Wallet ' or @id='input_1']")
	WebElement rechargeAmount;

	@FindBy(xpath = "//span[text()='Add Money to Wallet']")
	WebElement addMomney;

	@FindBy(xpath = "//button/i[@class='fa fa-times']")
	WebElement closePopup;
	
	@FindBy(xpath = "//a/div[(starts-with(text(),'24'))]")
	WebElement Help;
	
	@FindBy(xpath = "//a/div[(starts-with(text(),'24'))]/ancestor::div[1]")
	List<WebElement> menuList;
	
	@FindBy(xpath = "//div[@class='container']/ul[1]/child::li/a")
	List<WebElement> Footer;
	
	WebDriver driver;

	@Test
	public void launchDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseUrl = "https://paytm.com/";
		driver.get(baseUrl);
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,10), this);
		Metro.click();
		metroRecharge();
		printErrorMsgMetroRecharge();
		AddMoneyToWallet();
		AddActualMoneyToWallet();
		helpCustomer();
		driver.close();
	}

	public void metroRecharge() {
		PageFactory.initElements(driver, this);
		MetroFrom.click();
		MetroFrom.sendKeys("Delhi Metro");
		ticketType.sendKeys("Smart Card Recharge");
		cardnumber.sendKeys("123456789012");
		amount.sendKeys("12345");
		fastFwd.click();
		submit.click();
	
	}

	public void printErrorMsgMetroRecharge() {

		System.out.println("Card Validation error message : " + cardValidationErrorMesage.getText());

		System.out.println("Amount Validation error message : " + amountValidationErrorMesage.getText());

	}

	public void AddMoneyToWallet() {
		Actions action = new Actions(driver);
		action.moveToElement(payTMwallet).build().perform();
		AddMoneyToWallet.click();

	}

	public void AddActualMoneyToWallet() {
		rechargeAmount.sendKeys("1000");
		addMomney.click();
		closePopup.click();
	}
	
	public void helpCustomer() throws InterruptedException {
		Thread.sleep(2000);
		Help.click();
		
		for(WebElement ele:menuList) {
			System.out.println(ele.getText());
		}
		
		for(WebElement ele:Footer) {
			System.out.println(ele.getText());
		}
	}
}