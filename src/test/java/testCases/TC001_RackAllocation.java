package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.Kizuna_Dashboard;
import pageObject.RackAllocationPage;
import testBase.BaseClass;


public class TC001_RackAllocation extends BaseClass {
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		Kizuna_Dashboard kd = new Kizuna_Dashboard(driver);
		kd.clickwarehouse();
		
		RackAllocationPage ra = new RackAllocationPage(driver);
		ra.clickRackPage();
		Thread.sleep(3000);
		WebElement drp = ra.getprodunitt();
		Select dropprodunit = new Select(drp);
		dropprodunit.selectByVisibleText("F21 SANAND Plant");
		
		
	}
	
	// hello

}
