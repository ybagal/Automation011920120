package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automobile extends BaseClass {
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test Automobile");
	}

	
	@AfterTest
	
	public void afterTest()
	{
		System.out.println("AfterTest Automobile");
	}
	
	@BeforeClass 
	public void beforeClass()
	{
		System.out.println("Before Class Automobile");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("After Class Automobile");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Automobile");
	}
	
	@AfterMethod
	
	public void afterMethod()
	{
		System.out.println("After Method Automobile");
	}

	
	
@Test(priority=0)
	
	public void login()
	
	
	
	{
		System.out.println("Test case 3");
		System.out.println(10/0);
		
	}

	
@Test (dependsOnMethods={"login"})
	
	public void verifyHomepage()
	
	{
		System.out.println("Test case 1");
		
		
	}
@Test (dependsOnMethods={"login"})

public void Logout()

{
	System.out.println("Test case 2");
	
	
}

	
	
}
