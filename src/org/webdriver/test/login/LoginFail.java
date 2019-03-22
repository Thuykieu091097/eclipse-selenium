package org.webdriver.test.login;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webdriver.test.pageobject.PageObject;

public class LoginFail extends PageObject {
	/*
	 * Cách 1-@Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// Cách 2
	
	@Before
	public void click() {
		By memberbtnBy = By.xpath("//a[contains(text(),'Member')]");
		WebElement memberBtn = driver.findElement(memberbtnBy);
		memberBtn.click();
		By loginbtnBy = By.xpath("//a[contains(text(),'Login')]");
		WebElement loginBtn = driver.findElement(loginbtnBy);
		loginBtn.click();
	}

	@Test
	public void testLoginwithBlank() {
		// click button login
		ClickBtnLogin();

	}

	@Test
	public void testLoginwithBlankEmail() {
		// input Password
		EnterPasswordValueLogin();
		// click button login
		ClickBtnLogin();

	}

	@Test
	public void testLoginwithBlankPass() {

		// input email
		EnterEmailValueLogin();
		// click button login
		ClickBtnLogin();
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
