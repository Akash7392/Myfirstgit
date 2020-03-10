package company.com.crm.utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils_all {
	
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static DataFormatter Formatter;
	
	public void Setexcelfilepath() throws IOException
	
	{
		wb= new XSSFWorkbook("D:\\Eclipse\\eclipse-workspace\\crm\\Exel file\\crminput.xlsx");
		sh = wb.getSheet("Sheet1");
	}
	
	public String passingcellvalue(int rval, int cval)
	
	{
		Formatter = new  DataFormatter();
		Cell cvalue= sh.getRow(rval).getCell(cval);
		String f_cell_value = Formatter.formatCellValue(cvalue);
		return f_cell_value;
   }
}
