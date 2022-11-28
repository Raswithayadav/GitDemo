package amazon.testobject;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import project.pageobject.cartpage;
import project.pageobject.checkoutpage;
import project.pageobject.loginpage;
import project.pageobject.productcateloguepage;


public class testobject {
	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriverManager.edgedriver().setup();
         WebDriver driver = new EdgeDriver();
         System.setProperty("webdriver.edge.driver","C:\\Users\\chunchu.raswitha\\Downloads\\msedgedriver.exe");
         driver.manage().window().maximize();
         loginpage Loginpage=new loginpage(driver);
         Loginpage.goTo();
         Loginpage.loginappli();
		  productcateloguepage ProductCatelogue =new   productcateloguepage(driver);
		  ProductCatelogue.ProductSearch();
		  cartpage CartProd=new cartpage(driver);
	      CartProd.ShippingCart();
	       
	      checkoutpage CheckProd=new checkoutpage(driver);
	      CheckProd.ShippingAddress();
	      System.out.println("Puma Mens Shuffle One8 V2 Better Sneaker");
	      System.out.println("Total amount = 33,593");
	        
	       
}
}

