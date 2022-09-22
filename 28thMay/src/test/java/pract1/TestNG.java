package pract1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite1");
	
		
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest2");
	}
	@BeforeClass
	 public void beforeclass() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beformethod() {
		System.out.println("@BeforeMethod");
		
	}
	
	@Test
	public void testA() {
		System.out.println("123");
		
	}
   @Test
   public void testB() {
	System.out.println("234");
  }
   
   @Test
   public void testC() {
   	System.out.println("hgg");
   }
   @Test
   public void testD() {
   	System.out.println("hjkg");
   }
   
   @AfterMethod
   
   public void  aftermethod() {
   	System.out.println(" @AfterMethod");
   	
   }
   @AfterClass
    public void afterclass() {
    System.out.println("@AfterClass");
    
   }
   
   @AfterTest
   public void aftertest() {
	   System.out.println("@AfterTest");
   }

    @AfterSuite
    public void aftersuite() {
    	System.out.println("@AfterSuite1");
    }
}



		
	
	
	
	


