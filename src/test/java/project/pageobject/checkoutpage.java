package project.pageobject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {
	WebDriver driver;
	public checkoutpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="input[name='submissionURL']")
    WebElement Submission;
    
    @FindBy(css="input[data-testid='Address_selectShipToThisAddress']")
    WebElement Address;
    
    @FindBy(xpath="//img[@alt='Website is secured with SSL']")
    WebElement Website;
    
    @FindBy(xpath="//span[normalize-space()='Sign Out']")
    WebElement SignOut;
    
    public void ShippingAddress() throws InterruptedException {
         Submission.click();
         Address.click();
         Thread.sleep(2000);
         Website.click();
         Set<String> windows1=driver.getWindowHandles();
         for (String window:windows1)
         {
             driver.switchTo().window(window);
         }
         WebElement raswitha= driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
         Actions action = new Actions(driver);
         action.moveToElement(raswitha).perform();
         SignOut.click();
        
    }
	

}
