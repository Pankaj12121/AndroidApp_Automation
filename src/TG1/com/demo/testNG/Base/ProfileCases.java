package TG1.com.demo.testNG.Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProfileCases {

	@BeforeTest(groups = "Vanilla")
	public void beforeTest() {
		System.out.println("Before Test_2 ::Crear the cach, Create object of data");
	}

	@BeforeMethod(groups = "sprint_12")
	public void beforeMethod() {
		System.out.println("Before Method:::launch the browser");
	}

	@Test(groups = {"sprint_12","All"})
	public void BuyStock0011() {
		login();
		viewProfile();
		BuyScript();
	}

	@Test(groups = {"sprint_12","All"})
	public void BuyStock0022() {
		login();
		viewProfile();
		BuyScriptWithLimit();
		BuyScript();
	}

	@Test(groups = {"Vanilla","All"})
	public void BuyStock0033() {
		login();
		viewProfile();
		BuyScriptIntradat();
		BuyScript();
	}

	public void login() {
		System.out.println("Login successful");

	}

	public void viewProfile() {
		System.out.println("profile viewed successful");
	}

	public void BuyScript() {
		System.out.println("successfully buy script");
	}

	public void BuyScriptWithLimit() {
		System.out.println("Limit buy script");
	}

	public void BuyScriptIntradat() {
		System.out.println("Intraday buy script");
	}

}
