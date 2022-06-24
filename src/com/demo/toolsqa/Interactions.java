package com.demo.toolsqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import WD6.com.demo.webdriver.implicitExplicitWait.WebPage;

public class Interactions extends WebPage {
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Elements')]")
	WebElement ElementsMenu;
	@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Interactions')]")
	WebElement InteractiojnsMenu;
	@FindBy(xpath = "//span[contains(text(),'Sortable')]")
	WebElement sortableSubMenu;
	@FindBy(xpath = "//div[@class='vertical-list-container mt-4']/div[1]")
	WebElement firstCol;
	@FindBy(xpath = "//div[@class='vertical-list-container mt-4']/div[4]")
	WebElement fourthCol;
	@FindBy(id = "demo-tab-grid")
	WebElement gridTab;
	@FindBy(xpath = "//div[@class='create-grid']/div[1]")
	WebElement gridSquareOne;
	@FindBy(xpath = "//div[@class='create-grid']/div[5]")
	WebElement gridSquarefive;

	@FindBy(xpath = "//ul[@id='verticalListContainer']/li[1]")
	WebElement list1;
	@FindBy(xpath = "//ul[@id='verticalListContainer']/li[2]")
	WebElement list2;
	@FindBy(xpath = "//ul[@id='verticalListContainer']/li[3]")
	WebElement list3;

	@FindBy(xpath = "//div[@id='gridContainer']/div[@id='row1']/li[1]")
	WebElement Glist1;
	@FindBy(xpath = "//div[@id='gridContainer']/div[@id='row2']/li[2]")
	WebElement Glist2;
	@FindBy(xpath = "//div[@id='gridContainer']/div[@id='row3']/li[3]")
	WebElement Glist3;
	@FindBy(xpath = "//span[contains(text(),'Selectable')]")
	WebElement selectableSubMenu;
	@FindBy(xpath = "//div[@id='resizableBoxWithRestriction']/span[@class='react-resizable-handle react-resizable-handle-se']")
	WebElement dragBox1;
	@FindBy(xpath = "//div[@id='resizable']/span[@class='react-resizable-handle react-resizable-handle-se']")
	WebElement dragBox2;

	@FindBy(xpath = "//span[contains(text(),'Resizable')]")
	WebElement Resizable;
	@FindBy(xpath = "//span[contains(text(),'Droppable')]")
	WebElement droppableMenu;
	@FindBy(id = "dragBox")
	WebElement dragboxitem;

	@FindBy(xpath = "//span[contains(text(),'Dragabble')]")
	WebElement DragabbleMenu;
	@FindBy(id = "draggable")
	WebElement draggable;
	@FindBy(id = "droppable")
	WebElement droppable;
	WebDriver driver;
	String url = "https://demoqa.com/elements";

	@Test
	public void handleInteractionsWindow() {

		driver = launchBrowser(url);
		dragListColumns();
		dragGridsquare();
		SelectItemListNGrid();
		dragBoxMethod();
		droppable();
		dragabble();
	}

	public void dragListColumns() {
		click(ElementsMenu, "Element menu");
		sleep(3000);
		bringElementintoView(driver, InteractiojnsMenu);
		click(InteractiojnsMenu, "Interactiojn menu");
		bringElementintoView(driver, sortableSubMenu);
		click(sortableSubMenu, "sortable Sub Menu");
		sleep(1000);
		listItemDraNDrop(driver, firstCol, fourthCol);
	}

	public void dragGridsquare() {
		click(gridTab, "Grid tab");
		listItemDraNDrop(driver, gridSquareOne, gridSquarefive);
	}

	public void SelectItemListNGrid() {
		bringElementintoView(driver, selectableSubMenu);
		click(selectableSubMenu, "selectable  Sub Menu");
		sleep(1000);
		click(list1, "list-1");
		click(list2, "list-2");
		click(list3, "list-3");
		click(gridTab, "Grid tab");
		sleep(1000);
		click(Glist1, "Grid list-1");
		click(Glist2, "Grid list-2");
		bringElementintoView(driver, Glist3);
		click(Glist3, "Grid list-3");

	}

	public void dragBoxMethod() {
		bringElementintoView(driver, Resizable);
		click(Resizable, "Resizable  Sub Menu");
		dragResizable(driver, dragBox1, 100, 30);
		bringElementintoView(driver, dragBox2);
		dragResizable(driver, dragBox2, 100, 300);

	}

	public void droppable() {
		bringElementintoView(driver, droppableMenu);
		click(droppableMenu, "dropable  Sub Menu");
		dragAndDrop(driver, draggable, droppable);
	}

	public void dragabble() {
		bringElementintoView(driver, DragabbleMenu);
		click(DragabbleMenu, "dragable  Sub Menu");
		moveSlider(driver, dragboxitem, 120, 80);
	}
}
