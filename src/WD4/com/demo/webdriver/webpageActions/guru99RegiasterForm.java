package WD4.com.demo.webdriver.webpageActions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class guru99RegiasterForm {
	/// following::starts-with(@id,'Video-iFrame-')
	@FindBy(xpath = "//div[starts-with(@id,'Video-Div-SekindoSPlayer')]")
	WebElement iframe;

	@FindBy(xpath = "/html/body/div[3]/div/div[7]/div[2]")
	WebElement popUp;

	@FindBy(xpath = "//select[@id='user_title']")
	WebElement title;

	@FindBy(xpath = "//input[@id='user_firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='user_surname']")
	WebElement surName;

	@FindBy(xpath = "//input[@id='user_phone']")
	WebElement phone;

	@FindBy(xpath = "//select[@id='user_dateofbirth_1i']")
	WebElement yearCal;

	@FindBy(xpath = "//select[@id='user_dateofbirth_2i']")
	WebElement monthCal;

	@FindBy(xpath = "//select[@id='user_dateofbirth_3i']")
	WebElement dayCal;

	@FindBy(xpath = "//input[@id='licencetype_t']")
	WebElement fullRB;

	@FindBy(xpath = "//input[@id='licencetype_f']")
	WebElement provisionalRB;

	@FindBy(xpath = "//select[@id='user_licenceperiod']")
	WebElement liscensePeriod;

	@FindBy(xpath = "//select[@id='user_occupation_id']")
	WebElement occupation;

	@FindBy(xpath = "//input[@id='user_address_attributes_street']")
	WebElement street;

	@FindBy(xpath = "//input[@id='user_address_attributes_city']")
	WebElement city;

	@FindBy(xpath = "//input[@id='user_address_attributes_county']")
	WebElement country;

	@FindBy(xpath = "//input[@id='user_address_attributes_postcode']")
	WebElement postCode;

	@FindBy(xpath = "//input[@id='user_user_detail_attributes_email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='user_user_detail_attributes_password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='user_user_detail_attributes_password_confirmation']")
	WebElement confpassword;

	@FindBy(xpath = "//input[@id='resetform']")
	WebElement reset;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;

	WebDriver driver;

	public static void main(String[] args) {
		guru99RegiasterForm form = new guru99RegiasterForm();
		form.launchDriver();
		form.navigateURL();
		form.fillRegistrationForm();
		form.closeBrowser();

	}

	public void fillRegistrationForm() {
		// getAllIframes();
		// adWindowHandling();
		// closePopUP(popUp, "Flash popup");
		click(reset, "Reset Button");
		selectItemFromDropDown(title, "Lord", "Title Drop Down");
		sendKeys(firstName, "Ramesh", "First Name Text Box");
		sendKeys(surName, "Raje", "SurName Name Text Box");
		sendKeys(phone, "8888888888", "Phone Number Text Box");
		selectItemFromDropDown(yearCal, "1990", "Year Drop down");
		selectItemFromDropDown(monthCal, "December", "Month Drop down");
		selectItemFromDropDown(dayCal, "25", "Day Drop down");
		click(provisionalRB, "Provisional Radio button");
		selectItemFromDropDown(liscensePeriod, "18", "Liscense Period Drop down");
		selectItemFromDropDown(occupation, "Teacher", "occupation Drop down");
		sendKeys(street, "M G Road", "Street Text Box");
		sendKeys(city, "Mumbai", "City Text Box");
		sendKeys(country, "India", "Country Text Box");
		sendKeys(postCode, "400078", "PostalCode Text Box");
		sendKeys(email, "rraje@xyz.com", "Email Text Box");
		sendKeys(password, "pass@123", "Password Text Box");
		sendKeys(confpassword, "pass@123", "Confirm password Text Box");
		click(submit, "Create Button");
	}

	public WebDriver launchDriver() {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		DesiredCapabilities desiredcapabilities = new DesiredCapabilities();
		desiredcapabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(desiredcapabilities);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public void navigateURL() {
		driver.get("http://demo.guru99.com/insurance/v3/register.php");
		System.out.println("Navigated to site: " + driver.getTitle());

	}

	public void closePopUP(WebElement element, String FieldName) {
		try {

			driver.switchTo().frame(1);
			popUp.click();
			System.out.println("successfully closed popup " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to close popup " + FieldName);
			e.printStackTrace();
		}

	}

	public void sendKeys(WebElement element, String value, String FieldName) {

		try {
			bringElementintoView(element);
			element.sendKeys(value);

			System.out.println("successfully typed value  " + value + " in field " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to type value  " + value + " in field " + FieldName);
			e.printStackTrace();
		}
	}

	public void click(WebElement element, String FieldName) {
		try {
			bringElementintoView(element);
			element.click();
			System.out.println("successfully clicked on " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to click on " + FieldName);
			e.printStackTrace();
		}

	}

	public void selectItemFromDropDown(WebElement element, String value, String FieldName) {
		try {
			bringElementintoView(element);
			Select select = new Select(element);
			select.selectByVisibleText(value);

			System.out.println("successfully selected  " + value + " from drop down " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to select  " + value + " from drop down " + FieldName);
			e.printStackTrace();
		}

	}

	public String getSelectedValueFromList(WebElement element, String value) {

		Select selectType = new Select(element);
		String selectedValue = selectType.getFirstSelectedOption().getText();
		return selectedValue;

	}

	public void bringElementintoView(WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void closeBrowser() {
		driver.quit();
	}

	public void adWindowHandling() {
		String mainWinHandle = driver.getWindowHandle();
		String subWinHandle = null;

		Set<String> allHandle = driver.getWindowHandles();
		Iterator<String> iterator = allHandle.iterator();
		while (iterator.hasNext()) {
			String subWinHandler = iterator.next();
			driver.switchTo().window(subWinHandler);
			if (subWinHandler.equals(subWinHandle)) {
				driver.close();
				break;
			}
		}

		driver.switchTo().window(mainWinHandle);
	}

	public void getAllIframes() {
		driver.navigate().refresh();
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		for (WebElement iframe : iframes) {

			System.out.println(iframe);

		}
	}

}
