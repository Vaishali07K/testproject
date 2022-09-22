package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//private WebDriver driver;
	
// Declaration
	
	@FindBy(xpath="//input[@type='text']") private WebElement Username;
	
	@FindBy(xpath= "// input[@type='password']") private WebElement password;
	
	
	@FindBy(xpath="// button[@value='1']") private WebElement login;
	
	//@FindBy(xpath="//a[@href='https://messenger.com/']") private WebElement getmessganer;

	
//Intialization
	  public HomePage(WebDriver driver) {   //// constructor
		  
		  PageFactory.initElements(driver, this);
	//	  this.driver= driver;
	  }
	  
	  public void SendUserName() {
		  
		//  Actions act= new Actions(driver);
	//	  act.moveToElement(getmessganer).build().perform();
		  
		  Username.sendKeys("vaishali");
		  
		 password.sendKeys("Bigboss@13");
		  
		  login.click();
		  }	 
	  
	//  public void SendUse() {
		  
		  
	//  }
		  
	 
	
}
