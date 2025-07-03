package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RackAllocationPage extends BasePage {
	
	public RackAllocationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Rack Allocation']")
	WebElement lnkrackpage;
	
	@FindBy (xpath = "//input[@id='production_unit']")
	WebElement dpprodunit;
	
	@FindBy (xpath = "//input[@id='warehouse_id']")
	WebElement dpwarehouse;
	
	@FindBy (xpath = "//input[@id='item_code']")
	WebElement dpitemcode;
	
	@FindBy (xpath = "//input[@id='item_code']")
	WebElement dploc;
	
	@FindBy (xpath = "//input[@id=':rd:']")
	WebElement dpzone;
	
	@FindBy (xpath = "//input[@id=':rf:']")
	WebElement dpsubzone;
	
	public void clickRackPage()
	{
		lnkrackpage.click();
	}
	
	public WebElement getprodunitt()
	{
		return dpprodunit;
	}
	
	public WebElement getwarehouseDropdown()
	{
		return dpwarehouse;
	}
	

}
