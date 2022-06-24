package OP3.com.demo.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase_002 {

	@FindBy(xpath = "//input[@id='login']")
	WebElement uNAme;
	@FindBy(xpath = "//input[@id='senha']")
	WebElement pass;
	@FindBy(xpath = "//button[text()='entrar']")
	WebElement submit;
	@FindBy(xpath = "//ul[@class='footer__modulos--portal']/li[1]/a")
	WebElement TMS;
	@FindBy(xpath = "//iframe")
	List<WebElement> iframes;

	@FindBy(xpath = "//*[@id='txtlogin']")
	WebElement CPF;
	@FindBy(xpath = "//*[@id='txtnome']")
	WebElement nome;

	WebDriver driver;

	@Test
	public void navigateApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://186.237.202.19/CSN_HML/");
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		addLoginDetails();
		Thread.sleep(4000);
		clickOnTMS();
		Thread.sleep(4000);
		fillAdditionalDetails();

	}

	public void addLoginDetails() {

		uNAme.sendKeys("CSO2020");
		pass.sendKeys("cervello01");
		submit.click();

	}

	public void clickOnTMS() {
		bringElementintoView(TMS);
		TMS.click();
	}

	public void fillAdditionalDetails() {
		PageFactory.initElements(driver, this);
		CPF.sendKeys("TestData");
		nome.sendKeys("TestData1");

	}

	public void bringElementintoView(WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
