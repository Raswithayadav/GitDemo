package project.pageobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class cartpage {
	WebDriver driver;
	public cartpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//span[@class='a-dropdown-label']")
    WebElement drop;
    
    @FindBy(id="quantity_7")
    WebElement Quantity;
	
    
    @FindBy(xpath="//input[@name='proceedToRetailCheckout']")
    WebElement Checkout;



   public void ShippingCart() throws InterruptedException, IOException {
        Thread.sleep(4000);
        drop.click();
        Quantity.click();
        Properties pro=new Properties();
		FileInputStream files = new FileInputStream("C:\\Users\\chunchu.raswitha\\eclipse-workspace\\Demoproject\\src\\project\\property.file");
		pro.load(files);
		String quan =pro.getProperty("quantity");
		//Select se =new Select (driver.findElement(By.id("quantity")));
		//se.selectByValue("quan");
        Checkout.click();
       
       
   }
}
	
	
		


