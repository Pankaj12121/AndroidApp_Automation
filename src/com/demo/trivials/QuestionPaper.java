package com.demo.trivials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class QuestionPaper {
	WebDriver driver;
	WebDriverWait wait;
public static void main(String[] args) {
	
//----111111111111111111111111--------------------------------------------------------------------
		//1.	How can the catch clause be improved?
		try {
		 int i = n / 0;
		 int[] numbers = new int[] {1, 2, 3, 4, 5};
		 numbers[10] = 9;
		}
		catch (Exception e) {
		 console.out(e.getMessage());
		} 
		/*Answer
		There are 2 exceptions generated in the try block:
		•	dividing n to 0 throws an ArithmeticException
		•	accessing the 11 array element throws an IndexOutOfBounds exception
		Each exception should be handled separately in its own catch clause.
		Also, since both exceptions are severe, instead of logging a message in the console, a new exception should be thrown with a user friendly error message and the initial exception:*/
		//--------------------------------------------------------------*****---------------------------------------------
		//Solution
		try {
			int i = n / 0;
		 	int[] numbers = new int[] {1, 2, 3, 4, 5};
		 	numbers[10] = 9;
		}
		catch (ArithmeticException e) {
		 	throw new RuntimeException("division to 0!", e);
		}	catch (IndexOutOfBoundsException e) {
		 	throw new RuntimeException("elements out of the array", e);
		} 
//-------------222222222222222222222222222-----------------------------------------------------------------------------
		/*2.	After opening the home page of a site, a popup is displayed randomly. How do you handle this popup?
		Answer
		The random popup is displayed over the home page.
		The popup has a title, a cancel button, some text and a submit button.
		Sometimes, the popup is displayed, sometimes it is not.
		When it is displayed, the automation code should close it.
		When it is not displayed, the automation code should not do anything:*/
		
		   private final static By TITLE_ID = By.id("title");
		   private final static By CANCEL_ID = By.id("cancel");
		   
		   
		  
		   public Popup() { 
		 	this.driver = driver;
		        this.wait = new WebDriverWait(this.driver, 5);   }
		 
		   public void cancel1() {
		      if (isDisplayed()) {	
		    	  WebElement cancelButton = this.wait.until(
				ExpectedConditions.elementToBeClickable(CANCEL_ID));
		 	
			cancelButton.click(); 	
			this.wait.until(ExpectedConditions.
				invisibilityOfElementLocated(TITLE_ID));      }
		   }
		 
		   public boolean isDisplayed() {
		 	try {
		 	  WebElement title = this.wait.until(
				 ExpectedConditions.
					visibilityOfElementLocatedBy(TITLE_ID));	  
		 	  return title.isDisplayed();
		 	} catch (TimeoutException e) {
		   	  return false;
		        }
		   }
		
		/*isDisplayed() returns true if the title of the popup is visible in 3 seconds. Otherwise, it returns false.
		cancel() will do something only if the popup is displayed (isDisplayed() returns true):
		•	It finds the cancel button
		•	It clicks the cancel button
		•	It waits until the title of the popup is invisible
		In the test, you need to call the cancel() method of the popup after HomePage is displayed:*/
		   
		/*HomePage homePage = new HomePage(driver);
		homePage.open();
		homePage.popup().cancel();*/
//--------------------3333333333333333333333333333333333333333333333333-------------------------------------------
		//3.	How would you improve the following method?
		public void selectPage1(int i) {
			By l = getLc(i);
			WebElement p = driver.findElement(l);
			p.click();
		}
		/*Answer
		There are multiple things to improve.
		The parameter represents a page number.
		Since page numbers can only be positive, the method should start with a check for invalid values for the parameter.

		Some of the names are not good enough. l should be replaced by locator, p by page and getLc by getLocator.

		Finding an element with driver.findElement() only works if the page is displayed fast and the element is on it. It is better to wait until the element is available before using it

		The better code is below:*/
		public void selectPage(int i) {
			if (i <= 0)
			throw new IllegalArgumentException("invalid index — " + i);	
			By locator = getLocator(i);	
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			WebElement page = wait.until(
				ExpectedConditions
					.elementToBeClickable(locator));
			page.click();
		}

	//-------------44444444444444444444444444444444--------------------------------------------------------
		/*4.	What are all different ways of finding an element using Selenium WebDriver?
		Answer
		There are multiple ways of finding an element with Selenium WebDriver:*/
		//1.	using driver.findElement()
		WebElement element1 = driver.findElement(locator);

		//2. using driver.findElements()
		List list = driver.findElements(locator);
		WebElement element = (WebElement) list.get(0);
		//3. using explicit wait and expected conditions
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement list1 = wait.until(
		 			ExpectedConditions.
					 visibilityOfElementLocatedBy(loc));
		//4. using Javascript
		String getElementJS = "function getElement(){ “ +
		 	"var t = document.getElementById(‘title’); return t; 
		 	}; " + 
		 	"return getElement()”;WebElement title = (WebElement)jsExec.executeScript(getElementJS);



}
