package pract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.MessangerPage;
import pages.Roomsmessanger;

public class practice {
	
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKASH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	HomePage homepage= new HomePage(driver);
	
	homepage.SendUserName();
	
//	homepage.SendUserName();
	
//	homepage.SendPassword();
	
//	homepage.loinbutton();
	
	MessangerPage messangerpage = new MessangerPage(driver);
	
     messangerpage.SendMessganer();
	
//	System.out.println(driver.getCurrentUrl());
     
     Roomsmessanger roomsmessanger= new Roomsmessanger(driver);
     roomsmessanger.Sendrooms();
     roomsmessanger.Sendvisithelpcenter();

	
}

}
