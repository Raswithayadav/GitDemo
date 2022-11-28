package assesment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	
		  public static void main(String[] args) throws InterruptedException {
	    	   WebDriverManager.edgedriver().setup();
	           WebDriver driver = new EdgeDriver();
	           System.setProperty("webdriver.edge.driver","C:\\Users\\chunchu.raswitha\\Downloads\\msedgedriver.exe");
				
	           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.amazon.in/");
				 driver.manage().window().maximize();
				driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
		        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("raswithayadav@gmail.com");
		        driver.findElement(By.xpath("//input[@id='continue']")).click();
		        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Raswitha@2001");
		        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
			
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Puma Mens Shuffle One8 V2 Better Sneaker");
				 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				// JavascriptExecutor js = (JavascriptExecutor) driver;
				// js.executeScript("window.scrollTo(0,document.body.scrollheight)");
				
				 //Thread.sleep(5000);
				// driver.findElement(By.xpath(" //span[contains(text(),'Over ₹5,000')]")).click();
				 Thread.sleep(3000);
//				 JavascriptExecutor js = (JavascriptExecutor) driver;
//				//js.executeScript("window.scrollTo(0,document.body.scrollheight)");
//				 js.executeScript("window.scrollBy(0,2500)");
				 driver.findElement(By.xpath("//img[@alt='Puma Mens Shuffle One8 V2 Better Sneaker']")).click();
				 Thread.sleep(3000);
//				 js.executeScript("window.scrollBy(0,1000)");
				//WebElement staticDropdown = driver.findElement(By.id("native_dropdown_selected_size_name"));
			        //Select dropdown = new Select(staticDropdown);
			        //dropdown.selectByIndex(5);
			       // Select Quantity = new Select (driver.findElement(By.xpath("//select[@id='quantity']")));
				   // Quantity.selectByIndex(5);
			       // dropdown.selectByVisibleText("11 UK");
			        Set<String> windows=driver.getWindowHandles();
			        Iterator<String> it=windows.iterator();
			        String parentId=it.next();
			        String childId=it.next();
			        driver.switchTo().window(childId);
//			        js.executeScript("window.scrollBy(0,500)"); 
			        driver.findElement(By.id("native_dropdown_selected_size_name")).click();
			        
			        WebElement staticDropdown = driver.findElement(By.id("native_dropdown_selected_size_name"));
			        Select dropdown = new Select(staticDropdown);
			       // dropdown.selectByIndex(5);
			        //dropdown.selectByValue("5,B09S12J2RK");
			        dropdown.selectByVisibleText(" 11 UK ");
			        driver.findElement(By.xpath("//img[@alt='Puma Black-Puma Team Gold']")).click();
			       // driver.findElement(By.id("add-to-cart-button")).click();
			        Thread.sleep(3000);
			        driver.findElement(By.cssSelector("input[value='Add to Cart']")).click();
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
			       
//			        driver.findElement(By.xpath("//label[@for='quantity']")).click();
			        driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
			      //span[@class='a-dropdown-label']
			        //Select dropd = new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));
			       // dropd.selectByIndex(4);
			     driver.findElement(By.cssSelector("a[id='quantity_7']")).click();
			        
			        
	
			       driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
			       driver.findElement(By.cssSelector("input[name='submissionURL']")).click();
			       driver.findElement(By.cssSelector("input[data-testid='Address_selectShipToThisAddress']")).click();
			       driver.findElement(By.xpath("//img[@alt='Website is secured with SSL']")).click();
			       Set<String> windows1=driver.getWindowHandles();
			        for (String window:windows1)
			        {
			            driver.switchTo().window(window);
			        }
			        WebElement raswitha= driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
			        Actions action = new Actions(driver);
			        action.moveToElement(raswitha).perform();
			        driver.findElement(By.xpath("//span[normalize-space()='Sign Out']")).click();
			       
			     
				
			        
			        
			        
				
				 
				
				 
				 
		      
				
				

				
	
				
				
				

	}

}
