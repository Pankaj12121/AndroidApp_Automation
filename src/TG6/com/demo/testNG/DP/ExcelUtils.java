package TG6.com.demo.testNG.DP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	ExcelUtils excelUtils;
	int CR=0;
	int CC=0;
	//Object[][] tabArray;
	Object[][]tabArray= new Object [CR][CC];
	
	
	
	
	//This method is to set the File path and to open the Excel file, Pass Excel Path and SheetName as Arguments to this method
	public static void setExcelFile(String Path,String SheetName) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e){
			throw (e);
		}
	}
	public  Object[][] getTableArray(String FilePath, String SheetName) throws Exception{
	excelUtils = new ExcelUtils();
	
		
		try{
			FileInputStream ExcelFile = new FileInputStream(FilePath);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int numOfRows=ExcelWSheet.getPhysicalNumberOfRows();
			
			//int rowNumbers=Row.getRowNum();
			//int startCol = rowNumbers;
			
			//int totalRows =1; //ExcelWSheet.getPhysicalNumberOfRows();
			
			//tabArray=new String[ci][cj];
			for (int i= 1;i<=numOfRows-1;i++){
				XSSFRow currentRow=ExcelWSheet.getRow(i);
				int totalCols = currentRow.getPhysicalNumberOfCells();
				String TCID= currentRow.getCell(0).toString();
				if (i==1)
				tabArray= new Object [numOfRows][totalCols];
				for (int j=0;j<=totalCols-1;j++)
				{
					
					tabArray[i-1][j]=getCellData(i,j);
					
					//System.out.println(tabArray[ci][cj]);

					
				}
			
			}
			System.out.println(tabArray);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		return(tabArray);
	}
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	public String getCellData(int rownum,int ColNum) throws Exception{
		try{
			Cell = ExcelWSheet.getRow(rownum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		}catch (Exception e){
			return"";
		}
	}
	public static String getTestCaseName(String sTestCase)throws Exception{
		String value = sTestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
		}catch (Exception e){
			throw (e);
		}
	}
	public  int getRowContains(String sTestCaseName, int colNum) throws Exception{
		int i;
		try {
			int rowCount = ExcelUtils.getRowUsed();
			for ( i=0 ; i<rowCount; i++){
				if  (excelUtils.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){
					System.out.println("The test case "+sTestCaseName+" present in the excel sheet");
					break;
				}
			}
			return i;
		}catch (Exception e){
			System.out.println("The test case "+sTestCaseName+" not present in the excel sheet");
			throw(e);
		}
	}
	public static int getRowUsed() throws Exception {
		try{
			int RowCount = ExcelWSheet.getLastRowNum();
			return RowCount;
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw (e);
		}
	}
}


