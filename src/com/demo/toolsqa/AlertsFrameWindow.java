package com.demo.toolsqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import WD6.com.demo.webdriver.implicitExplicitWait.WebPage;

public class AlertsFrameWindow extends WebPage {
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Elements')]")
	WebElement ElementsMenu;
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Alerts, Frame & Windows')]")
	WebElement AFWMenu;
	@FindBy(xpath = "//span[contains(text(),'Browser Windows')]")
	WebElement bWindow;
	@FindBy(id = "tabButton")
	WebElement newTab;
	@FindBy(id = "windowButton")
	WebElement wButton;
	@FindBy(id = "messageWindowButton")
	WebElement nwindowMsg;
	@FindBy(xpath = "//span[contains(text(),'Alerts')]")
	WebElement alerts;

	@FindBy(id = "alertButton")
	WebElement alertBtn;

	@FindBy(id = "timerAlertButton")
	WebElement timeAlertBtn;

	@FindBy(id = "confirmButton")
	WebElement confirmBtn;

	@FindBy(id = "promtButton")
	WebElement promtBtn;

	@FindBy(id = "closeSmallModal")
	WebElement smallModelDlg;

	@FindBy(id = "closeLargeModal")
	WebElement largeModelDlg;

	@FindBy(id = "showSmallModal")
	WebElement showSmallModal;

	@FindBy(id = "showLargeModal")
	WebElement showLargeModal;

	@FindBy(xpath = "//span[contains(text(),'Modal Dialogs')]")
	WebElement modelDlgs;

	WebDriver driver;
	String url = "https://demoqa.com/elements";

	@Test
	public void handleAlertsFrameWindow() {

		driver = launchBrowser(url);
		handlenewBrowserTab();
		handleAlerts();
		closeModelDlg();
	}

	public void handlenewBrowserTab() {
		click(ElementsMenu, "Element menu");
		sleep(3000);
		click(AFWMenu, "Alerts menu");
		bringElementintoView(driver, bWindow);
		click(bWindow, "Window Browser");
		sleep(1000);
		click(newTab, "NEW TAB");
		switchToTab(driver, 1);

	}

	public void handleAlerts() {
		bringElementintoView(driver, alerts);
		click(alerts, "Alerts menu");
		click(alertBtn, "Alert Button");
		String alertText = acceptAlert(driver);
		System.out.println(alertText);
		click(timeAlertBtn, "Time Alert Button");
		String walertText = waitNacceptAlert(driver);
		System.out.println(walertText);
		click(confirmBtn, "confirm button");
		String confirmText = acceptAlert(driver);
		System.out.println(confirmText);
		click(promtBtn, "prompt button");
		String promptText = acceptAlert(driver);
		System.out.println(promptText);

	}

	public void closeModelDlg() {
		bringElementintoView(driver, modelDlgs);
		click(modelDlgs, "Model Dialog menu");
		click(showSmallModal, "small Model Dialog button");
		sleep(1000);
		click(smallModelDlg, "close small Model Dialog popup");
		sleep(1000);
		click(showLargeModal, "large Model Dialog button");
		sleep(1000);
		click(largeModelDlg, "close large Model Dialog popup");

	}
}
