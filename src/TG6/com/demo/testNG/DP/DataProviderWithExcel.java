package TG6.com.demo.testNG.DP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	private String sTestCaseName;
	WebElement userName;
	WebElement password;
	WebElement submit;
	String Uname;
	String Pass;
	private int iTestCaseRow;
	WebDriver driver;
	Properties configProp;
	FileInputStream configInput;
	ExcelUtils excelUtils = new ExcelUtils();
	public Properties getConfigProperties() throws FileNotFoundException, IOException {
		if (configProp==null) {
			configProp = new Properties();
			configInput = new FileInputStream("config.properties");
			configProp.load(configInput);
		}
		return configProp;
	}
	@BeforeMethod
	public void beforeMethod() throws Exception {
		System.setProperty("webdriver.gecko.driver","\\Grid\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = configProp.getProperty("ApplicationURL");
		driver.get(baseUrl);
		System.out.println("Before Method launched browser");
	}	
	@Test(dataProvider = "TC001DP",groups={"TestNG","demo","TC008","dataProviderWithExcel"})
	public void f(String...obj) {
		userName= driver.findElement(By.id("txtUsername"));//By id 
		password= driver.findElement(By.name("txtPassword"));//By name 
		submit= driver.findElement(By.className("button"));//By name 
		userName.sendKeys(obj[1]);
		System.out.println("Entered userName is "+ obj[1]);
		password.sendKeys(obj[2]);
		System.out.println("Entered password is "+ obj[2]);
		submit.click();
		System.out.println("Clicked on submit button");
		String actualTitle = "";
		actualTitle = driver.getTitle();
		if (actualTitle.contains(obj[3])){
			System.out.println(sTestCaseName +" Test Passed!");
		} else {
			System.out.println(sTestCaseName+"  Test Failed");
		}
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("After Method closed browser");
	}
	@DataProvider
	public Object[][] TC001DP() throws Exception{
		getConfigProperties();
		// Setting up the Test Data Excel file
		//ExcelUtils.setExcelFile("C:\\Users\\pankajs\\Desktop\\TestData.xlsx","Sheet1");
		//sTestCaseName = configProp.getProperty("TCID");
		//iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		Object[][] testObjArray = excelUtils.getTableArray("E:\\TestData.xlsx","Sheet1");
		System.out.println("Data provider fetched the data from excel for testCase "+ sTestCaseName);
		return testObjArray;
	}
}

