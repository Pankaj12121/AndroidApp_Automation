package com.demo.hybridframework;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import OP3.com.demo.assignments.ReflectionWithKeywords;

public class TestCases {
	
	public static void main(String[] args) throws InvalidFormatException, IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		File file= new File("D:\\DemoFrameworkFiles\\scenarioRepo.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheetAt(0);
		int numberofrows= sheet.getPhysicalNumberOfRows();
		for (int i = 1; i <= numberofrows-1; i++) {
			String testcaseID=sheet.getRow(i).getCell(1).getStringCellValue();
			String executeFlag=sheet.getRow(i).getCell(2).getStringCellValue();
		if(executeFlag.equals("Yes")) {
				Method method= TestCases.class.getMethod(testcaseID, String.class);
				method.invoke(method, "TestCase");
			}
		}
		
		
		
	}

	
	public static  void loginToApp_001(String tc) {
		System.out.println("Test case execution started- loginToApp_001");
	}

	
	public static void loginToApp_002(String tc) {
		System.out.println("Test case execution started- loginToApp_002");
	}

	
	public static void buyStocks_001(String tc) {
		System.out.println("Test case execution started-buyStocks_001");

	}

	
	public static void sellStocks_001(String tc) {
		System.out.println("Test case execution started-sellStocks_001");
	}

	
	public static void checkDematAccount_001(String tc) {
		System.out.println("Test case execution started-checkDematAccount_001");

	}

	
	public static void checkpositions_001(String tc) {
		System.out.println("Test case execution started- checkpositions_001");

	}

}
