package project.pageobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import amazon.abstractcomponents.abstractcomponents;

public class productcateloguepage  {
	
	
	
	WebDriver driver;
	public productcateloguepage (WebDriver driver)
	{
		//super(driver);
		//intialization
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
    WebElement Searchbar;
    
    @FindBy(xpath="//input[@id='twotabsearchtextbox']")
    WebElement ProductName;
    
    @FindBy(xpath="//input[@id='nav-search-submit-button']")
    WebElement SearchBtn;
    
    @FindBy(xpath="//img[@alt='Puma Mens Shuffle One8 V2 Better Sneaker']")
    WebElement Prod;
        
    @FindBy(id="native_dropdown_selected_size_name")
    WebElement Size;
    
    @FindBy(xpath="//img[@alt='Puma Black-Puma Team Gold']")
    WebElement Black;
    
    @FindBy(css="input[value='Add to Cart']")
    WebElement Cart;
    
    @FindBy(xpath="//span[@id='nav-cart-count']")
    WebElement GoToCart;
    
    public void ProductSearch() throws InterruptedException, IOException {
    	
		
        Searchbar.click();
        ProductName.sendKeys("Puma Mens Shuffle One8 V2 Better Sneaker");
        SearchBtn.click();
        Prod.click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        Properties pro=new Properties();
        Size.click();
		FileInputStream files = new FileInputStream("C:\\Users\\chunchu.raswitha\\eclipse-workspace\\Demoproject\\src\\project\\property.file");
		pro.load(files);
		String size =pro.getProperty("s");
       
		//Select se =new Select (driver.findElement(By.id("native_dropdown_selected_size_name")));
		//se.selectByValue(size);
       // Size.click();
      WebElement staticDropdown = driver.findElement(By.id("native_dropdown_selected_size_name"));
       Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(" 11 UK ");
        Black.click();
        Thread.sleep(2000);
       // waitforElementToAppear(By.xpath("input[value='Add to Cart']"));
        Cart.click();
        GoToCart.click();



      
	
		
		 
		
       
        
	}


}
	


