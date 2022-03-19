package testcases;

import org.testng.annotations.Test;

import base.Page;
import base.TestBase;
import page.LandingPage;
import page.MyProfilePage;

public class UploadPicTest  extends TestBase{
	
	@Test
	public void uploadPic(){
		
		LandingPage lp = Page.topNav.gotoHome();
		//LandingPage lp = new LandingPage();
		MyProfilePage mp = lp.gotoProfile();
		mp.uploadPic();
	
		
	}

}
