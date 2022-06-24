package WD10.com.demo.webdriver.uploadDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Tosca\\SelDownload");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(caps);
		driver.get("http://sample-videos.com/");
		WebElement clickLink= driver.findElement(By.xpath("//a[@user_id='same_configuration_id=126']"));
		System.out.println("clicked on video link");
		clickLink.click();
		Thread.sleep(3000);
		driver.close();
	}

}
