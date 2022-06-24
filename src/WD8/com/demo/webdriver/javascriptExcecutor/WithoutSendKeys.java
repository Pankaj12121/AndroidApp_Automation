package WD8.com.demo.webdriver.javascriptExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String DomainName = js.executeScript("return document.domain;").toString();	
        System.out.println("Domain name of the site = "+DomainName);
        
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);
        
        String TitleName = js.executeScript("return document.title;").toString();			
        System.out.println("Title of the page = "+TitleName);
        
        WebElement element= driver.findElement(By.name("btnK"));
        WebElement search= driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='Jobs in selenium';",search);

		js.executeScript("arguments[0].click();",element);
		
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(5000);
		driver.close();

	}


}

