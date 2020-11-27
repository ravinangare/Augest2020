import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		System.out.println("Learning all locators in selenium");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		WebElement LocId = driver.findElement(By.id("firstName"));
		
		WebElement LastName = driver.findElement(By.id("lastName"));
		
		WebElement Email = driver.findElement(By.className("mr-sm-2 form-control"));
		
		
		LocId.sendKeys("Ravi");
		LastName.sendKeys("Nangare");
		Email.sendKeys("ravinangre@gmail.com");
		
		//WebElement LocName = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		
		//LocName.click();

	}

}
