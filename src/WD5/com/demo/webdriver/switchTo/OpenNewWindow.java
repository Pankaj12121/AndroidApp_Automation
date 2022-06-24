package WD5.com.demo.webdriver.switchTo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {
	static ArrayList<String> tabs ;

	public static void main(String args[]) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		String selectLinkOpeninNewTab = Keys.chord(Keys.SHIFT,Keys.RETURN); 
		driver.findElement(By.linkText("Maven users")).sendKeys(selectLinkOpeninNewTab);
		switchToTab(driver,0);
		driver.findElement(By.linkText("see the wiki page")).sendKeys(selectLinkOpeninNewTab);
		switchToTab(driver,0);
		closeTab(driver, 1);
		Thread.sleep(1000);
		closeTab(driver, 1);
		driver.quit();


	}

	public static void switchToTab(WebDriver driver,int i){
		tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("new tab opened "+tabs.get(i).toString());
		driver.switchTo().window(tabs.get(i));	
	}
	public static void closeTab(WebDriver driver,int i){
		tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("tab closed "+tabs.get(i).toString());
		driver.switchTo().window(tabs.get(i)).close();	
	}

}
