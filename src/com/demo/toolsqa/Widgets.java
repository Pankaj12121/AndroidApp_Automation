package com.demo.toolsqa;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import WD6.com.demo.webdriver.implicitExplicitWait.WebPage;

public class Widgets extends WebPage {
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Elements')]")
	WebElement ElementsMenu;
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Widgets')]")
	WebElement WidgetsMenu;
	@FindBy(xpath = "//span[contains(text(),'Accordian')]")
	WebElement accordianSubMenu;

	@FindBy(id = "section1Heading")
	WebElement heading1;
	@FindBy(xpath = "//div[@id='section1Content']/p")
	WebElement heading1Content;
	@FindBy(id = "section2Heading")
	WebElement heading2;
	@FindBy(xpath = "//div[@id='section2Content']/p")
	WebElement heading2Content;
	@FindBy(id = "section3Heading")
	WebElement heading3;
	@FindBy(xpath = "//div[@id='section3Content']/p")
	WebElement heading3Content;
	@FindBy(id = "autoCompleteMultipleContainer")
	WebElement autoCompleteMultipal;
	@FindBy(xpath = "//div[@class='auto-complete__value-container css-1hwfws3']")
	WebElement autoCompleteSingle;
	@FindBy(xpath = "//span[contains(text(),'Auto Complete')]")
	WebElement autoComplete;
	@FindBy(xpath = "//span[contains(text(),'Slider')]")
	WebElement slidermenu;
	@FindBy(xpath = "//input[@class='range-slider range-slider--primary']")
	WebElement slider;
	@FindBy(id = "sliderValue")
	WebElement sliderMovedPercent;
	@FindBy(xpath = "//div[@role='progressbar']")
	WebElement progressBar;
	@FindBy(id = "startStopButton")
	WebElement startBtn;
	@FindBy(xpath = "//span[contains(text(),'Progress Bar')]")
	WebElement proBarMenu;

	@FindBy(id = "demo-tab-what")
	WebElement whatTab;
	@FindBy(id = "demo-tab-origin")
	WebElement originTab;
	@FindBy(id = "demo-tab-use")
	WebElement useTab;
	@FindBy(xpath = "//span[contains(text(),'Tabs')]")
	WebElement tabsMenu;

	@FindBy(id = "toolTipButton")
	WebElement tooltip1;
	@FindBy(id = "toolTipTextField")
	WebElement tooltip2;
	@FindBy(xpath = "//a[text()='1.10.32']")
	WebElement tooltip3;
	@FindBy(xpath = "//span[contains(text(),'Tool Tips')]")
	WebElement tooltipMenu;
	@FindBy(xpath = "//div[@id='withOptGroup']")
	WebElement dropDown1;
	@FindBy(xpath = "//div[@id='selectOne']")
	WebElement dropDown2;
	@FindBy(id = "oldSelectMenu")
	WebElement dropDown3;

	@FindBy(xpath = "//b[text()='Multiselect drop down']/following::div[1]")
	WebElement multiSelectdropDown;
	@FindBy(id = "cars")
	WebElement stdMultiSelectDropDown;
	@FindBy(xpath = "//div[@class='vertical-list-container mt-4']/div[1]")
	WebElement list1Drag;
	@FindBy(xpath = "//div[@class='vertical-list-container mt-4']/div[4]")
	WebElement list2Drag;
	
	WebDriver driver;
	String url = "https://demoqa.com/elements";
	@FindBy(xpath = "//span[contains(text(),'Select Menu')]")
	WebElement selectMenu;
	@FindBy(xpath = "//div[@class=' css-1hwfws3']/div")
	List<WebElement> elements;

	@Test
	public void handleAlertsFrameWindow() {

		driver = launchBrowser(url);
		getAccordian();
		autocomplete();
		slider();
		progressbar();
		tabs();
		tooltip();
		selectDropdown();

	}

	public void getAccordian() {
		click(ElementsMenu, "Element menu");
		sleep(3000);
		bringElementintoView(driver, WidgetsMenu);
		click(WidgetsMenu, "Widget menu");
		bringElementintoView(driver, accordianSubMenu);
		click(accordianSubMenu, "accordian Sub Menu");
		sleep(1000);
		click(heading1, "accordian Sub Menu");
		String h1 = getText(heading1Content);
		System.out.println(h1);
		sleep(1000);
		bringElementintoView(driver, heading2);
		click(heading2, "accordian Sub Menu");
		String h2 = getText(heading2Content);
		System.out.println(h2);
		sleep(1000);
		bringElementintoView(driver, heading3);
		click(heading3, "accordian Sub Menu");
		String h3 = getText(heading3Content);
		System.out.println(h3);

	}

	public void autocomplete() {
		bringElementintoView(driver, autoComplete);
		click(autoComplete, "Autocomplete Menu");
		click(autoCompleteMultipal, "multipal autocomplete");
		autocompletewithKeys(driver, autoCompleteMultipal, "aqu", "multipal autocomplete");
		autocompletewithKeys(driver, autoCompleteMultipal, "bla", "multipal autocomplete");
		click(autoCompleteSingle, "single autocomplete");
		autocompletewithKeys(driver, autoCompleteSingle, "bla", "single autocomplete");

	}

	public void slider() {
		bringElementintoView(driver, autoComplete);
		click(slidermenu, "slider Menu");
		sleep(1000);
		moveSlider(driver, slider, 0, 150);
		String percent = sliderMovedPercent.getAttribute("value");
		System.out.println("Slider moved to " + percent);

	}

	public void progressbar() {
		bringElementintoView(driver, proBarMenu);
		click(proBarMenu, "progress bar Menu");
		click(startBtn, "progress bar Start btn");
		sleep(2000);
		String percent = progressBar.getAttribute("aria-valuenow");
		System.out.println("Progress Bar value " + percent);
		click(startBtn, "progress bar Stop btn");
	}

	public void tabs() {
		bringElementintoView(driver, tabsMenu);
		click(tabsMenu, "tabs Menu");
		sleep(1000);
		click(whatTab, "What tab");
		click(originTab, "Origin tab");
		click(useTab, "Use tab");

	}

	public void tooltip() {
		bringElementintoView(driver, tooltipMenu);
		click(tooltipMenu, "tool tip  Menu");
		String tooltiptext1 = getToolTip(driver, tooltip1, "buttonToolTip");
		System.out.println("tooltip " + tooltiptext1);

	}

	public void selectDropdown() {
		bringElementintoView(driver, selectMenu);
		click(selectMenu, "Select Menu");
		sleep(1000);
		click(dropDown1, "drop down menu 1");
		autocompletewithKeys(driver, dropDown1, "A root option", "dropdown one");
		click(dropDown2, "drop down menu 2");
		autocompletewithKeys(driver, dropDown2, "Ms.", "dropdown one");
		click(dropDown3, "drop down menu 3");
		selectItemFromDropDown(dropDown3, "Indigo", "dropdown one");
		String[] data = { "Blue", "Black", "Red" };
		click(multiSelectdropDown, "drop down Multi select");
		autocompletewithMultipalKeys(driver, multiSelectdropDown, data, "dropdown multi select");
		String[] values = { "Volvo", "Opel", "Audi" };
		click(stdMultiSelectDropDown, "std drop down Multi select");
		selectMultipalItemFromDropDown(driver,stdMultiSelectDropDown, values, "std dropdown std multi select");
	}
	

}
