package WD1.com.demo.webdriver.LaunchDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDrivers {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities().chrome();

		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("ignore-certificate-errors");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
		prefs.put("download.default_directory", "C:\\Downloads");
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities cap= new DesiredCapabilities().chrome();*/
		//capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		String gridURL="http://localhost:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(gridURL), capabilities);
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);

	}
}