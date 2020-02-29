package TestNGAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void beforeSuite()
	
	{
		System.out.println("Before suite");
	}
	
	@ AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
	
	

}
