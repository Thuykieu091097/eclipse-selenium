package org.webdriver.test.login;

import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.pageobject.PageObject;

public class LoginSuccess extends PageObject {
	/*
	 * C�ch 1- @Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// C�ch 2
	@Before
	public void click() {
		clickOnElementByXpath("//a[contains(text(),'Member')]");
		clickOnElementByXpath("//a[contains(text(),'Login')]");
	}

	@Test
	public void testLoginwithInputFull() {

		// input email
		EnterEmailValueLogin();
		// input Password
		EnterPasswordValueLogin();
		// click button login
		ClickBtnLogin();
		// Back home
		driver.get(homeURL);

		
	}

}
