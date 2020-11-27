import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.out.println("Here we are launching chrome browser");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
		//WebElement username = driver.findElement(By.name("email"));
		
		//WebElement password = driver.findElement(By.name("pass"));
		
		//username.sendKeys("ravinangare@gmail.com");
		
	//	password.sendKeys("1234567890");
	//	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ravinangare@gmail.com");
		
	//	WebElement nextbutton = driver.findElement(By.className("VfPpkd-RLmnJb"));
		
	//	nextbutton.click();
		
		
	//	driver.findElement(By.linkText("Learn more")).click();
		
	//	driver.findElement(By.partialLinkText("Learn")).click();
		
	//	WebElement LinkLearn = driver.findElement(By.partialLinkText("Learn mo"));
		
	//	LinkLearn.click();
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()",nextbutton );
		
		//driver.close();
		
	//	List<WebElement> Tagnames = driver.findElements(By.tagName("input"));
		
	//	System.out.println(Tagnames.size());
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("ravinangare@gmail.com");
		WebElement nextbutton =   driver.findElement(By.cssSelector(".VfPpkd-vQzf8d"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",nextbutton );
			
	}

}
