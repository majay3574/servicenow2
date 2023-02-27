package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowSecond {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev140572.service-now.com\r\n");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("filter")).sendKeys("My Service Categories",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='My Service Categories']")).click();
		driver.switchTo().defaultContent();
		

		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_new")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[text()='Group']")).click();
		
		driver.findElement(By.id("lookup.IO:aefb68015f212100a9ad2572f2b47702")).click();
		
		Set<String> windowHandle2=driver.getWindowHandles();
		List<String>windowHandle12=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle12.get(1));
		
		driver.findElement(By.linkText("App Engine Admins")).click();
		
		Set<String> windowHandle21=driver.getWindowHandles();
		List<String>windowHandle22=new ArrayList<String>(windowHandle21);
		driver.switchTo().window(windowHandle22.get(0));
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("submit_button")).click();
		
		
	}

}
