package testBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass 
	public void setup() throws InterruptedException
	{
		//setup method is responsible for launching the browser and all
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://uat-kizuna.connectlgm.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("test1@lgm.io");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test1@123");
		driver.findElement(By.xpath("//div[@id='grouped-select']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Agri Division (Sanand Plant)']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	}
	
	@AfterClass
	public void teardown()
	{
		System.out.println("nikhil");
		System.out.println("mahesh");
		driver.quit();
	}
	
	

}
