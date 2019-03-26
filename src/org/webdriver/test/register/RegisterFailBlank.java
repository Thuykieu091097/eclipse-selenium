package org.webdriver.test.register;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.webdriver.test.message.MessageError;
import org.webdriver.test.message.MessageInput;
import org.webdriver.test.message.MessageXpath;
import org.webdriver.test.pageobject.PageObject;

public class RegisterFailBlank extends PageObject {
	/*
	 * Cách 1- @Before public void navigate() { driver.navigate().to(registerURL); }
	 */
	// Cách 2
	@Before
	public void click() {
		clickOnElementByXpath(MessageXpath.MEMBER_BUTTON_HOME_XPATH);
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_HOME_XPATH);
		
		
	}

	@Test
	public void testRegisterwithBlankField() {

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);
		// Get error message
		String errormessageName = getErroMessage("//div/div/div/div");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, errormessageName);
		// Get error message
		String erromessageEmail = getErroMessage("//div/div[2]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, erromessageEmail);
		// Get error message
		String errormessagePassword = getErroMessage("//div/div[3]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASSWORD, errormessagePassword);
		// Get error message
		String errormessageCfPassword = getErroMessage("//div[4]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, errormessageCfPassword);
		// Get error message
		String errormessagePhone = getErroMessage("//div[5]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, errormessagePhone);
		// Get error message
		String errormessageAddress = getErroMessage("//div[6]");
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, errormessageAddress);

	}

	@Test
	public void testRegisterwithBlankName() {

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
		String errormessageName = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, errormessageName);

	}

	@Test
	public void testRegisterwithBlankEmail() {

		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);
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
		String errormessageEmail = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, errormessageEmail);
	}

	@Test
	public void testRegisterwithBlankPas() {
		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);

		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);
		// input confirm password
		sendKeys(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input address
		sendKeys(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register
		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessagePassword = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASSWORD, errormessagePassword);

		// Get error message
		String errormessageCfPassword = getErroMessage("//div[2]");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_DIFFERENT_CFPASS, errormessageCfPassword);
	}

	@Test
	public void testRegisterwithBlankCfPas() {

		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);

		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);		
		// input password
		sendKeys(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input address
		sendKeys(MessageXpath.ADDRESS_FIELD_REGISTER, MessageInput.ADDRESS);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageCfPassword = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, errormessageCfPassword);

	}

	@Test
	public void testRegisterwithBlankAddress() {
		// input name
		sendKeys(MessageXpath.NAME_FIELD_REGISTER, MessageInput.NAME);

		// input email
		sendKeys(MessageXpath.EMAIL_FIELD_REGISTER, MessageInput.EMAIL);		
		// input password
		sendKeys(MessageXpath.PASSWORD_FIELD_REGISTER, MessageInput.PASSWORD);
		// input confirm password
		sendKeys(MessageXpath.CONFIRM_PASSWORD_FIELD_REGISTER, MessageInput.CONFIRMPASS);
		// input phone number
		sendKeys(MessageXpath.PHONE_FIELD_REGISTER, MessageInput.PHONE);

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessageAddress = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, errormessageAddress);

	}

	@Test
	public void testRegisterwithBlankPhone() {

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

		// click button register

		clickOnElementByXpath(MessageXpath.REGISTER_BUTTON_XPATH);

		// Get error message
		String errormessagePhone = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, errormessagePhone);
	}
}
