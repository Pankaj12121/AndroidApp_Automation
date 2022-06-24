package WD5.com.demo.webdriver.switchTo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewTab {
	
	@FindBy(linkText="Maven users")
	static
	WebElement mavenLink;
	
	@FindBy(linkText="see the wiki page")
	static
	WebElement wikiLink;
	static ArrayList<String> tabs;
	public static void main(String args[]) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, new OpenNewTab());
		driver.get("http://docs.seleniumhq.org/download/");
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		mavenLink.sendKeys(selectLinkOpeninNewTab);
		switchToTab(driver,0);
		wikiLink.sendKeys(selectLinkOpeninNewTab);
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
