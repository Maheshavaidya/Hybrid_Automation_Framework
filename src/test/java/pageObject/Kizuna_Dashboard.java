package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Kizuna_Dashboard extends BasePage {
	
	public Kizuna_Dashboard(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath = "//span[normalize-space()='Warehouse Management']")
	WebElement lnkwarehousemanagement;
	
	
	
	public void clickwarehouse()
	{
		lnkwarehousemanagement.click();
	}
	
	
	

}
