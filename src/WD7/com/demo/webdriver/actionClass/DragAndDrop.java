package WD7.com.demo.webdriver.actionClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xalan.xsltc.DOM;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestNGException;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;

	@Test
	public void dragnDrop() {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/droppable/");
		// Wait for the frame to be available and switch to it
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
		WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
		dragAndDrop(Sourcelocator, Destinationlocator);
		String actualText = driver.findElement(By.cssSelector("#droppable>p")).getText();
		
		try {
			Assert.assertEquals(actualText, "Dropped!@@");
		} catch (AssertionError e) {
			e.printStackTrace();
			TakesScreenshot ts = (TakesScreenshot) driver;

			// capture screenshot as output type FILE
			File file = ts.getScreenshotAs(OutputType.FILE);

			try {
				// save the screenshot taken in destination path
				FileUtils.copyFile(file, new File("./ScreenShot_Folder/Test1_Login.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			throw new TestNGException(e);
		}
		/*
		 * try { Assert.assertEquals(actualText, "Dropped!@@");
		 * System.out.println("Test case is passed");
		 * Reporter.log("Test case is passed"); } catch (AssertionError error) {
		 * System.out.println("Test case is failed");
		 * Reporter.log("Test case is failed"); //throw new
		 * TestNGException("Test case failed");
		 * 
		 * }
		 */
	}

	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
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
