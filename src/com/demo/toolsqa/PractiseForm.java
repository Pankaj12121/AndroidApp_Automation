package com.demo.toolsqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import WD6.com.demo.webdriver.implicitExplicitWait.WebPage;

public class PractiseForm extends WebPage {
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Elements')]")
	WebElement ElementsMenu;
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Forms')]")
	WebElement formsMenu;
	@FindBy(xpath = "//span[contains(text(),'Practice Form')]")
	WebElement practiceFormMenu;

	@FindBy(id = "firstName")
	WebElement fname;
	@FindBy(id = "lastName")
	WebElement lname;
	@FindBy(id = "userEmail")
	WebElement email;
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	WebElement malerb;
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	WebElement femaleRb;
	@FindBy(xpath = "//span[contains(text(),'Other')]")
	WebElement otherRb;
	@FindBy(id = "userNumber")
	WebElement mobile;
	@FindBy(id = "dateOfBirthInput")
	WebElement dob;
	@FindBy(xpath = "//div[@class='css-1g6gooi']")
	WebElement subject;
	@FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
	WebElement hobbiesChkBox;
	@FindBy(id = "uploadPicture")
	WebElement uploadFile;
	@FindBy(id = "currentAddress")
	WebElement cuAddress;
	@FindBy(xpath = "//label[text()='State and City']/following::div[9]")
	WebElement state;
	@FindBy(xpath = "//label[text()='State and City']/following::div[19]")
	WebElement city;
	@FindBy(id = "submit")
	WebElement submitBtn;

	WebDriver driver;
	String url = "https://demoqa.com/elements";

	@Test
	public void fillSampleForm() {

		driver=launchBrowser(url);
		click(ElementsMenu, "Element menu");
		sleep(3000);
		click(formsMenu, "Forms menu");
		sleep(1000);
		click(practiceFormMenu, "practise Forms menu");
		sendKeys(fname, "Sandeep", "firstName editBox");
		sendKeys(lname, "Loke", "lastName editBox");
		sendKeys(email, "Sandeep.loke@gmail.com", "email editBox");
		click(malerb, "Radio button");
		sendKeys(mobile, "988274567", "mobile editBox");
		sendKeys(dob, "15/06/78", "mobile editBox");
		autocompletewithKeys(driver,subject, "Maths", "subject editBox");
		sleep(1000);
		bringElementintoView(driver, hobbiesChkBox);
		jsClick(driver,hobbiesChkBox, "Check box");
		sendKeys(uploadFile, "D://sampleFile.jpeg", "upload file");
		sendKeys(cuAddress, "Pune", "address text box");
		autocompletewithKeys(driver,state, "NCR", "State drop down");
		autocompletewithKeys(driver,city, "Delhi", "City drop down");
		click(submitBtn, "submit button");
	}
}
