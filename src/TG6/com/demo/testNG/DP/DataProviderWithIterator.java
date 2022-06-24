package TG6.com.demo.testNG.DP;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithIterator {
	WebElement userName;
	WebElement password;
	WebElement submit;
	String tcID;
	String Uname;
	String Pass;
	String title;
	String Desc;

	@Test(dataProvider = "DataInput", groups = { "TestNG", "demo", "TC009", "dataProviderWithIterator" })
	public void login(Object[][] obj) throws InterruptedException {

		ArrayList<Object[]> testData = new ArrayList<Object[]>(Arrays.asList(obj));
		Object[] unitData = testData.get(0);
		tcID = unitData[0].toString();
		Desc = unitData[1].toString();
		Uname = unitData[2].toString();
		Pass = unitData[3].toString();
		title = unitData[4].toString();
		/*
		 * for(Object[] data:testData){ Uname=data[0].toString();
		 * Pass=data[1].toString(); }
		 */
		System.setProperty("webdriver.gecko.driver", "\\Grid\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://opensource-demo.orangehrmlive.com/";
		driver.get(baseUrl);
		userName = driver.findElement(By.id("txtUsername"));// By id
		password = driver.findElement(By.name("txtPassword"));// By name
		submit = driver.findElement(By.className("button"));// By name

		userName.sendKeys(Uname);
		password.sendKeys(Pass);
		submit.click();
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals("")) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

	@DataProvider(name = "DataInput")
	public Iterator<Object[][]> fetchData() throws IOException {
		ArrayList<Object[][]> myData = new ArrayList<Object[][]>();
		FileInputStream fis = new FileInputStream("E:\\TestDataDP.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int numOfRows = sh.getPhysicalNumberOfRows();
		String testCaseID, testCaseDisc, userName, pass, expTitle;
		for (int i = 1; i < numOfRows; i++) {
			testCaseID = sh.getRow(i).getCell(0).getStringCellValue();
			testCaseDisc = sh.getRow(i).getCell(1).getStringCellValue();
			userName = sh.getRow(i).getCell(2).getStringCellValue();
			pass = sh.getRow(i).getCell(3).getStringCellValue();
			expTitle = sh.getRow(i).getCell(4).getStringCellValue();
			myData.add(new Object[][] { { testCaseID, testCaseDisc, userName, pass, expTitle } });
		}

		return myData.iterator();
	}
}
