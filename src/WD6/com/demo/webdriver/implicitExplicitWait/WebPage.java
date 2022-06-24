package WD6.com.demo.webdriver.implicitExplicitWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPage {

	public WebElement explicitWait(WebDriver driver, int waitTime, By by) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
		webDriverWait.pollingEvery(10, TimeUnit.MICROSECONDS);
		return webDriverWait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver driver) {
				try {
					WebElement element = driver.findElement(by);
					if (element.isDisplayed())
						return element;
					else
						return null;
				} catch (NoSuchElementException ex) {
					return null;
				} catch (StaleElementReferenceException ex) {
					return null;
				} catch (NullPointerException ex) {
					return null;
				}
			}
		});
	}

	public WebElement explicitWait2(WebDriver driver, int waitTime, By by) {
		try {
			WebElement firstResult = new WebDriverWait(driver, waitTime)
					.until(ExpectedConditions.elementToBeClickable(by));
			return firstResult;
		} catch (NoSuchElementException ex) {
			return null;
		} catch (StaleElementReferenceException ex) {
			return null;
		} catch (NullPointerException ex) {
			return null;
		}
	}

	public void click(WebElement ele, String fieldName) {
		try {
			ele.click();
			System.out.println("Successfully clicked on " + fieldName);
		} catch (Exception e) {
			System.out.println("Failed to click on " + fieldName);
		}

	}

	public void actionClick(WebDriver driver, WebElement ele, String fieldName) {
		try {
			Actions action = new Actions(driver);
			action.click(ele).build().perform();
			System.out.println("Successfully clicked on " + fieldName);
		} catch (Exception e) {
			System.out.println("Failed to click on " + fieldName);
		}

	}

	public void jsClick(WebDriver driver, WebElement ele, String fieldName) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
			System.out.println("Successfully clicked on " + fieldName);
		} catch (Exception e) {
			System.out.println("Failed to click on " + fieldName);
		}

	}

	public void sendKeys(WebElement ele, String data, String fieldName) {
		try {
			ele.sendKeys(data);
			;
			System.out.println("Successfully entered data " + data + " in " + fieldName);
		} catch (Exception e) {
			System.out.println("Failed to enter data " + data + " in " + fieldName);
		}

	}

	public void bringElementintoView(WebDriver driver, WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void doubleClick(WebDriver driver, WebElement ele, String fieldName) {
		try {
			Actions action = new Actions(driver);
			action.doubleClick(ele).build().perform();
			System.out.println("Successfuly double clicked on " + fieldName);
		} catch (Exception e) {
			System.out.println("Failed to double clicke on " + fieldName);
		}

	}

	public void rightClick(WebDriver driver, WebElement ele, String fieldName) {
		try {
			Actions action = new Actions(driver);
			action.contextClick(ele).build().perform();
			System.out.println("Successfuly right clicked on " + fieldName);
		} catch (Exception e) {
			System.out.println("Failed to right clicke on " + fieldName);
		}

	}

	public void closeTab(WebDriver driver, String originalHandle) {

		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.close();
				System.out.println("Closed the new tab ");
			}
		}

		driver.switchTo().window(originalHandle);
	}

	public WebDriver launchBrowser(String url) {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			PageFactory.initElements(driver, this);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			System.out.println("Successfully launched browser.");
			return driver;
		} catch (Exception e) {
			throw new WebDriverException("Unable to launch Browser.");

		}

	}

	public void selectoption(WebElement ele, String data, String fieldName) {
		try {
			Select select = new Select(ele);
			select.selectByValue(data);
			System.out.println("successfully selected " + data + " value from drop down");
		} catch (Exception e) {
			System.out.println("failed to  select " + data + " value from drop down");
		}

	}

	public void sleep(int counter) {
		try {
			Thread.sleep(counter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectAutoCompleteElement(List<WebElement> optionsToSelect, String textToSelect) {
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

	public void selectItemFromDropDown(WebElement element, String value, String FieldName) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(value);

			System.out.println("successfully selected  " + value + " from drop down " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to select  " + value + " from drop down " + FieldName);
			e.printStackTrace();
		}

	}

	public void selectMultipalItemFromDropDown(WebDriver driver, WebElement element, String[] values,
			String FieldName) {
		String sValue = "";
		try {
			Actions actions = new Actions(driver);
			for (String value : values) {
				sValue = value;
				Select select = new Select(element);
				actions.sendKeys(Keys.TAB).clickAndHold().perform();
				select.selectByVisibleText(value);

				System.out.println("successfully selected  " + sValue + " from drop down " + FieldName);
			}
		} catch (Exception e) {
			System.out.println("Failed to select  " + sValue + " from drop down " + FieldName);
			e.printStackTrace();
		}

	}

	public void selectItemFromDropDownIndex(WebElement element, int value, String FieldName) {
		try {
			Select select = new Select(element);
			select.selectByIndex(value);

			System.out.println("successfully selected  " + value + " from drop down " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to select  " + value + " from drop down " + FieldName);
			e.printStackTrace();
		}

	}

	public void selectItemFromDropDownDiv(List<WebElement> elements, String value, String FieldName) {
		try {
			for (int i = 0; i <= elements.size() - 1; i++) {

				if (elements.get(i).getText().contains(value)) {

					elements.get(i).click();
					break;

				}
			}
			System.out.println("successfully selected  " + value + " from drop down " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to select  " + value + " from drop down " + FieldName);
			e.printStackTrace();
		}

	}

	public String getSelectedValueFromList(WebElement element, String value) {

		Select selectType = new Select(element);
		String selectedValue = selectType.getFirstSelectedOption().getText();
		return selectedValue;

	}

	public void autocompletewithKeys(WebDriver driver, WebElement ele, String data, String FieldName) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(ele);
			actions.click();
			actions.sendKeys(data);
			actions.sendKeys(Keys.TAB);
			actions.build().perform();

			System.out.println("successfully selected  " + data + " from  " + FieldName);
		} catch (Exception e) {
			System.out.println("Failed to select  " + data + " from " + FieldName);
			e.printStackTrace();
		}
	}

	public void autocompletewithMultipalKeys(WebDriver driver, WebElement ele, String[] data, String FieldName) {
		try {
			for (String str : data) {
				Actions actions = new Actions(driver);
				actions.moveToElement(ele);
				actions.click();
				actions.sendKeys(str);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();

				System.out.println("successfully selected  " + data + " from  " + FieldName);
			}
		} catch (Exception e) {
			System.out.println("Failed to select  " + data + " from " + FieldName);
			e.printStackTrace();
		}
	}

	public void switchToWindow(WebDriver driver, String title) {
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			driver.switchTo().window(handle);
			// driver.manage().window().maximize();

			if (driver.getTitle().contains(title)) {
				break;
			}
		}

	}

	public void switchToTab(WebDriver driver, int index) {
		try {
			ArrayList<String> tabs_windows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs_windows.get(index));
			System.out.println("Successfully switched to new browser tab");
			driver.close();
			sleep(1000);
			driver.switchTo().window(tabs_windows.get(0));
		} catch (Exception e) {
			System.out.println("FAiled to switch to new browser tab");
		}
	}

	public String acceptAlert(WebDriver driver) {
		String alertMessage = "";
		sleep(3000);
		if (driver.switchTo().alert() != null) {
			try {
				alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				return alertMessage;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("No pop up displayed");
			}
		} else {
			System.out.println("switch to popup was false");
		}
		return alertMessage;
	}

	public String acceptAlertNSendKeys(WebDriver driver) {
		String alertMessage = "";
		sleep(3000);
		if (driver.switchTo().alert() != null) {
			try {
				alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().sendKeys("Hello");
				driver.switchTo().alert().accept();
				return alertMessage;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("No pop up displayed");
			}
		} else {
			System.out.println("switch to popup was false");
		}
		return alertMessage;
	}

	public String waitNacceptAlert(WebDriver driver) {
		String alertMessage = "";
		sleep(5000);
		boolean flag = driver.switchTo().alert() != null;
		while (flag) {
			try {
				alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				return alertMessage;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("No pop up displayed");
			}

		}
		return alertMessage;
	}

	public String getText(WebElement ele) {
		String text = "";
		try {
			text = ele.getText();
			System.out.println("Get text successful");
		} catch (Exception e) {
			System.out.println("Failed to Get text");
		}

		return text;

	}

	public void moveSlider(WebDriver driver, WebElement element, int x, int y) {
		try {
			Actions act = new Actions(driver);
			act.dragAndDropBy(element, x, y).perform();
			System.out.println("Successfully draged the slider");
		} catch (Exception e) {
			System.out.println("Failed to drag the slider");
			e.printStackTrace();

		}
	}

	public String getToolTip(WebDriver driver, WebElement element, String attributeName) {
		String tooltiptext1 = "";
		try {
			Actions act = new Actions(driver);
			act.clickAndHold().moveToElement(element);
			act.moveToElement(element).build().perform();
			tooltiptext1 = element.getAttribute(attributeName);
			System.out.println("Successfully fetched tooltip " + tooltiptext1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to fetch tooltip ");
		}

		return tooltiptext1;

	}

	public void listItemDraNDrop(WebDriver driver, WebElement source, WebElement Destn) {
		try {
			Actions act = new Actions(driver);
			act.clickAndHold(source);
			act.dragAndDrop(source, Destn).build().perform();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void dragResizable(WebDriver driver, WebElement elementToResize, int xOffset, int yOffset) {
		Actions action = new Actions(driver);
		action.clickAndHold(elementToResize).moveByOffset(xOffset, yOffset).release().build().perform();
	}

	public void dragAndDrop(WebDriver driver, WebElement sourceElement, WebElement destinationElement) {
		try {
			if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) {
				Actions action = new Actions(driver);
				action.dragAndDrop(sourceElement, destinationElement).build().perform();
			} else {
				System.out.println("Element was not displayed to drag");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + sourceElement + "or" + destinationElement
					+ "is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Error occurred while performing drag and drop operation " + e.getStackTrace());
		}
	}

}
