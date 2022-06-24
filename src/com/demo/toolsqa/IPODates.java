package com.demo.toolsqa;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class IPODates {
	@FindBy(xpath = "//table[@class='table table-condensed table-bordered table-striped table-nonfluid table-hover']/thead/tr/th")
	List<WebElement> HrowColumns;
	@FindBy(xpath = "//tbody/tr")
	List<WebElement> tableRows;
	@FindBy(xpath = "//h2[text()='Mainboard IPO List 2021 (IPO at BSE & NSE)']")
	WebElement h1;

	String systemDate;
	WebDriver driver;

	@Test
	public void validIPODates() {
		System.setProperty("webdriver.chrome.driver", "D://Grid/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.chittorgarh.com/report/mainboard-ipo-list-in-india-bse-nse/83/");
		HashMap<String, String> ipoToCompare = new HashMap<>();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,YYYY");
		systemDate = sdf.format(date);
		System.out.println(systemDate);
		bringElementintoView(driver, h1);
		int ipoOpenDateColumn = getExpirtDateColumn();
		int ipoCloseDateColumn = getOpenDateColumn();
		int ipoCompanyNameColumn = getissuerCompanyColumn();
		int ipoIssuePriceColumn = getissuerPriceColumn();
		ipoToCompare = getlistedIPO(ipoOpenDateColumn, ipoCompanyNameColumn, ipoIssuePriceColumn, ipoCloseDateColumn);
		System.out.println(ipoToCompare);
		driver.close();
	}

	public HashMap<String, String> getlistedIPO(int datColumn, int companyColumn, int priceColumn, int openIssueDate) {
		HashMap<String, String> ipoValids = new HashMap<>();

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,YYYY");
		String dates = sdf.format(date);
		System.out.println(dates);
		String ipoDate = "";
		String ipoOpenDate = "";
		String company = "";
		String issuePrice = "";
		int sizeRow = tableRows.size();
		for (WebElement row : tableRows) {
			boolean addHmapData = false;
			boolean isOpenData = false;
			List<WebElement> rowColumns = row.findElements(By.tagName("td"));
			int colSize = rowColumns.size();
			int j = 1;
			for (WebElement column : rowColumns) {

				
				if (j == datColumn) {
					ipoDate = column.getText();
					if (!ipoDate.isEmpty()) {
						boolean datecomFlag = compareDates(systemDate, ipoDate);
						addHmapData = datecomFlag;

					}
				}
				if (j == openIssueDate) {
					ipoOpenDate = column.getText();
					if (!ipoOpenDate.isEmpty()) {
						boolean openDateCompareFlag = openDatesCompare(systemDate, ipoOpenDate);
						isOpenData = openDateCompareFlag;
					}
				}
				if (j == companyColumn)
					company = column.getText();
				if (j == priceColumn)
					issuePrice = column.getText();
				if (addHmapData && isOpenData) {
					ipoValids.put(company, issuePrice);

				}
				j++;
			}

		}

		return ipoValids;
	}

	public int getExpirtDateColumn() {
		int i = 0;
		for (WebElement hcolumn : HrowColumns) {
			i++;
			if (hcolumn.getText().equals("Close"))
				break;
		}
		return i;
	}

	public int getOpenDateColumn() {
		int i = 0;
		for (WebElement hcolumn : HrowColumns) {
			i++;
			if (hcolumn.getText().equals("Open"))
				break;
		}
		return i;
	}

	public int getissuerCompanyColumn() {
		int i = 0;
		for (WebElement hcolumn : HrowColumns) {
			i++;
			if (hcolumn.getText().equals("Issuer Company"))
				break;
		}
		return i;
	}

	public int getissuerPriceColumn() {
		int i = 0;
		for (WebElement hcolumn : HrowColumns) {
			i++;
			if (hcolumn.getText().equals("Issue Price (Rs)"))
				break;
		}
		return i;
	}

	public boolean compareDates(String sysDate, String ipoDate) {
		boolean flag = false;
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,YYYY");
			Date systDate = new Date(sysDate);
			Date ipotDate = new Date(ipoDate);

			if (systDate.compareTo(ipotDate) > 0) {
				System.out.println("ipo expired");
			}
			if (systDate.compareTo(ipotDate) < 0) {
				System.out.println("ipo still to expire");
				flag = true;
			}
			if (systDate.compareTo(ipotDate) == 0) {
				System.out.println("today is expiry");
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return flag;

	}

	public boolean openDatesCompare(String sysDate, String ipoDate) {
		boolean flag = false;
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,YYYY");
			Date systDate = new Date(sysDate);
			Date ipotDate = new Date(ipoDate);

			if (ipotDate.compareTo(systDate) > 0) {
				System.out.println("ipo not listed in app");
				flag = false;
			}
			if (ipotDate.compareTo(systDate) < 0) {
				System.out.println("ipo was listed in app");
				flag = true;
			}
			if (ipotDate.compareTo(systDate) == 0) {
				System.out.println("today ipo got listed ");
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return flag;

	}

	public void bringElementintoView(WebDriver driver, WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
