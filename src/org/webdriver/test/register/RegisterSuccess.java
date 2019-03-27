package org.webdriver.test.register;

import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.message.MessageInput;
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
		sendKeysByXpath(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeysByXpath(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeysByXpath(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeysByXpath(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeysByXpath(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeysByXpath(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// refresh browser=> back home
		driver.get(homeURL);

	}

}
