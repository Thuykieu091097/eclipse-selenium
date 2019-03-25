package org.webdriver.test.login;

import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.message.MessageXpath;
import org.webdriver.test.pageobject.PageObject;

public class LoginSuccess extends PageObject {
	/*
	 * Cách 1- @Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// Cách 2
	@Before
	public void click() {
		clickOnElementByXpath(MessageXpath.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(MessageXpath.LOGIN_BUTTON_HOME_XPATH);
	}

	@Test
	public void testLoginwithInputFull() {

		// input email
		EnterEmailValueLogin();
		// input Password
		EnterPasswordValueLogin();
		// click button login
		clickOnElementByXpath(MessageXpath.LOGIN_BUTTON_XPATH);
		// Back home
		driver.get(homeURL);

		
	}

}
