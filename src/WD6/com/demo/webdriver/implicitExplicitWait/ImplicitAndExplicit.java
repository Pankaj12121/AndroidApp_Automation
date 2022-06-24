package WD6.com.demo.webdriver.implicitExplicitWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicit {
	/*-------Login elements---------------------------*/
	@FindBy(id = "txtUsername")
	WebElement userName;
	@FindBy(name = "txtPassword")
	WebElement password;
	@FindBy(className = "button")
	WebElement submit;
	@FindBy(xpath = "//div[span='Invalid credentials']")
	WebElement errMsg;
	
	static WebDriver driver ;
	
	String ExpectedErrorMsg="Invalid credentials";
	static String Username="Admin";
	static String Password="admin1234";
	static String browserCloseTrue;

	public static void main(String[] args) {
		StopWatch watch= new StopWatch();
		watch.start();
		ImplicitAndExplicit baseObject= new ImplicitAndExplicit();
		baseObject.launchDriver();
		baseObject.loginToHRM(Username, Password);
		if(!baseObject.verifyLandingPage())
			baseObject.verifyLogin();
		watch.stop();
		System.out.println(watch);
		baseObject.closeSession();
	}
	public void launchDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver(capabilities);
		/*******************************Implicit Wait*************************************************/		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*******************************Implicit Wait*************************************************/	
		PageFactory.initElements(driver, this);
		String baseUrl = "https://opensource-demo.orangehrmlive.com/";
		driver.get(baseUrl);
	}

	

	public void loginToHRM(String uName,String pass){
		String startUrL= driver.getCurrentUrl().toString();
		String startTitle= driver.getTitle();
		System.out.println("The base page URL : "+startUrL);
		userName.sendKeys(uName);
		password.sendKeys(pass);
		submit.click();
		String landingUrL= driver.getCurrentUrl().toString();
		String landingTitle= driver.getTitle().toString();
		System.out.println("The landing page URL : "+landingUrL);
		System.out.println("The base page Title : "+startTitle);
		System.out.println("The Landing page Title : "+landingTitle);

	}
	public boolean verifyLandingPage() {
		try{
			By by=By.linkText("Welcome Admin");//("//a[text()='Welcome Admin']")
			/*******************************Explicit Wait*************************************************/		
			if (explicitWait(10, by) != null)
				/*******************************Explicit Wait*************************************************/	
				if(driver.findElement(by) != null){
					System.out.println("Login Successful...on landing page");
					return true;
				}else{
					System.out.println("Login Unsuccessful...");

				}
	
		}catch(Exception e){
			System.out.println("The element'WelCome Admin' could not find on web page");

		}
		return false;
	}
	public void verifyLogin(){
		String ActualErrMsg=errMsg.getText();

		if (ActualErrMsg.contentEquals(ExpectedErrorMsg))
			System.out.println("Test case passed for error message");
		else
			System.out.println("Test case failed");
	}
	


	public WebElement explicitWait(int waitTime,By by){
		WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver driver) {
				try {
					WebElement element = driver.findElement(by);
					if (element.isDisplayed())
						return element;
					else
						return null;
				} 
				catch (NoSuchElementException ex) {
					return null;
				} 
				catch (StaleElementReferenceException ex) {
					return null;
				} 
				catch (NullPointerException ex) {
					return null;
				}
			}
		});
	}

	
	
	public void closeSession(){
		driver.close();	
	}
	
	
}


