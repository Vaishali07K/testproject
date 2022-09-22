package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessangerPage {
	
	
	
//
	@FindBy(xpath="//a[@href='https://messenger.com/']")private WebElement Messanger;
	
	@FindBy(xpath="//a[@href='https://www.messenger.com/rooms']") private WebElement rooms;
	
	
	public MessangerPage( WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SendMessganer() {
		
		Messanger.click();
		
		rooms.click();
	}

}
