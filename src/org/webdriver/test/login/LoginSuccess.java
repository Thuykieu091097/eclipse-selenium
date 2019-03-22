package org.webdriver.test.login;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webdriver.test.pageobject.PageObject;

public class LoginSuccess extends PageObject {
	/*
	 * Cách 1- @Before public void navigate() { driver.navigate().to(loginURL); }
	 */
	// Cách 2
	@Before
	public void click() {
		By memberbtnBy = By.xpath("//a[contains(text(),'Member')]");
		WebElement memberBtn = driver.findElement(memberbtnBy);
		memberBtn.click();
		By loginbtnBy = By.xpath("//a[contains(text(),'Login')]");
		WebElement loginBtn = driver.findElement(loginbtnBy);
		loginBtn.click();
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
