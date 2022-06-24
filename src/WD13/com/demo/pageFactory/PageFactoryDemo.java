 package WD13.com.demo.pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageFactoryDemo {

	String TestNGReportPath = "E://Grid//TestRunReport";
	public WebDriver driver;

	public PageFactoryDemo() {
	}

	/*
	 * public PageFactoryDemo(WebDriver driver) {
	 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 * PageFactory.initElements(driver, this); this.driver=driver; }
	 */
	/*-------Login elements---------------------------*/
	@FindBy(id = "txtUsername")
	WebElement userName;
	@FindBy(name = "txtPassword")
	WebElement password;
	@FindBy(className = "button")
	WebElement loginBtn;

	/*-------Level1 menu item---------------------------*/
	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']/b")
	WebElement adminMenu;

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']/b")
	WebElement pim;

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;

	@FindBy(xpath = "//a[@id='menu_time_viewTimeModule']/b")
	WebElement time;

	@FindBy(xpath = "//a[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement recruitment;

	@FindBy(xpath = "//a[@id='menu__Performance']/b")
	WebElement performance;

	@FindBy(xpath = "//a[@id='menu_dashboard_index']/b")
	WebElement dashboard;

	@FindBy(xpath = "//a[@id='menu_directory_viewDirectory']/b")
	WebElement directory;

	/*-------Level 2 menu item---------------------------*/

	@FindBy(linkText = "User Management")
	WebElement userMgmt;
	@FindBy(linkText = "Job")
	WebElement job;
	@FindBy(linkText = "Organization")
	WebElement organization;
	@FindBy(linkText = "Qualifications")
	WebElement qualifications;
	@FindBy(linkText = "Nationalities")
	WebElement nationalities;
	@FindBy(linkText = "Configuration")
	WebElement configuration;
	@FindBy(linkText = "menu_pim_Configuration")
	WebElement PIMconfigurations;
	@FindBy(linkText = "Employee List")
	WebElement employeeList;
	@FindBy(linkText = "Add Employee")
	WebElement AddEmployee;
	@FindBy(linkText = "Reports")
	WebElement reports;
	@FindBy(linkText = "Entitlements")
	WebElement entitlements;
	@FindBy(linkText = "menu_leave_Reports")
	WebElement reportsleave;
	@FindBy(linkText = "Configure")
	WebElement configure;
	@FindBy(linkText = "Leave List")
	WebElement leavelist;
	@FindBy(linkText = "Assign Leave")
	WebElement assignleave;
	@FindBy(linkText = "Timesheets")
	WebElement Timesheet;
	@FindBy(linkText = "Attendance")
	WebElement attendance;
	@FindBy(linkText = "menu_time_Reports")
	WebElement timeReports;
	@FindBy(linkText = "Project Info")
	WebElement projectinfo;
	@FindBy(linkText = "Candidates")
	WebElement candidates;
	@FindBy(linkText = "Vacancies")
	WebElement vacancies;

	/*-------Level 3 menu item---------------------------*/

	@FindBy(linkText = "Users")
	WebElement users;
	@FindBy(xpath = "//a[contains(text(),'Job Titles')]")
	WebElement jobTitles;
	@FindBy(xpath = "//a[contains(text(),'Pay Grades')]")
	WebElement payGrades;
	@FindBy(xpath = "//a[contains(text(),'Employee Status')]")
	WebElement employmentStatus;
	@FindBy(xpath = "//a[contains(text(),'Job Categories')]")
	WebElement jobCategory;
	@FindBy(xpath = "//a[contains(text(),'Work Shifts')]")
	WebElement workShifts;
	@FindBy(xpath = "//a[contains(text(),'General Information')]")
	WebElement generalInformation;
	@FindBy(xpath = "//a[contains(text(),'Locations)]")
	WebElement locations;
	@FindBy(xpath = "//a[contains(text(),'Structure')]")
	WebElement structures;
	@FindBy(xpath = "//a[contains(text(),'Skills')]")
	WebElement skill;
	@FindBy(xpath = "//a[contains(text(),'Education')]")
	WebElement education;
	@FindBy(xpath = "//a[contains(text(),'Licenses')]")
	WebElement licenses;
	@FindBy(xpath = "//a[contains(text(),'Languages')]")
	WebElement languages;
	@FindBy(xpath = "//a[contains(text(),'Memberships')]")
	WebElement memberships;
	@FindBy(xpath = "//a[contains(text(),'Email Configuration')]")
	WebElement emailConfigurations;
	@FindBy(xpath = "//a[contains(text(),'Email Subscriptions')]")
	WebElement emailSubscriptions;
	@FindBy(xpath = "//a[contains(text(),'Localization')]")
	WebElement localization;
	@FindBy(xpath = "//a[contains(text(),'Modules')]")
	WebElement modules;
	@FindBy(xpath = "//a[contains(text(),'Social Media Authentication')]")
	WebElement socialMediaAuthentication;
	@FindBy(xpath = "//a[contains(text(),'Optional Fields')]")
	WebElement optionalFields;
	@FindBy(xpath = "//a[contains(text(),'Custom Fields')]")
	WebElement customFields;
	@FindBy(xpath = "//a[contains(text(),'Data Import')]")
	WebElement dataImporting;
	@FindBy(xpath = "//a[contains(text(),'Reporting Methods')]")
	WebElement reportingMethods;
	@FindBy(xpath = "//a[contains(text(),'Termination Reasons')]")
	WebElement terminationReasons;
	@FindBy(xpath = "//a[contains(text(),'Add Entitlements')]")
	WebElement addEntitlements;
	@FindBy(xpath = "//a[contains(text(),'Employee Entitlements')]")
	WebElement employeeEntitlements;
	@FindBy(xpath = "//a[contains(text(),'Leave Entitlements And Usage Report')]")
	WebElement leaveEntitlementsAndUsageReport;
	@FindBy(xpath = "//a[contains(text(),'Leave Period')]")
	WebElement leavePeriod;
	@FindBy(xpath = "//a[contains(text(),'Leave Types')]")
	WebElement leaveType;
	@FindBy(xpath = "//a[contains(text(),'Work Week')]")
	WebElement workWeek;
	@FindBy(xpath = "//a[contains(text(),'Holidays')]")
	WebElement Holidays;
	@FindBy(xpath = "//a[contains(text(),'Employee Timesheets')]")
	WebElement employeeTimessheet;
	@FindBy(xpath = "//a[contains(text(),'Employee Records')]")
	WebElement employeeRecords;
	@FindBy(id = "id=menu_attendance_configure")
	WebElement configurationTimesheet;
	@FindBy(xpath = "//a[contains(text(),'Employee Reports')]")
	WebElement employeeReports;
	@FindBy(xpath = "//a[contains(text(),'Attendance Summary')]")
	WebElement attendanceSummary;
	@FindBy(xpath = "//a[contains(text(),'Customers')]")
	WebElement customers;
	@FindBy(xpath = "//a[contains(text(),'Projects')]")
	WebElement projects;

	@Test(groups = "job-1")
	public void sample() {
		PageFactory.initElements(driver, this);
		login();

		PageFactory.initElements(driver, this);
		try {
			actionClick(adminMenu, userMgmt, users, driver);

			actionClick(pim, leave, workWeek, driver);
			actionClick(time, Timesheet, employeeTimessheet, driver);
			actionClick(time, projects, projectinfo, driver);
			actionClick(adminMenu, configuration, modules, driver);
			// dPOM.actionClick(time,reports,projectReports);
			actionClick(pim, leave, Holidays, driver);
			actionClick(adminMenu, qualifications, education, driver);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionClick(WebElement Level1, WebElement Level2, WebElement Level3, WebDriver driver)
			throws InterruptedException {
		Actions builder = new Actions(driver);
		builder.moveToElement(Level1).perform();
		builder.moveToElement(Level2).perform();
		builder.click(Level3).perform();
		// builder.build().perform();
		System.out.println("Mouseover and click successful on menu " + Level3.toString());

	}

	public void login() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginBtn.click();
	}

	@AfterTest
	public void driverclose() {
		if (driver != null)
			driver.close();
	}
	@BeforeTest(groups = "job-1")
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@BeforeSuite(alwaysRun = true)
	public void setup(ITestContext ctx) {
		TestRunner runner = (TestRunner) ctx;

		runner.setOutputDirectory(TestNGReportPath);
	}
}
