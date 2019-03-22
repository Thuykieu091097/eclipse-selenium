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
		By byNameErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement errMsgName = driver.findElement(byNameErrMsgRequir);
		String NamecontentMsg = errMsgName.getText();
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, NamecontentMsg);
		// Get error message
		By EmailErrMsgRequir = By.xpath("//div/div[2]");
		WebElement errMsgEmail = driver.findElement(EmailErrMsgRequir);
		String EmailcontentMsg = errMsgEmail.getText();
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, EmailcontentMsg);
		// Get error message
		By byPasErrMsgRequir = By.xpath("//div/div[3]");
		WebElement errMsgPassword = driver.findElement(byPasErrMsgRequir);
		String PascontentMsg = errMsgPassword.getText();
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASSWORD, PascontentMsg);
		// Get error message
		By byCfPasErrMsgRequir = By.xpath("//div[4]");
		WebElement errMsgCfPass = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = errMsgCfPass.getText();
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, CfPascontentMsg);
		// Get error message
		By byPhoneErrMsgRequir = By.xpath("//div[5]");
		WebElement errMsgPhone = driver.findElement(byPhoneErrMsgRequir);
		String PhonecontentMsg = errMsgPhone.getText();
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, PhonecontentMsg);
		// Get error message
		By byAddressErrMsgRequir = By.xpath("//div[6]");
		WebElement errMsgAddress = driver.findElement(byAddressErrMsgRequir);
		String AddresscontentMsg = errMsgAddress.getText();
		// Verify
		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, AddresscontentMsg);

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

		By byNameErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement NameErrMsg = driver.findElement(byNameErrMsgRequir);
		String NamecontentMsg = NameErrMsg.getText();

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_NAME, NamecontentMsg);

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

		By byEmailErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement EmailErrMsg = driver.findElement(byEmailErrMsgRequir);
		String EmailcontentMsg = EmailErrMsg.getText();

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_EMAIL, EmailcontentMsg);
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

		By byPasErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement PasErrMsg = driver.findElement(byPasErrMsgRequir);
		String PascontentMsg = PasErrMsg.getText();

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASSWORD, PascontentMsg);

		// Get error message

		By byCfPasErrMsgRequir = By.xpath("//div[2]");
		WebElement CfPasErrMsg = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = CfPasErrMsg.getText();

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PASS_DIFFERENT_CFPASS, CfPascontentMsg);
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

		By byCfPasErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement CfPasErrMsg = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = CfPasErrMsg.getText();

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_CONFIRMPASS, CfPascontentMsg);

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

		By byAddressErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement AddressErrMsg = driver.findElement(byAddressErrMsgRequir);
		String AddresscontentMsg = AddressErrMsg.getText();

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_ADDRESS, AddresscontentMsg);

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

		By byPhoneErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement PhoneErrMsg = driver.findElement(byPhoneErrMsgRequir);
		String PhonecontentMsg = PhoneErrMsg.getText();

		// Verify

		Assert.assertEquals(MessageError.ERROR_MESSAGE_PHONE, PhonecontentMsg);
	}
}
