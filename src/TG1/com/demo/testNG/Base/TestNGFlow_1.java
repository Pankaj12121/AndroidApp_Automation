package TG1.com.demo.testNG.Base;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGFlow_1 {
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Fetch testcase data from the DB");
		Reporter.log(" Before Method will execute before every test method");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("close excel connections");
		System.out.println("After Method will execute after every test method ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Clean Browser Cache");
		System.out.println("Before Class will always execute prior to Before Method and Test Method ");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Report generation");
		System.out.println("After Class will always execute later to After Method and Test method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Launch Web Driver");
		System.out.println("Before Test will always execute prior to Before Class, ,Before Method and Test Method ");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Kill the driver instances.");
		System.out.println("After Test will always execute later to After Method, After Class ");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Create DB connection");
		System.out.println("Before Suite will always execute prior to all annotations or tests in the suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Close the DB connections");
		System.out.println("After suite will always execute at last when all the annotations or test in the suite have run.");
	}
	@Test(dataProvider="Authentication",priority =2)
	public void testCase1(String sUsername, String sPassword) {
		Reporter.log(sUsername+","+ sPassword);
		Reporter.log("This is my First Test Case 1");
	}
	@Test(priority =1)
	public void testCase2() {
		int c= 10/0;
		System.out.println("This is my Second Test Case 2");
	}
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		System.out.println("The data provider call is always first");
		
		return new Object[][] { { "Admin", "admin@123" }, { "Admin", "admin" }};

	}

}



