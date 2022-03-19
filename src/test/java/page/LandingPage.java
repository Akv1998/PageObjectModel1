package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import base.TopNavigation;

public class LandingPage extends Page {
	
	
	
	public MyProfilePage gotoProfile(){
		
		
		driver.findElement(By.linkText("Shri")).click();
		
		return new MyProfilePage();
	}
	
	
	public void updateStatus(){
		
		
	}
	
	
	public void gotoNewsFeeds(){
		
		
		
	}

}
