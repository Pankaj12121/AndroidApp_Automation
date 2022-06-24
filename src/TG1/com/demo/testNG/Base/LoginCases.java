package TG1.com.demo.testNG.Base;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginCases {
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		System.out.println("Before Suite:::Upload data from excel");
		System.out.println("Before Suite:::Cal launched");
	}
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		System.out.println("After suite::: executed");
	}
	@BeforeTest(groups = "Vanilla")
	public void beforeTest() {
		System.out.println("Before Test_1 ::Crear the cach, Create object of data");
	}
	@BeforeMethod(groups = "Vanilla")
	public void beforeMethod() {
		System.out.println("Before Method:::launch the browser");
	}

	@Test(groups="Regression")
	public void BuyStock001() {
		login();
		viewProfile();
		BuyScript();
	}

	@Test(groups={"Vanilla","All"})
	public void BuyStock002() {
		login();
		viewProfile();
		BuyScriptWithLimit();
		BuyScript();
	}



	@Test(groups={"Regression","All"})
	public void BuyStock003() {
		login();
		viewProfile();
		BuyScriptIntradat();
		BuyScript();
	}

	public void login() {
		System.out.println("Login successful");
		Reporter.log("Login successful");

	}

	public void viewProfile() {
		System.out.println("profile viewed successful");
		Reporter.log("profile viewed successful");
	}

	public void BuyScript() {
		System.out.println("successfully buy script");
		Reporter.log("successfully buy script");
	}

	public void BuyScriptWithLimit() {
		System.out.println("Limit buy script");
		Reporter.log("Limit buy script");
	}

	public void BuyScriptIntradat() {
		System.out.println("Intraday buy script");
		Reporter.log("Intraday buy script");
	}

}
