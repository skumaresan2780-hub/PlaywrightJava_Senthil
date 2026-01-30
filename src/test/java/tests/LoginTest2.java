package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.MouseButton;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest{

	@Test
	public void loginTest1() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("Navigating to Login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("Adding Username");
		loginpage.addUsername("Admin");
		
		test.info("Adding Password");
		loginpage.addPassword("admin123");
		
		test.info("Clicking Login Button");
		loginpage.clickLoginButton();
		
		test.info("Checking Home page");
		homepage.clickTimeLink();
		
		test.info("all steps completed");
		}
	@Test
	public void loginTest2() {
		test.skip("skipping the test");
		throw new SkipException("Skipping this test");
		
		}
	@Test
	public void loginTest3() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("Adding username");
		loginpage.addUsername("Admin");
		
		test.info("Adding password");
		loginpage.addPassword("admin123");
		
		test.info("Clicking Login Button");
		loginpage.clickLoginButton();
		
//		test.info("Checking Home page");
//		homepage.clickTimeLink();
		
		test.info("all steps completed");
		}
}