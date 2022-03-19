package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import base.TopNavigation;

public class MyProfilePage  extends Page {
	
	
	
	
	
	public MyProfilePage uploadPic(){
		
		driver.findElement(By.xpath("//*[contains(text(),'Update Profile Picture')]")).click();
		driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div/a/div/input")).sendKeys("C:\\Users\\Selenium\\Desktop\\test.jpg");

		return this;
	}
	
	public void gotoFriends(){
		
		
		
	}
	
	
	public void gotoPhotos(){
		
		
		
	}

}
