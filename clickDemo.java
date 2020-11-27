import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		WebElement dymnamicClick  = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button"));
		
		action.doubleClick(doubleClickBtn).build().perform();
		
		action.contextClick(rightClickBtn).build().perform();
		
		action.click(dymnamicClick).build().perform();
	}

}
