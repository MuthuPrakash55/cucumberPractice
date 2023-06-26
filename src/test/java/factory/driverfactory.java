package factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverfactory {
	public static  WebDriver driver;
	
	public static void intializebrowser(String browser) {
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
			break;
		}
		}
	public static WebDriver getdriver() {
		return driver;
	}
	public static String getxpath(String fieldname) throws Exception {
		File file=new File("./src/test/resources/datasheet.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sh=wb.getSheet("sheet1");
		DataFormatter df=new DataFormatter();
		
		
		for(int i=1;i<=sh.getLastRowNum();i++) {
			if(fieldname.equals(df.formatCellValue(sh.getRow(i).getCell(0)))) {
				return df.formatCellValue(sh.getRow(i).getCell(1));
			}
		}
		return null;
	}
		
		public static String getdata(String fieldname) throws Exception {
			File file=new File("./src/test/resources/datasheet.xlsx");
			FileInputStream stream=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(stream);
			XSSFSheet sh=wb.getSheet("sheet1");
			DataFormatter df=new DataFormatter();
			
			
			for(int i=1;i<=sh.getLastRowNum();i++) {
				if(fieldname.equals(df.formatCellValue(sh.getRow(i).getCell(0)))) {
					return df.formatCellValue(sh.getRow(i).getCell(2));
				}
			}
			return null;
	}
}
