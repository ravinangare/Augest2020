import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		
		System.out.println("Launch Facebook in chrome and login into facebook");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"userid\"]"));
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
		
		username.sendKeys("XA0634");
		
		password.sendKeys("1234567890");
		
		LoginButton.click();
		

	}

}
