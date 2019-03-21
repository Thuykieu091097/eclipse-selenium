package org.webdriver.test.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webdriver.test.message.MessageInput;
import org.webdriver.test.pageobject.PageObject;

public class LoginFail extends PageObject {
	protected  WebDriver driver;

	@Before
		public void open() {
	// open firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kieu.tranthithuy\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	//Access application web: "http://mobilestore01.herokuapp.com/login"
		driver.get(loginURL);
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
		passField.sendKeys(MessageInput.passloginSuccess);
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
		emailField.sendKeys(MessageInput.emailloginSuccess);
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
		driver.get(homeURL);
	}

	@Test
		public void BackRegister() {
		// click button back
		By BackRegisterBy = By.xpath("//a[contains(text(),'Register')]");
		WebElement backregisterBtn = driver.findElement(BackRegisterBy);
		backregisterBtn.click();
		// Back register
		driver.get(registerURL);
	}

	@Test
		public void LoginbyGoogle() {
		// click link login by google
		By LoginGoogleBy = By.xpath("//div[@id='login-form']/div/div/div/div[2]/form/div[3]/div/div/a");
		WebElement loginGoogleLink = driver.findElement(LoginGoogleBy);
		loginGoogleLink.click();
		// Access account google browser
		driver.get(loginbyGG);
	}		

	@Test
		public void ForgotPass() {

		// click link fogot
		By ForgotPassBy = By.xpath("//a[contains(text(),'Forgot Your Password?')]");
		WebElement forgotPassLink = driver.findElement(ForgotPassBy);
		forgotPassLink.click();
		// access...
		driver.get(resetURL);

	}
}
