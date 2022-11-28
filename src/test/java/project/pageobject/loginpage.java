package project.pageobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import amazon.abstractcomponents.abstractcomponents;

public class loginpage {
	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		//super(driver);
		//intialization
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//pagefactory
	@FindBy(xpath="//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	WebElement Signin;
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submit;
	public void loginappli() throws IOException    {
		Properties pro=new Properties();
		FileInputStream files = new FileInputStream("C:\\Users\\chunchu.raswitha\\eclipse-workspace\\Demoproject\\src\\project\\property.file");
		pro.load(files);
		String Email=pro.getProperty("email");
		String Password=pro.getProperty("password");
	     Signin.click();
		 email.sendKeys("raswithayadav@gmail.com");
		 Continue.click();
		 password.sendKeys("Raswitha@2001");
		 submit.click();
		 
		
	}
	
	public void goTo()
	
	
	{
		driver.get("https://www.amazon.in/");
	}

	
	
	
	
	
	
	
	
	

}
