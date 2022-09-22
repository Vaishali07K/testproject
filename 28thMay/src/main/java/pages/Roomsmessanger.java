package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roomsmessanger {
	
	@FindBy(xpath="//a[text()=' Return to messenger.com ']")private WebElement Returntomessanger;
	
	@FindBy(xpath="//a[text()=' Visit our help center ']")private WebElement visithelpceneter;
	
	public Roomsmessanger(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Sendrooms() {
		Returntomessanger.click();
	}
		public void Sendvisithelpcenter() {
		
		
		visithelpceneter.click();
		
	}

}
