import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.amazon.in");
		driver.get("https://www.travelyaari.com/");
		driver.manage().window().maximize();
		
	//	Select select = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		
		//select.selectByVisibleText("Baby");
		//select.selectByIndex(7);
	//	select.selectByValue("search-alias=baby");
		
		driver.findElement(By.xpath("//div[@class='manageDrop']")).click();
		
		driver.findElement(By.linkText("Print")).click();
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Print')]")).click();
	}

}
