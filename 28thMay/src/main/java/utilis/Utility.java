package utilis;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
  public static void main(String[] args) throws IOException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKASH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver  driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	  TakesScreenshot ts= (TakesScreenshot)driver;
	 File filescrs= ts.getScreenshotAs(OutputType.FILE);
	 File des= new File("C:\\Users\\AKASH\\Desktop\\Vaishali kadam\\testid123"+timestamp()+".jpg");
	 FileHandler.copy(filescrs, des);
}
	
	public static  String timestamp() {
		return new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date());
	}
	
	public static String  fetchdatafromexcelsheet(String sheet,int row,int column)
	
	{
	
		return sheet;
		
	}
	
	
}
