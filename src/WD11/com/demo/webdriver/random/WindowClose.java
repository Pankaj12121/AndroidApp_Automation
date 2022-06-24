package WD11.com.demo.webdriver.random;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowClose {
	public static void main(String args[]){

		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		Actions action = new Actions(driver);
		action.click().perform();;
		WebElement submit= driver.findElement(By.id("loginsubmit"));
		submit.click();
		String ExpectedTitle="NetBanking" ;
		Iterator<String> windows = driver.getWindowHandles().iterator();

		while(windows.next() != null){
			driver.switchTo().window(windows.next());
			String title = driver.getTitle();
			if(title.equals(ExpectedTitle)){
				driver.close();
				break;
			}
		}
	}

}
