package WD1.com.demo.webdriver.LaunchDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SampleLocatorsPHPTravels {
	@FindBy(id = "inputEmail")
	WebElement emailAddress;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "rememberme")
	WebElement chkBox;
	@FindBy(id = "login")
	WebElement loginBtn;
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebElement resetBtn;
	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;

	@FindBy(id = "inputFirstName")
	WebElement firstName;
	@FindBy(id = "inputLastName")
	WebElement lastName;
	@FindBy(id = "inputEmail")
	WebElement Email;
	@FindBy(id = "inputPhone")
	WebElement Phone;
	@FindBy(id = "inputCompanyName")
	WebElement companyName;
	@FindBy(id = "inputAddress1")
	WebElement Address1;
	@FindBy(id = "inputAddress2")
	WebElement Address2;
	@FindBy(id = "inputCity")
	WebElement city;
	@FindBy(id = "stateinput")
	WebElement state;
	@FindBy(id = "inputPostcode")
	WebElement postcode;
	@FindBy(id = "inputCountry")
	WebElement country;
	@FindBy(id = "customfield1")
	WebElement findUs;
	@FindBy(id = "customfield2")
	WebElement MobileNumber;
	@FindBy(id = "inputNewPassword1")
	WebElement password1;
	@FindBy(id = "inputNewPassword2")
	WebElement confirmPassword;
	@FindBy(xpath = "//div[@class='form-group']/button")
	WebElement GeneratePasswords;
	@FindBy(xpath = "//*[@id='modalGeneratePassword']/div")
	WebElement modelWindow;
	@FindBy(xpath = "//*[@id='modalGeneratePassword']/div/div/div[3]/button[1]")
	WebElement popupClose;
	
	WebDriver driver;
	String url = "https://phptravels.org/index.php?rp=/login";

	public SampleLocatorsPHPTravels() {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void main(String[] args) throws InterruptedException {
		SampleLocatorsPHPTravels sampleLocatorsPHPTravels = new SampleLocatorsPHPTravels();

		sampleLocatorsPHPTravels.fillLogin();
		sampleLocatorsPHPTravels.newUserRegister();
	}

	public void fillLogin() {
		emailAddress.sendKeys("pankaj.yogi@gmail.com");
		password.sendKeys("pankaj111");
		chkBox.click();
		loginBtn.click();
		resetBtn.click();
		register.click();
	}

	public void newUserRegister() {
		firstName.sendKeys("AMAN");
		firstName.sendKeys("JAIN");
		Email.sendKeys("AMAN.JAIN@GMAIL.COM");
		Phone.sendKeys("9823357756");
		companyName.sendKeys("TCS");
		Address1.sendKeys("RadhaKishan Plots");
		Address2.sendKeys("RTO Road");
		city.sendKeys("Nagpur");
		state.sendKeys("Maharastra");
		postcode.sendKeys("421204");
		country.sendKeys("INDIA");
		selectItemFromDropDown(country, "India", "Country");
		selectItemFromDropDown(findUs, "Bing", "FindUS");

		MobileNumber.sendKeys("883344556677");
		password1.sendKeys("AMAN@123");
		confirmPassword.sendKeys("AMAN@123");
		GeneratePasswords.click();
		//driver.switchTo().frame(modelWindow);
		popupClose.click();
	}

	public void selectItemFromDropDown(WebElement element, String value, String FieldName) {
		try {
			// bringElementintoView(element);
			Select select = new Select(element);
			select.selectByVisibleText(value);

			System.out.println("successfully selected  " + value + " from drop down " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to select  " + value + " from drop down " + FieldName);
			e.printStackTrace();
		}

	}

}
