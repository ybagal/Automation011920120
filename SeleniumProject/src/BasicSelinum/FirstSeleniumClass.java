package BasicSelinum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		
		
		WebElement ele=dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		ele.click();
		
		//WebElement automobile =dr.findElement(By.id("nav_automobile"));
		
//	automobile.click();	
		dr.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Mobile");
		
		
		
		dr.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		WebElement firstResult =dr.findElement(By.xpath("//div[text()='Realme 5i (Forest Green, 64 GB)']"));
		
		String text = firstResult.getText();
		
		System.out.println(text);
				
				
		
		
		
		
		
		
		
		//dr.close();
		

	}

}
