package WD10.com.demo.webdriver.uploadDownload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import WD14.com.demo.datadriven.ExtractToList;

public class FileUpload {

	@FindBy(name = "firstName")
	private WebElement empFirstName;
	@FindBy(name = "middleName")
	private WebElement empMiddleName;
	@FindBy(name = "lastName")
	private WebElement empLastName;
	@FindBy(name = "employeeId")
	private WebElement empID;
	@FindBy(name = "photofile")
	private WebElement uploadFile;
	@FindBy(name = "chkLogin")
	private WebElement empLoginDetailsChkBox;
	@FindBy(name = "btnSave")
	private WebElement empSubmit;
	@FindBy(name = "user_name")
	private WebElement empUserName;
	@FindBy(name = "user_password")
	private WebElement empUserPass;
	@FindBy(name = "re_password")
	private WebElement empUserPassConfirm;
	@FindBy(name = "status")
	private WebElement empStatus;
	@FindBy(id = "txtUsername")
	private WebElement userName;
	@FindBy(name = "txtPassword")
	private WebElement password;
	@FindBy(className = "button")
	private WebElement submit;
	@FindBy(linkText = "PIM")
	private static WebElement pimMenu;
	@FindBy(linkText = "Add Employee")
	private static WebElement AddEmployee;
	static WebDriver driver;
	String Password;
	String randomString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	int empIDs;
	String filetobeUploaded = "C:\\Tosca\\SelDownload\\SampleVideo_1280x720_1mb.mp4";

	public FileUpload(WebDriver driver) {
		driver = this.driver;
		PageFactory.initElements(driver, this);

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseUrl = "https://opensource-demo.orangehrmlive.com";
		driver.get(baseUrl);

		FileUpload fileUploadObj = new FileUpload(driver);
		fileUploadObj.login();
		fileUploadObj.mouserhoverAndActionClick();

		fileUploadObj.fillempDetails();

	}

	public int randomIntGen() {
		Random rand = new Random();
		int value = rand.nextInt(5000);
		return value;
	}

	public String randomStringGen() {
		String sb = Long.toHexString(Double.doubleToLongBits(Math.random()));
		return sb;
	}

	public void fillempDetails() throws IOException, InterruptedException {
		empFirstName.sendKeys(randomStringGen());
		empMiddleName.sendKeys(randomStringGen());
		empLastName.sendKeys(randomStringGen());
		empIDs = randomIntGen();
		String IDs = String.valueOf(empIDs);
		empID.sendKeys(IDs);
		//AutoIT way
		
		uploadFile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E:\\Zoom_AutoITScript\\zoomLaunch.exe");
		Thread.sleep(9000);
		//Through sendKeys
		//uploadFile.sendKeys(filetobeUploaded);
		empLoginDetailsChkBox.click();
		empUserName.sendKeys(randomStringGen());
		Password = randomStringGen();
		empUserPass.sendKeys(Password);
		empUserPassConfirm.sendKeys(Password);
		dropDownItemSelect(empStatus, "Enabled");
		empSubmit.click();

	}

	public void dropDownItemSelect(WebElement element, String value) {

		Select dropDown = new Select(element);
		dropDown.selectByVisibleText(value);

	}

	public void mouserhoverAndActionClick() throws InterruptedException {
		
		Actions builder = new Actions(driver);
		builder.moveToElement( pimMenu ).perform();
		builder.moveToElement(AddEmployee).perform();
		builder.click(AddEmployee).perform();
		System.out.println("Mouseover and click successful on menu " + AddEmployee.toString());

	}

	public void login() {

		ExtractToList dataList = new ExtractToList();
		ArrayList<ArrayList<Object>> testData = new ArrayList<ArrayList<Object>>();
		testData = dataList.extractAsLists();
		for (int k = 0; k <= testData.size() - 1; k++) {
			userName.sendKeys(testData.get(k).get(1).toString());
			password.sendKeys(testData.get(k).get(2).toString());
			submit.click();
		}
	}
}
