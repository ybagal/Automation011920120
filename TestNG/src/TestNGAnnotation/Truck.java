package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Truck extends BaseClass {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test Truck");
	}

	
	@AfterTest
	
	public void afterTest()
	{
		System.out.println("AfterTest Truck");
	}

	
	@BeforeClass 
	public void beforeClass()
	{
		System.out.println("Before Class Truck");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("After class Truck");
	}

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Truck");
	}
	
	@AfterMethod
	
	public void afterMethod()
	{
		System.out.println("After Method Truck");
	}
	
	
	
	
	
@Test
public void test1()

{
System.out.println("Second test class test 1");
}

@Test
public void test2()


{
System.out.println("Second test class test 2");
}

@Test
public void test3()


{
System.out.println("Second test class test 3");
}

}
