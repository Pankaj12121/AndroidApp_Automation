package com.demo.toolsqa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
  
public class WebdriverIPO {
	@FindAll(@FindBy(xpath = "//div[text()='Current']/preceding ::td[3]/div/div/a"))
	private static List<WebElement> scrip;
	public static boolean isIpoOpen;
	static String current = "Current";
	// static String current = "Closed";
	static WebDriver driver;

	public WebdriverIPO(WebDriver driver) throws FileNotFoundException, IOException {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		try {
			ipo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unlikely-arg-type")
	public static void ipo() throws IOException, InterruptedException {
		String ipoText;

		System.setProperty("webdriver.chrome.driver", "D://Grid/chromedriver.exe");
		/*
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "//chromedriver//chromedriver.exe");
		 */
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		// Reporter.log("Customized Download Folder is set with Timestamp");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		// options.merge(cap);
		driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		// Reporter.log("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			driver.get("https://www.chittorgarh.com");
			WebElement ipo = driver.findElement(By.id("dropdownIPOBtn"));
			ipo.click();
			WebElement ipoDashboard = driver
					.findElement(By.xpath("//div[@id='w3dropdownIPO']/div/div[1]/a[text()='IPO Dashboard']"));
			ipoDashboard.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(5000);
			WebElement status = driver.findElement(By.xpath("//div[text()='Current']"));
			// WebElement status = driver.findElement(By.xpath("//div[text()='Closed']"));
			if (!status.isDisplayed()) {
				driver.navigate().refresh();
			}

			System.out.println(status.getText());
			String s = status.getText();
			if (s.equals(current)) {
				List<WebElement> scrip = driver
						.findElements(By.xpath("//div[text()='Current']/preceding ::td[3]/div/div/a"));

				// List<WebElement>
				// scrip=driver.findElements(By.xpath("//div[text()='Closed']/preceding
				// ::td[3]/div/div/a"));
				System.out.println(scrip);
				System.out.println(scrip.toString());
				int ipocount = scrip.size();
				String count = Integer.toString(ipocount);
				System.out.println(count);

				Set<String> strings = new LinkedHashSet<String>();
				for (WebElement e : scrip) {
					strings.add(e.getText());
				}
				System.out.println(strings);

				List<String> price = new ArrayList<String>();
				for (WebElement e : scrip) {
					JavascriptExecutor js1 = (JavascriptExecutor) driver;
					js1.executeScript("window.scrollBy(0,200)");
					// driver.navigate().refresh();
					Thread.sleep(200);
					// retryingFindClick(by.)
					e.click();
					Thread.sleep(200);
					js1.executeScript("window.scrollBy(0,300)");
					WebElement priceBand = driver
							.findElement(By.xpath("//tr/td[text()='IPO Price']//following-sibling :: td"));
					price.add(priceBand.getText());
					String a = price.toString().substring(1, 13).replace("to", "-");
					System.out.println(a);
					driver.navigate().back();
					Thread.sleep(1000);
					driver.navigate().refresh();
				}

				HashMap<String, String> hedDetails = new HashMap<>();
				for (int I = 0; I < ipocount; I++) {
					hedDetails.put(strings.toString(), price.toString());
				}
				System.out.println(hedDetails.toString());
				Properties props = new Properties();
				props.put("IpoName", hedDetails.toString());
				props.put("IpoCount", count);

				String path = "C:\\Users\\Lenovo\\Documents\\abma_upcomingmilestonerelease\\configIpo.properties";
				FileOutputStream outputStrem = new FileOutputStream(path);
				props.store(outputStrem, "This is a IPO properties file");
				System.out.println("Properties file created......");

				// }
				isIpoOpen = true;

			}

			else {
				System.out.println("There is no IPO today");
			}

		} catch (Exception e) {

		} finally {
			driver.close();
		}

	}
}
