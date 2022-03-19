package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Page {
	
	public static WebDriver driver;
	public static TopNavigation topNav;
	//public static FooterNavigation footNav;
	public static FileInputStream fis;
	public static Properties OR = new Properties();
	
	public Page(){
		
		if(driver==null){
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		topNav = new TopNavigation();
		
		//fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		//OR.load(fis);
	
		}
		
	}
	
	@AfterSuite
	public void tearDown(){
		
		System.out.println("Inside after suite");
		driver.quit();
		
	}

}
