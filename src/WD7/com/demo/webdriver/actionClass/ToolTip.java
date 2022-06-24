package WD7.com.demo.webdriver.actionClass;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.support.PagedListHolder;

public class ToolTip {

	public static void main(String[] args)
			throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		WebElement rmail = driver.findElement(By.xpath("//a[text()='Rediffmail']"));

		WebElement rMoney = driver.findElement(By.xpath("//a[text()='Money']"));

		String toolTipMail = rmail.getAttribute("title");
		String toolTipMoney = rMoney.getAttribute("title");
		System.out.println("RediffMail tooltip: "+toolTipMail);
		System.out.println("RediffMoney tooltip:"+ toolTipMoney);
		driver.quit();
	}
}
