package WD3.com.demo.webdriver.brokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://docs.seleniumhq.org/download/";
		driver.get(baseUrl);
		
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		
	
		for(WebElement link:linkList){
			String linkText= link.getText();
			System.out.println(linkText);
		}	
		System.out.println("Total links on webpage "+linkList.size());
	}
}