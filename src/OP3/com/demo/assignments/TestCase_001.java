package OP3.com.demo.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase_001 {
	@FindBy(xpath = "//div[@class='product']")
	List<WebElement> baseProducts;
	WebDriver driver;

	@Test
	public void addItemsTocart() {
		System.setProperty("webdriver.chrome.driver", "D:\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int i = 1;
		for (WebElement cartItem : baseProducts) {

			String items = "Potato";
			int[] quantity = { 2, 3, 5, 4, 6 };
			addItemsWithQty(cartItem, items, quantity, i);
			i++;

		}
		driver.close();

	}

	int p = 1;

	public void addItemsWithQty(WebElement element, String itemsList, int[] qty, int index) {
		String cartItemName = driver.findElement(By.xpath("//div[@class='product']" + "[" + index + "]//" + "h4"))
				.getText();
		System.out.println(cartItemName);

		if (cartItemName.contains(itemsList)) {
			WebElement addtocartQty = driver
					.findElement(By.xpath("//div[@class='product']" + "[" + index + "]//" + "a[2]"));
			addtocartQty.click();
			WebElement addtocartButton = driver
					.findElement(By.xpath("//div[@class='product']" + "[" + index + "]//" + "button"));
			addtocartButton.click();
		}

	}

}
