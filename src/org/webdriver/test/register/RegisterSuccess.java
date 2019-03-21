package org.webdriver.test.register;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webdriver.test.message.MessageInput;
import org.webdriver.test.pageobject.PageObject;

public class RegisterSuccess extends PageObject {
	/* Cách 1-@Before
	public void navigate() {
		driver.navigate().to(registerURL);
	}*/
	//Cách 2
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
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys(MessageInput.NAME);
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.EMAIL);	
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.PASSWORD);
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys(MessageInput.CONFIRMPASS);
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys(MessageInput.ADDRESS);
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys(MessageInput.PHONE);
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// refresh browser=> back home
		driver.get(homeURL);


}

}
