package org.webdriver.test.register;

import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.message.MessageXpath;
import org.webdriver.test.pageobject.PageObject;

public class RegisterSuccess extends PageObject {
	/*
	 * Cách 1-@Before public void navigate() { driver.navigate().to(registerURL); }
	 */
	// Cách 2 
	@Before
	public void click() {
		clickOnElementByXpath(MessageXpath.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_HOME_XPATH);
	}

	@Test
	public void testRegisterwithInputFull() {

		// input name
		EnterNameValue();
		// input email
		EnterEmailValue();
		// input password
		EnterPasswordValue();
		// input confirm password
		EnterAddressValue();
		// input address
		EnterPhoneValue();

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// refresh browser=> back home
		driver.get(homeURL);

		
	}

}
