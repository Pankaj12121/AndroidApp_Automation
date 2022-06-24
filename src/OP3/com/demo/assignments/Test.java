package OP3.com.demo.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.ewizsaas.com/Customer/Register");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);



		driver.findElement(By.id("IndividualDetailsCompanyName")).sendKeys("powerweave");
		driver.findElement(By.id("IndividualDetailsCompanyWebsite")).sendKeys("www.powerweave.com");
		//		
		//		driver.findElement(By.linkText("Login")).click();
		//		Thread.sleep(4000);
		//		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
		//		Thread.sleep(3000);
		driver.findElement(By.id("IndividualDetailsFirstName")).sendKeys("abc");
		driver.findElement(By.id("IndividualDetailsLastName")).sendKeys("tester");
		//part1
		driver.findElement(By.id("IndividualDetailsEmailAddress")).sendKeys("testfirst@teseetetetr.com");
		driver.findElement(By.id("IndividualDetailsPhone")).sendKeys("1234567890");

		driver.findElement(By.id("IndividualDetailsAddress1")).sendKeys("test address");
		driver.findElement(By.id("IndividualDetailsCity")).sendKeys("new york");

		Select state = new Select (driver.findElement(By.id("IndividualDetailsState")));
		state.selectByVisibleText("Alaska");

		Select country = new Select (driver.findElement(By.id("IndividualDetailsCountryGUID")));
		country.selectByVisibleText("United States");

		driver.findElement(By.id("IndividualDetailsZip")).sendKeys("500005");
		//part2
		driver.findElement(By.id("IndividualDetailsCommunicationAddress1")).sendKeys("test address");
		driver.findElement(By.id("IndividualDetailsCommunicationCity")).sendKeys("new york");

		Select state1 = new Select (driver.findElement(By.id("IndividualDetailsCommunicationState")));
		state1.selectByVisibleText("Alaska");

		Select country1 = new Select (driver.findElement(By.id("IndividualDetailsCommunicationCountry")));
		country1.selectByVisibleText("United States");

		driver.findElement(By.id("IndividualDetailsCommunicationZip")).sendKeys("500005");
		driver.findElement(By.id("IndividualShipping")).click();

		driver.findElement(By.id("IndividualDetailsASI")).sendKeys("testasi");
		/*driver.findElement(By.className("input-group-prepend")).sendKeys("1");
		driver.findElement(By.id("IndividualDetailsASI")).sendKeys(Keys.TAB);
		driver.findElement(By.name("first")).click();;*/
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"4e734fa0-f8ba-e24a-dae3-919e79f69be1\"]/div/div[2]/div[2]/label")).click();
		//driver.findElement(By.xpath("//*[@id=\"4e734fa0-f8ba-e24a-dae3-919e79f69be1\"]/div/div[2]/div[1]/label")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='form-group input-createAction']//@id='btnSubmit'"));
		ele.click();
		//
		//tula send karto mi mail vr
		//
		//
		//sachin.tatkare1984@gmail.com
		//
		//
		//
		//
		//driver.findElement(By.xpath("//*[@id=\"IndividualDetailsCity\"]")).sendKeys("New York");
		//
		//Select state2 = new Select (driver.findElement(By.id("IndividualDetailsState")));
		//state2.selectByVisibleText("Alaska");
		//
		//Select country2 = new Select (driver.findElement(By.id("IndividualDetailsCountryGUID")));
		//country2.selectByVisibleText("United States");
		//
		//driver.findElement(By.id("IndividualDetailsZip")).sendKeys("500005");
		//
		//driver.findElement(By.xpath("//*[@id=\"IndividualDetailsCommunicationAddress1\"]")).sendKeys("testaddress");
		//
		//driver.findElement(By.xpath("//*[@id=\"IndividualDetailsCommunicationAddress2\"]")).sendKeys("testaddress");
		//
		//driver.findElement(By.xpath("//*[@id=\"IndividualDetailsAddress1\"]")).sendKeys("testaddress");
		//
		//driver.findElement(By.xpath("//*[@id=\"IndividualDetailsCommunicationCity\"]")).sendKeys("New York");
		//
		//Select stateComm = new Select (driver.findElement(By.xpath("//*[@id=\"IndividualDetailsCommunicationState\"]")));
		//stateComm.selectByVisibleText("Alaska");
		//
		//Select countryComm = new Select (driver.findElement(By.xpath("//*[@id=\"IndividualDetailsCommunicationCountry\"]")));
		//countryComm.selectByVisibleText("United States");
		//
		//
		//driver.findElement(By.xpath("//*[@id=\"IndividualDetailsCommunicationZip\"]")).sendKeys("500006");
		//
		//
		//driver.findElement(By.xpath("//*[@id=\"IndividualShipping\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"IndividualDetailsASI\"]")).sendKeys("testasi");
		//
		//Thread.sleep(3000);
		////WebElement CREATEBtn = driver.findElement(By.linkText("CREATE"));
		////
		////Actions action = new Actions(driver);
		////action.moveToElement(CREATEBtn).click().build().perform();
		//
		////driver.findElement(By.linkText("CREATE")).click();
		//WebElement ele1 = driver.findElement(By.id("btnSubmit"));
		//JavascriptExecutor jsl = ((JavascriptExecutor)driver);
		//jsl.executeScript("arguments[0].click();", ele1);
		//
		////driver.findElement(By.id("btnSubmit")).click();
		//
		////driver.findElements(By.className("btn-primary")).get(1).click();
		//	
	}

}


