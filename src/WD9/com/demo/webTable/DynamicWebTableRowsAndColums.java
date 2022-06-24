package WD9.com.demo.webTable;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableRowsAndColums {
	
	
	
	    public static void main(String[] args) throws ParseException {
	    	WebDriver wd;
		  System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		  wd= new ChromeDriver();
	        wd.get("http://money.rediff.com/gainers/bsc/dailygroupa?");         
	        //No.of Columns
	        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        wd.close();
	    }
	}


