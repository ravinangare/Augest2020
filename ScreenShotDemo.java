import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		TakesScreenshot scrShot = (TakesScreenshot)driver;
		
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	
		FileUtils.copyFile(scrFile,new File ("./ScreenShot_Folder/"+timestamp+ ".jpeg"));
		
		driver.close();
	}
}
