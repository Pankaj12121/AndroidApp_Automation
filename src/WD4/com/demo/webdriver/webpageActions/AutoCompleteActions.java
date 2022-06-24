package WD4.com.demo.webdriver.webpageActions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoCompleteActions {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(id = "tags")
	WebElement textBoxElement;
	@FindBy(className = "demo-frame")
	WebElement frameElement;
	@FindBy(id = "ui-id-1")
	WebElement autoOptions;
	@FindBy(xpath = "//li")
	List<WebElement> optionsToSelect;
	

	String URL = "http://jqueryui.com/autocomplete/";

	@Test
	public void launchdriver() {

		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		driver.navigate().to(URL);
		wait = new WebDriverWait(driver, 20);
		driver.switchTo().frame(frameElement);
		textBoxElement.clear();
		textBoxElement.sendKeys("a");
		selectAutoCompleteElement("Java");
		
	}

	public void selectAutoCompleteElement(String textToSelect) {
		try {
			for (WebElement option : optionsToSelect) {
				if (option.getText().equals(textToSelect)) {
					System.out.println("Trying to select: " + textToSelect);
					option.click();
					break;
				}
			}

		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
