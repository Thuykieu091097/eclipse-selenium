package org.webdriver.test.login;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webdriver.test.message.MessageInput;
import org.webdriver.test.pageobject.PageObject;

public class LoginSuccess extends PageObject {
	/* Cách 1- @Before 
	public void navigate() {
		driver.navigate().to(loginURL);
	}*/
	//Cách 2
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
		By EmailBy = By.id("email");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.EMAILLOGIN);
		// input Password
		By PassBy = By.id("password");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.PASSLOGIN);
		//click button login
		By LoginBy = By.xpath("//input[@value='Login']");
		WebElement loginBtn = driver.findElement(LoginBy);
		loginBtn.click();
		// Back home
		driver.get(homeURL);
		

	}

}

