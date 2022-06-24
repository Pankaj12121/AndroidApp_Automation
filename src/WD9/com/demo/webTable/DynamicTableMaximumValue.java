package WD9.com.demo.webTable;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.NumberFormat;


public class DynamicTableMaximumValue {
	
	@FindBy(xpath = ".//*[@id='leftcontainer']/table/thead/tr/th")
	static
	List<WebElement> tableColumns;

	@FindBy(xpath = ".//*[@id='leftcontainer']/table/tbody/tr/td[1]")
	static
	List<WebElement> tableRows;

	
	
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
		System.setProperty("webdriver.chrome.driver","E:\\Grid\\chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
		 PageFactory.initElements(wd, new DynamicTableMaximumValue());
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List col =tableColumns;
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List  rows = tableRows;
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int i =1;i<rows.size();i++)
	        {    
	            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	            NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
    }
}
