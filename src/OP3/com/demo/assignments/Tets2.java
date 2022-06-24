package OP3.com.demo.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tets2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://demo.ewizsaas.com/Customer/Register");
		
		//driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("btnSubmit"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)",ele);
		
		ele.click();
	}

	
	protected static void bringElementInView (WebElement pageElement) {
		try {
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pageElement);

			
		} catch (Exception exception) {
			
			pageElement = null;
		}
	}
}
