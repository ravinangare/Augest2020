import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActionDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement username = driver.findElement(By.id("userName"));
		WebElement useremail = driver.findElement(By.id("userEmail"));
		WebElement CuurentAddress = driver.findElement(By.id("currentAddress"));
		WebElement PermenantAddress = driver.findElement(By.id("permanentAddress"));
		
		username.sendKeys("Mr.Peter Haynes");
		useremail.sendKeys("PeterHaynes@toolsqa.com");
		CuurentAddress.sendKeys("43 School Lane London EC71 9GO");
		
		action.keyDown(Keys.CONTROL).sendKeys("a");
		action.keyUp(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("c");
		action.keyUp(Keys.CONTROL).build().perform();
		
		action.sendKeys(Keys.TAB).build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("v");
		action.keyUp(Keys.CONTROL).build().perform();
		
		assertEquals(CuurentAddress.getAttribute("value"), PermenantAddress.getAttribute("value"));
		
	}

}
