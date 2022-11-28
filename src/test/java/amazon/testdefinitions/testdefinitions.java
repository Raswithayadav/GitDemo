package amazon.testdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import project.pageobject.cartpage;
import project.pageobject.checkoutpage;
import project.pageobject.loginpage;
import project.pageobject.productcateloguepage;

public class testdefinitions {
	WebDriver driver;
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_with_username_and_password(String Email,String password) throws IOException 
	{
		WebDriverManager.edgedriver().setup();
         driver = new EdgeDriver();
        System.setProperty("webdriver.edge.driver","C:\\Users\\chunchu.raswitha\\Downloads\\msedgedriver.exe");
        driver.manage().window().maximize();
        loginpage Loginpage=new loginpage(driver);
        Loginpage.goTo();
        Loginpage.loginappli();
        
	}
        @When("^I have searched the product (.+)$")
        public void I_have_searched_the_product(String productname) throws InterruptedException, IOException
        {
        	productcateloguepage ProductCatelogue =new   productcateloguepage(driver);
  		  ProductCatelogue.ProductSearch();
        }
        @When("I add product to the cart and select the quantity")
        public void I_add_product_to_the_cart_and_select_quantity() throws InterruptedException, IOException  {
        	  cartpage CartProd=new cartpage(driver);
    	      CartProd.ShippingCart();
        }
        @Then("Checkout the product and fill the details then signout")
        public void Checkout_the_product_and_fill_details_then_signout() throws InterruptedException {
        	checkoutpage CheckProd=new checkoutpage(driver);
  	      CheckProd.ShippingAddress();
        }
}

