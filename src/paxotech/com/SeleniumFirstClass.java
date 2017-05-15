package paxotech.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumFirstClass {
WebDriver driver=null;
	public void molla(){
		int a=2;
		int b=3;
		int c=(a+b);
		System.out.println(c);
	}
	public static void molla2(){
		System.out.println("Sara is my jann");
	}

	public static void main(String[] args) {
		SeleniumFirstClass myclass=new SeleniumFirstClass();
		myclass.molla();
		molla2();
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=(WebDriver) new GoogleChromeLocator();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		
		driver.close();
		driver.quit();

	}
	@BeforeMethod
	public void stUp(){
		driver=new FirefoxDriver();
		//WebDriver driver=(WebDriver) new GoogleChromeLocator();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		
	}
	@Test
	public void test1(){
		System.out.println("Now started test ");
		int a=2;
		int b=3;
		int c=(a+b);
		System.out.println(c);
		
	}	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	   
		
		}	
		
	

}
