package amazon.abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractcomponents {
	WebDriver driver;
	public abstractcomponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	  
	  
	
	    
	
	
	

}
