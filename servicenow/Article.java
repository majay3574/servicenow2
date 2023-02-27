package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Article {
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
	
	driver.findElement(By.id("filter")).sendKeys("Articles",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='Articles']")).click();
	
	driver.findElement(By.id("d78ed921ff4221009b20ffffffffffdf")).click();
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("lookup.kb_knowledge.kb_knowledge_base")).click();
	
	Set<String> windowHandle=driver.getWindowHandles();
	List<String>windowHandle1=new ArrayList<String>(windowHandle);
	driver.switchTo().window(windowHandle1.get(1));
	
	driver.findElement(By.linkText("IT")).click();
	
	Set<String> windowHandle2=driver.getWindowHandles();
	List<String>windowHandle12=new ArrayList<String>(windowHandle2);
	driver.switchTo().window(windowHandle12.get(0));
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("kb_knowledge.short_description")).sendKeys("helo there");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
}
}
