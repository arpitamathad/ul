package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetXLData {

	public static String getXLData(String path,int r,int c) {
		String v = " ";
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			v = w.getSheet("sheet1").getRow(r).getCell(c).toString();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return v;
	}
}
