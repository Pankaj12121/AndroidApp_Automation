package WD14.com.demo.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) {
		ReadExcel re= new ReadExcel();
		re.getCellValue();
	}
	public String getCellValue(){

		String pathOfFile = "C:\\Users\\pankajs\\Desktop\\HDFCL_TestScenarios_USL__v0.1 (002).xlsx";
		String sheetName = null;
		int rowNum;
		int cellNum;
		try{
			File file = new File(pathOfFile);
			InputStream fileInputStream = new FileInputStream(file); 
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "(Integer)\t");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "(String)\t");
						break;
					}
				}
				System.out.println("");
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheetName;
	}



}
