import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitsdemo {
	WebDriver driver;
	@Test
	public void performance() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		
		driver.get("https://mail.yahoo.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
		// implicit wait
		
	//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	//	WebDriverWait wait=new WebDriverWait(driver, 5);
		@Test
		public void performance1() throws InterruptedException
		{
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		//Thread.sleep(3000);
	 //   WebElement username = 	driver.findElement(By.xpath("//input[@id='login-username']"));
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(5, TimeUnit.SECONDS) 			
				.pollingEvery(1, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
	    WebElement sendData = wait.until(new Function<WebDriver, WebElement>(){
	    	
			public WebElement apply(WebDriver driver ) {
				 return driver.findElement(By.xpath("//input[@id='login-username']"));
			}
	    });
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-username']"))).sendKeys("ravinangre");
	
	    sendData.sendKeys("ravinangre");
	    
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		}
	}
