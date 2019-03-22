package org.webdriver.test.register;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webdriver.test.pageobject.PageObject;

public class RegisterSuccess extends PageObject {
	/*
	 * Cách 1-@Before public void navigate() { driver.navigate().to(registerURL); }
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

		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();

		// refresh browser=> back home
		driver.get(homeURL);

	}

}
