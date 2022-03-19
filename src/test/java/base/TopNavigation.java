package base;

import org.openqa.selenium.By;

import page.LandingPage;

public class TopNavigation {

	
	public void doSearch(){
		
		
	}
	
	
	public void logOut(){
		
		Page.driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
		Page.driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
	}
	
	
	public LandingPage gotoHome(){
		
		Page.driver.findElement(By.xpath("//*[@id='mount_0_0_AN']/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();
		
		return new LandingPage();
		
	}
}
