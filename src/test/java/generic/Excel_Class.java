package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel_Class implements Project_Constants{
	
	
	public static String getcellvalue(String sheet,int row,int cell)
	{
		String value="";
		try {
			FileInputStream fis=new FileInputStream(excel_path);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			
			value = c.toString();
			
		} catch (Exception e) {
		
			Reporter.log("Path is invalid",true);
		}
		
		
		return value;
		
	}

}
