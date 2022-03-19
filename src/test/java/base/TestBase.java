package base;

import org.testng.annotations.AfterSuite;

public class TestBase {
	
	
	
	public void setUp(){
		
		
		
	}
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.driver.quit();
		
	}

}
