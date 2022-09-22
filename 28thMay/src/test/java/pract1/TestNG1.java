package pract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.MessangerPage;
import pages.Roomsmessanger;

public class TestNG1 {
	private WebDriver driver;
	private HomePage homepage;
	private MessangerPage messangerpage;
	private Roomsmessanger roomsmessanger;
	private SoftAssert soft;
	
	
    @Parameters("browser")
	
	@BeforeTest
	public void beforetest(String browserName) {
		System.out.println(browserName);
		 if (browserName.equals("Chrome"));
		 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKASH\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			 driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	if(browserName.equals("Chrome"));
	{
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\AKASH\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		 driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	}
	
	@BeforeClass
	 public void createPOMobject() {
		
	 homepage= new HomePage(driver);
		
	 messangerpage = new MessangerPage(driver);
	  roomsmessanger= new Roomsmessanger(driver);
	}
	
	@BeforeMethod
	public void openloginpage() {
        driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		homepage.SendUserName();
		messangerpage.SendMessganer();
		
		
		 soft = new SoftAssert();
	}
	
	@Test
	public void verifyReturnToMessage() {
		
		System.out.println("verifyReturnToMessage");
		
		roomsmessanger.Sendrooms();
		String url= driver.getCurrentUrl();
		String title= driver.getTitle();
		
		soft.assertEquals(url," https://www.messenger.com/");
		soft.assertEquals(title,"Messenger" );
		soft.assertAll();
		
	}
    @Test
    public void contactToHlepCenter() {
	System.out.println("contactToHlepCenter");
	
	roomsmessanger.Sendvisithelpcenter();
	String url1= driver.getCurrentUrl();
	String title1= driver.getCurrentUrl();
	
	soft.assertEquals(url1, "https://www.messenger.com/help");
	soft.assertEquals(title1, "Messanger Help Center");
	
	soft.assertAll();
  }
    
   @AfterMethod
    
    public void  logoutfromapplication() {
    	System.out.println("logoutfromapplication");
    	
    	
    }
  @AfterClass
 public void clearobjects() {
	  homepage= null;
	  messangerpage =null;
	  roomsmessanger= null;
			
	
	
  }
    @AfterTest
    public void closebrowser() {
    	System.out.println("closebrowser");
    	driver.close();
    	driver=null;
    }



}


