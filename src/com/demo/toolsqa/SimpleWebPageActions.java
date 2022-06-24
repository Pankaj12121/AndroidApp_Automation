package com.demo.toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import WD6.com.demo.webdriver.implicitExplicitWait.WebPage;

public class SimpleWebPageActions extends WebPage {
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Elements')]")
	WebElement ElementsMenu;
	@FindBy(xpath = "//span[contains(text(),'Text Box')]")
	WebElement textBoxMenu;
	@FindBy(id = "userName")
	WebElement userNameTextBox;
	@FindBy(id = "userEmail")
	WebElement emailIDTextBox;
	@FindBy(id = "currentAddress")
	WebElement currentAddTextBox;
	@FindBy(id = "permanentAddress")
	WebElement permAddTextBox;
	@FindBy(id = "submit")
	WebElement submitbtn;

	@FindBy(xpath = "//span[contains(text(),'Check Box')]")
	WebElement checkBoxMenu;
	@FindBy(xpath = "//span[@class='rct-checkbox']")
	WebElement chkBox;

	@FindBy(xpath = "//span[contains(text(),'Radio Button')]")
	WebElement radioButtonMenu;
	@FindBy(xpath = "//label[contains(text(),'Yes')]")
	WebElement yesRbtn;
	@FindBy(xpath = "//label[contains(text(),'Impressive')]")
	WebElement impreRbtn;

	@FindBy(xpath = "//span[contains(text(),'Buttons')]")
	WebElement ButtonMenu;
	@FindBy(id = "doubleClickBtn")
	WebElement doubleClickBtn;
	@FindBy(id = "rightClickBtn")
	WebElement rghtClickBtn;

	@FindBy(xpath = "//span[contains(text(),'Links')]")
	WebElement linkMenu;
	@FindBy(linkText = "Home")
	WebElement homeLink;
	@FindBy(linkText = "Created")
	WebElement createdLink;

	@FindBy(xpath = "//span[contains(text(),'Broken Links - Images')]")
	WebElement brokenlinkMenu;
	@FindBy(linkText = "Click Here for Valid Link")
	WebElement validLink;
	@FindBy(linkText = "Click Here for Broken Link")
	WebElement brokenLink;

	@FindBy(xpath = "//span[contains(text(),'Upload and Download')]")
	WebElement upDownloadMenu;
	@FindBy(id = "downloadButton")
	WebElement downloadBtn;
	@FindBy(id = "uploadFile")
	WebElement uploadFile;

	WebDriver driver;
	String url = "https://demoqa.com/elements";

	@Test
	public void simpleActions() {
		launchBrowser(url);
		fillTextBoxes();
		selectChkBox();
		radioButtonSelect();
		buttonSelect();
		linkClick();
		brokenLink();
		uploadAndDownload();

	}

	public void fillTextBoxes() {
		click(ElementsMenu, "Element menu");
		click(ElementsMenu, "Element menu");
		click(textBoxMenu, "Text box type menu");
		sendKeys(userNameTextBox, "Pankaj", "UserName text box");
		sendKeys(emailIDTextBox, "Pankaj.yogi@gmail.com", "Email text box");
		sendKeys(currentAddTextBox, "Dombivali", "current address text box");
		sendKeys(permAddTextBox, "Pune", "perm address text box");
		bringElementintoView(driver, submitbtn);
		click(submitbtn, "submit btn");

	}

	public void selectChkBox() {
		click(checkBoxMenu, "Check box Menu");
		bringElementintoView(driver, chkBox);
		click(chkBox, "Check box");

	}

	public void radioButtonSelect() {
		click(radioButtonMenu, "Radio button Menu");
		bringElementintoView(driver, yesRbtn);
		click(yesRbtn, "YES raadio button");
		click(impreRbtn, "Impressive raadio button");
	}

	public void buttonSelect() {
		click(ButtonMenu, "button Menu");
		bringElementintoView(driver, doubleClickBtn);
		doubleClick(driver, doubleClickBtn, "Double Click button");
		rightClick(driver, rghtClickBtn, "Right Click button");
	}

	public void linkClick() {
		click(linkMenu, "link Menu");
		bringElementintoView(driver, homeLink);
		click(homeLink, "Home link");
		click(createdLink, "created link");
	}

	public void brokenLink() {
		click(brokenlinkMenu, "Broken link Menu");
		bringElementintoView(driver, validLink);
		click(validLink, "Valid link");
		String originalHandle = driver.getWindowHandle();
		closeTab(driver, originalHandle);
		driver.navigate().back();
		bringElementintoView(driver, brokenLink);
		click(brokenLink, "Broken link");
		driver.navigate().back();
	}

	public void uploadAndDownload() {
		bringElementintoView(driver, upDownloadMenu);
		click(upDownloadMenu, "upload download Menu");
		bringElementintoView(driver, uploadFile);
		click(downloadBtn, "DownLoad File");
		sendKeys(uploadFile, "D://TestData.xlsx", "upload file");
	}

	
}
