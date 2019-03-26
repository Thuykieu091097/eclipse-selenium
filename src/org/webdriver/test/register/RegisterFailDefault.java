package org.webdriver.test.register;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.message.MessageError;
import org.webdriver.test.message.MessageInput;
import org.webdriver.test.message.MessageXpath;
import org.webdriver.test.pageobject.PageObject;

public class RegisterFailDefault extends PageObject {
	/*
	 * Cách 1 -@Before public void navigate() { driver.navigate().to(registerURL); }
	 */
	// Cách 2
	@Before
	public void click() {
		clickOnElementByXpath(MessageXpath.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_HOME_XPATH);
	}

	@Test
	public void testRegisterwithInputFailName() {

		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeys(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeys(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeys(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		// Get error message

		String errormessageNameCharacter = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME_CHARACTER, errormessageNameCharacter);

	}

	@Test
	public void testRegisterwithInputFailPas() {

		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeys(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input confirm password
		sendKeys(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input address
		sendKeys(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		// Get error message

		String errormessagePasswordCharacter = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_CHARACTER, errormessagePasswordCharacter);
		// Get error message

		String errormessageCfPasswordCharacter = getErroMessage("//div[2]");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_CFPASS_CHARACTER, errormessageCfPasswordCharacter);

	}

	@Test
	public void testRegisterwithInputFailAddress() {

		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeys(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeys(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeys(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		// Get error message

		String errormessageAddressCharacter = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS_CHARACTER, errormessageAddressCharacter);

	}

	@Test
	public void testRegisterwithInputFailPhone() {

		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeys(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeys(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeys(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.INPUT_FAIL);

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		// Get error message
		String errormessagePhoneCharacter = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE_CHARACTER, errormessagePhoneCharacter);

	}

	@Test
	public void testRegisterwithInputFailPasDifferentCfPas() {

		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input password
		sendKeys(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeys(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASSDIFFERENTPASS);
		// input address
		sendKeys(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.INPUT_FAIL);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.INPUT_FAIL);

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		// Get error message
		String errormessagePassdifferentCfPass = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_DIFFERENT_CFPASS, errormessagePassdifferentCfPass);

	}

}
