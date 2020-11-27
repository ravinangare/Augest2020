import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		System.out.println("Here we are launching chrome browser");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\Oct-2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		String MainWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
	    while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                     	
            }		
        }
	    
	    driver.switchTo().window(MainWindow);
	    
	    driver.quit();
	}

}
