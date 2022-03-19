package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import page.HomePage;
import page.LandingPage;

public class LoginTest extends TestBase{
	
	@Test
	public void doLogin(){
		
		HomePage home = new HomePage();
		home.login("theautomatefactory@gmail.com", "Bingo@123");
	
		
		
	}
	
	//

}
