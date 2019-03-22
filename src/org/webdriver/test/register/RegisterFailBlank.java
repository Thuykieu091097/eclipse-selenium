package org.webdriver.test.register;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webdriver.test.message.MessageError;
import org.webdriver.test.pageobject.PageObject;

public class RegisterFailBlank extends PageObject {
	/*
	 * Cách 1- @Before public void navigate() { driver.navigate().to(registerURL); }
	 */
	// Cách 2
	@Before
	public void click() {
		By memberbtnBy = By.xpath("//a[contains(text(),'Member')]");
		WebElement memberBtn = driver.findElement(memberbtnBy);
		memberBtn.click();
		By registerbtnBy = By.xpath("//a[contains(text(),'Register')]");
		WebElement registerBtn = driver.findElement(registerbtnBy);
		registerBtn.click();
	}

	@Test
	public void testRegisterwithBlankField() {

		// click button register
		ClickBtnRegister();
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
		EnterEmailValue();

		// input password
		EnterPasswordValue();
		// input confirm password
		EnterCfPasswordValue();
		// input address
		EnterAddressValue();
		// input phone number
		EnterPhoneValue();

		// click button register

		ClickBtnRegister();

		// Get error message
		String errormessageName = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, errormessageName);

	}

	@Test
	public void testRegisterwithBlankEmail() {

		// input name
		EnterNameValue();
		// input password
		EnterPasswordValue();
		// input confirm password
		EnterCfPasswordValue();
		// input address
		EnterAddressValue();
		// input phone number
		EnterPhoneValue();

		// click button register

		ClickBtnRegister();

		// Get error message
		String errormessageEmail = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, errormessageEmail);
	}

	@Test
	public void testRegisterwithBlankPas() {
		// input name
		EnterNameValue();

		// input email
		EnterEmailValue();
		// input confirm password
		EnterCfPasswordValue();
		// input address
		EnterAddressValue();
		// input phone number
		EnterPhoneValue();

		// click button register
		ClickBtnRegister();

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
		EnterNameValue();
		// input email
		EnterEmailValue();
		// input password
		EnterPasswordValue();
		// input address
		EnterAddressValue();
		// input phone number
		EnterPhoneValue();

		// click button register

		ClickBtnRegister();

		// Get error message
		String errormessageCfPassword = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, errormessageCfPassword);

	}

	@Test
	public void testRegisterwithBlankAddress() {

		// input name
		EnterNameValue();
		// input email
		EnterEmailValue();
		// input password
		EnterPasswordValue();
		// input confirm password
		EnterCfPasswordValue();
		// input phone number
		EnterPhoneValue();

		// click button register

		ClickBtnRegister();

		// Get error message
		String errormessageAddress = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, errormessageAddress);

	}

	@Test
	public void testRegisterwithBlankPhone() {

		// input name
		EnterNameValue();

		// input email
		EnterEmailValue();

		// input password
		EnterPasswordValue();

		// input confirm password
		EnterCfPasswordValue();

		// input address
		EnterAddressValue();

		// click button register

		ClickBtnRegister();

		// Get error message
		String errormessagePhone = getErroMessage("//div/div/div/div");

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, errormessagePhone);
	}
}
