package TG3.com.demo.testNG.parallelExecution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
	@Test(groups="parallelTests")
	public void m1() throws MalformedURLException {
		LaunchFirefoxBrowser("https://www.snapdeal.com");
	}
	
	@Test(groups="parallelTests")
	public void m2() throws MalformedURLException {
		LaunchBrowser("https://www.flipkart.com");
	}
	
	@Test(groups="parallelTests")
	public void m3() throws MalformedURLException {
		LaunchBrowser("https://www.amazon.com");
	}
	
	@Test(groups="parallelTests")
	public void m14() throws MalformedURLException {
		LaunchBrowser("https://www.rediff.com");
	}
	
	@Test(groups="parallelTests")
	public void m5() throws MalformedURLException {
		LaunchBrowser("https://www.quora.com");
	}

	
	public void LaunchBrowser(String url) throws MalformedURLException {
 		String Node = "http://localhost:4444/wd/hub";
 		DesiredCapabilities cap = DesiredCapabilities.chrome();
 
 		driver = new RemoteWebDriver(new URL(Node), cap);
 
 		driver.navigate().to(url);		
		
	}
	
	public void LaunchFirefoxBrowser(String url) throws MalformedURLException {
		
		
 		String Node = "http://localhost:4444/wd/hub";
 		DesiredCapabilities cap = DesiredCapabilities.firefox();
 
 		driver = new RemoteWebDriver(new URL(Node), cap);
 
 		driver.navigate().to(url);		
		
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser Closed");
	}
}
