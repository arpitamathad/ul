package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenShot {
		
		public static void getPhoto(WebDriver driver,String folder) {
			Date d = new Date();
			String dateTime = d.toString().replaceAll(":","_");
			String path = folder+"/"+dateTime+".png";
			try {
				TakesScreenshot t = (TakesScreenshot)driver;
				File srcFile = t.getScreenshotAs(OutputType.FILE);
				File destFile = new File(path);
				FileUtils.copyFile(srcFile, destFile);			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
