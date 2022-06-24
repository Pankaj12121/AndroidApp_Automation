package TG3.com.demo.testNG.parallelExecution;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExecution2 {
	public WebDriver driver;
	@Test(groups="parallel")
	public void m1() throws MalformedURLException  {
		driver=returnwdff("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();


	}
	@Test(groups="parallel")
	public void m2() throws MalformedURLException {
		driver=returnwd("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}
	@Test(groups="parallel")
	public void m3() throws MalformedURLException {
		driver=returnwdff("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}
	@Test(groups="parallel")
	public void m4() throws MalformedURLException {
		
		driver=returnwd("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}
	@Test(groups="parallel")
	public void m5() throws MalformedURLException {
		driver=returnwdff("https://www.jabong.com/");
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}
	@AfterTest(groups="parallel")
	public void closeB() {
		driver.close();
	}

	public WebDriver returnwd(String URL) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities().chrome();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("ignore-certificate-errors");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
		prefs.put("download.default_directory", "C:\\Downloads");
		options.setExperimentalOption("prefs", prefs);

		
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		String gridURL="http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(gridURL), capabilities);
		driver.get(URL);
		return driver;
	}
	
	public WebDriver returnwdff(String URL) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
		String gridURL="http://localhost:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(gridURL), capabilities);
		driver.get(URL);
		return driver;
	}

}
