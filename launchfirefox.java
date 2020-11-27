import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefox {

	public static void main(String[] args) {
		
		System.out.println("Here we are launching chrome browser");
		
		
		System.setProperty("webdriver.Gecko.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
