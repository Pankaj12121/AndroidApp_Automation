package com.demo.trivials;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import WD6.com.demo.webdriver.implicitExplicitWait.ImplicitAndExplicit;

public class ReadExcelDemo {
	public static HashMap<String, String> data;

	
	public static void main(String[] args) {
		data = new HashMap<String, String>();
		try {
			FileInputStream file = new FileInputStream(new File("E://demo.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();

			int rowI = 0;
			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				String[] cellData = new String[2];
				int i = 0;
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();
					// Check the cell type and format accordingly
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue());
						System.out.print(" ");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue());
						if (rowI != 0) {
							if (i == 0)
								cellData[0] = cell.getStringCellValue().toString();
							else
								cellData[1] = cell.getStringCellValue().toString();
							i++;
						}
						break;
					}
				}
				if (rowI != 0)
					data.put(cellData[0], cellData[1]);
				System.out.println("");
				rowI++;
			}
			file.close();
			workbook.close();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ddt();
	}

	public static void ddt() {
    	ImplicitAndExplicit obj= new ImplicitAndExplicit();
    	obj.launchDriver();
    	for(Map.Entry<String, String>ddtData:data.entrySet()) {
    		String uName=ddtData.getKey();
    		String pass=ddtData.getValue();
    	obj.loginToHRM(uName, pass);
    	}
    	
    }
	
}
