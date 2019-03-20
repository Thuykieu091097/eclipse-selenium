package org.webdriver.test.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFail extends PageObject {
	private  WebDriver driver;

	@Before
		public void open() {
	// open firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kieu.tranthithuy\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	//Access application web: "http://mobilestore01.herokuapp.com/login"
		driver.get(Url);
	}

	@After
		public void close() {
		driver.close();
	}

	@Test
		public void testLoginwithBlank() {
		// click button login
		By LoginBy = By.xpath("//input[@value='Login']");
		WebElement loginBtn = driver.findElement(LoginBy);
		loginBtn.click();

	}

	@Test
		public void testLoginwithBlankEmail() {
		// input Password
		By PassBy = By.id("password");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys("thuykieu0910");
		// click button login
		By LoginBy = By.xpath("//input[@value='Login']");
		WebElement loginBtn = driver.findElement(LoginBy);
		loginBtn.click();

	}

	@Test
		public void testLoginwithBlankPass() {

		// input email
		By EmailBy = By.id("email");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("kieu.tranthithuy@vti.com.vn");
		// click button login
		By LoginBy = By.xpath("//input[@value='Login']");
		WebElement loginBtn = driver.findElement(LoginBy);
		loginBtn.click();
	}

	@Test
		public void BackHome() {
		// click button back
		By BackBy = By.xpath("//a[contains(text(),'Back')]");
		WebElement backBtn = driver.findElement(BackBy);
		backBtn.click();
		// Back home
		driver.get("http://mobilestore01.herokuapp.com/home");
	}

	@Test
		public void BackRegister() {
		// click button back
		By BackRegisterBy = By.xpath("//a[contains(text(),'Register')]");
		WebElement backregisterBtn = driver.findElement(BackRegisterBy);
		backregisterBtn.click();
		// Back register
		driver.get("http://mobilestore01.herokuapp.com/register");
	}

	@Test
		public void LoginbyGoogle() {
		// click link login by google
		By LoginGoogleBy = By.xpath("//div[@id='login-form']/div/div/div/div[2]/form/div[3]/div/div/a");
		WebElement loginGoogleLink = driver.findElement(LoginGoogleBy);
		loginGoogleLink.click();
		// Access account google browser
		driver.get(
				"https://accounts.google.com/signin/oauth/identifier?client_id=334662783555-4aj9028kjunhk3kqtsmitp567l4ohkoo.apps.googleusercontent.com&as=eDrn7wwQjHvbb1bWmAa0Ng&destination=http%3A%2F%2Fmobilestore01.herokuapp.com&approval_state=!ChR5X0dVZnJRYlE1RTVwbXJXeTJZbBIfdzhuQ1UxcGgwdGtXNEJxcmlYbTVkb2tpWXdBZW1CWQ%E2%88%99AJDr988AAAAAXI0P-FjAjooSMJiH96Q7Oj5hxnONUVpD&oauthgdpr=1&xsrfsig=ChkAeAh8Tyn6eDjYEOiyDUVD5lBwcuY4qlyXEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow");
	}

	@Test
		public void ForgotPass() {

		// click link fogot
		By ForgotPassBy = By.xpath("//a[contains(text(),'Forgot Your Password?')]");
		WebElement forgotPassLink = driver.findElement(ForgotPassBy);
		forgotPassLink.click();
		// access...
		driver.get("http://mobilestore01.herokuapp.com/password/reset");

	}
}
