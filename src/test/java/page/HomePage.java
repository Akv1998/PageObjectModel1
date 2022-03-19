package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page{
	
	
	
	public LandingPage login(String username, String password){
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@name='login']")).click();
	
		return new LandingPage();
	}
	
	
	public void signUp(String firstName, String lastName, String email){
		
		
		
	}
	
	
	public void validateItems(){
		
		
		
	}
	

}
