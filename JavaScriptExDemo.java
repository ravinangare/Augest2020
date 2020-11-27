import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExDemo {

	public static void main(String[] args) {
		System.out.println("Here we are launching chrome browser");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		WebElement BtnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('Welcome to inspire');"); 
		
		driver.switchTo().alert().dismiss();
		
		js.executeScript("arguments[0].click();", BtnLogin);
		
		driver.switchTo().alert().accept();
		
		String DomainName = js.executeScript("return document.domain;").toString();
		
		System.out.println(DomainName);
		
		String Title = js.executeScript("return document.title;").toString();
		System.out.println(Title);
		
		String url = js.executeScript("return document.URL;").toString();
		
		System.out.println(url);
		
		js.executeScript("window.location = 'https://www.amazon.in/'");
		
		WebElement insta = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[3]/a"));
		js.executeScript("arguments[0].scrollIntoView(true);",insta);
	}

}
