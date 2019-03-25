package org.webdriver.test.login;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webdriver.test.message.MessageXpath;
import org.webdriver.test.pageobject.PageObject;

public class LoginFail extends PageObject {
	/*
	 * Cách 1-@Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// Cách 2
	
	@Before
	public void click() {
		clickOnElementByXpath(MessageXpath.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(MessageXpath.LOGIN_BUTTON_HOME_XPATH);
		
	}

	@Test
	public void testLoginwithBlank() {
		// click button login
		clickOnElementByXpath(MessageXpath.LOGIN_BUTTON_XPATH);

	}

	@Test
	public void testLoginwithBlankEmail() {
		// input Password
		EnterPasswordValueLogin();
		// click button login
		clickOnElementByXpath(MessageXpath.LOGIN_BUTTON_XPATH);

	}

	@Test
	public void testLoginwithBlankPass() {

		// input email
		EnterEmailValueLogin();
		// click button login
		clickOnElementByXpath(MessageXpath.LOGIN_BUTTON_XPATH);
	}

	@Test
	public void BackHome() {
		// click button back
		By BackBy = By.xpath(MessageXpath.BACK_HOME_LOGIN);
		WebElement backBtn = driver.findElement(BackBy);
		backBtn.click();
		// Back home
		driver.get(homeURL);
	}

	@Test
	public void BackRegister() {
		// click button back
		By BackRegisterBy = By.xpath(MessageXpath.BACK_REGISTER_LOGIN);
		WebElement backregisterBtn = driver.findElement(BackRegisterBy);
		backregisterBtn.click();
		// Back register
		driver.get(registerURL);
	}

	@Test
	public void LoginbyGoogle() {
		// click link login by google
		By LoginGoogleBy = By.xpath(MessageXpath.BACK_GOOGLE_LOGIN);
		WebElement loginGoogleLink = driver.findElement(LoginGoogleBy);
		loginGoogleLink.click();
		// Access account google browser
		driver.get(loginbyGG);
	}

	@Test
	public void ForgotPass() {

		// click link fogot
		By ForgotPassBy = By.xpath(MessageXpath.BACK_FORGOT_PASSWORD_LOGIN);
		WebElement forgotPassLink = driver.findElement(ForgotPassBy);
		forgotPassLink.click();
		// access...
		driver.get(resetURL);

	}
}
