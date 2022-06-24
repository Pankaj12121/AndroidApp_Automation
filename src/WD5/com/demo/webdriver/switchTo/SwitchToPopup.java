package WD5.com.demo.webdriver.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToPopup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "https://wss.mahadiscom.in/wss/wss?uiActionName=getCustAccountLogin";
		driver.get(baseUrl);
		WebElement okButton = driver.findElement(By.id("lblLoginButton"));
		okButton.click();
		String alertMsg = acceptAlert();
		System.out.println(alertMsg);
		driver.close();
	}

	public static String acceptAlert() throws InterruptedException {
		String alertMessage = "";
		Thread.sleep(3000);
		if (driver.switchTo().alert() != null) {
			try {
				alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				return alertMessage;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("No pop up displayed");
			}
		} else {
			System.out.println("switch to popup was false");
		}
		return alertMessage;
	}
}