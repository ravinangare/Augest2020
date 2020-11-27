import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltipDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement tooltipBtn = driver.findElement(By.xpath("//div[contains(@class,'U26fgb')]"));
		
		action.moveToElement(tooltipBtn).perform();
		
		String actualText = tooltipBtn.getAttribute("data-tooltip");
		
		System.out.println(actualText);
	}

}
