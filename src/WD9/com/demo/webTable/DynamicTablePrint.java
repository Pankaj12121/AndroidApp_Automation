package WD9.com.demo.webTable;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DynamicTablePrint {

	@FindBy(xpath = "//table")
	WebElement baseTable;

	@FindBy(xpath = "//table//tr")
	List<WebElement> rows;

	@FindBy(xpath = "//table//tr/th")
	List<WebElement> hrows;

	@Test
	public void webTable() throws ParseException {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "D:\\Grid\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		PageFactory.initElements(wd, this);
		int h = 0;
		for (WebElement row : rows) {
			printRows(row, h);
			h++;

		}

	}

	public void printRows(WebElement row, int h) {
		List<WebElement> nRow = row.findElements(By.xpath("//th"));
		for (int i = 1; i < nRow.size()+1; i++) {
			if (h == 0) {
				WebElement headerColumn = row.findElement(By.xpath("//th" + "[" + i + "]"));
				System.out.println(headerColumn.getText());
			} else {
				WebElement headerColumn = baseTable
						.findElement(By.xpath("//tr" + "[" + h + "]/" + "td" + "[" + i + "]"));
				System.out.println(headerColumn.getText());
			}

		}

	}
}
