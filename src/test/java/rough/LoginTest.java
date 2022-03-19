package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.Page;
import page.HomePage;
import page.LandingPage;
import page.MyProfilePage;

public class LoginTest {

	public static void main(String[] args) {

	
		HomePage home = new HomePage();
		LandingPage lp = home.login("seleniumcoaching@gmail.com", "protractor123");
		MyProfilePage mp = lp.gotoProfile();
		//mp.uploadPic();
		Page.topNav.logOut();
		//new HomePage().login("seleniumcoaching@gmail.com", "protractor123").gotoProfile().uploadPic();

	}

}
