package WD7.com.demo.webdriver.actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeriesOfActions {
	public static void main(String[] args) {
		String baseUrl = "https://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("txtUsername"));
		WebElement help = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername)
				.build();

		seriesOfActions.perform();
		builder.contextClick(help).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//builder.sendKeys("t").perform();
		
	}
}
