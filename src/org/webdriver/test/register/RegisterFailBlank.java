package org.webdriver.test.register;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webdriver.test.message.MessageError;
import org.webdriver.test.message.MessageInput;
import org.webdriver.test.pageobject.PageObject;



public class RegisterFailBlank extends PageObject {
	protected WebDriver driver;

	@Before
		public void open() {
		// open firefox browser

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\kieu.tranthithuy\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		// Access web application
		driver.get(registerURL);
	}

	@After
		public void close() {
		// close browser
		driver.close();
	}

	@Test
		public void testRegisterwithBlankField() {

		// click button register
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		By byNameErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement errMsgName = driver.findElement(byNameErrMsgRequir);
		String NamecontentMsg = errMsgName.getText();
		// Verify
		Assert.assertEquals(MessageError.errMsgName, NamecontentMsg);
		// Get error message
		By EmailErrMsgRequir = By.xpath("//div/div[2]");
		WebElement errMsgEmail = driver.findElement(EmailErrMsgRequir);
		String EmailcontentMsg = errMsgEmail.getText();
		// Verify
		Assert.assertEquals(MessageError.errMsgEmail, EmailcontentMsg);
		// Get error message
		By byPasErrMsgRequir = By.xpath("//div/div[3]");
		WebElement errMsgPassword = driver.findElement(byPasErrMsgRequir);
		String PascontentMsg = errMsgPassword.getText();
		// Verify
		Assert.assertEquals(MessageError.errMsgPassword, PascontentMsg);
		// Get error message
		By byCfPasErrMsgRequir = By.xpath("//div[4]");
		WebElement errMsgCfPass = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = errMsgCfPass.getText();
		// Verify
		Assert.assertEquals(MessageError.errMsgCfPass, CfPascontentMsg);
		// Get error message
		By byPhoneErrMsgRequir = By.xpath("//div[5]");
		WebElement errMsgPhone = driver.findElement(byPhoneErrMsgRequir);
		String PhonecontentMsg = errMsgPhone.getText();
		// Verify
		Assert.assertEquals(MessageError.errMsgPhone, PhonecontentMsg);
		// Get error message
		By byAddressErrMsgRequir = By.xpath("//div[6]");
		WebElement errMsgAddress = driver.findElement(byAddressErrMsgRequir);
		String AddresscontentMsg = errMsgAddress.getText();
		// Verify
		Assert.assertEquals(MessageError.errMsgAddress, AddresscontentMsg);

	}

	@Test
		public void testRegisterwithBlankName() {
		
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.email);
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.password);
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys(MessageInput.confirmpass);
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys(MessageInput.address);
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys(MessageInput.phone);
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byNameErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement NameErrMsg = driver.findElement(byNameErrMsgRequir);
		String NamecontentMsg = NameErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals(MessageError.errMsgName, NamecontentMsg);
		
		
	} 
	
	@Test
		public void testRegisterwithBlankEmail() {
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys(MessageInput.name);
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.password);
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys(MessageInput.confirmpass);
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys(MessageInput.address);
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys(MessageInput.phone);
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byEmailErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement EmailErrMsg = driver.findElement(byEmailErrMsgRequir);
		String EmailcontentMsg = EmailErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals(MessageError.errMsgEmail, EmailcontentMsg);
	} 
	
	@Test
		public void testRegisterwithBlankPas() {
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys(MessageInput.name);
		
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.email);
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys(MessageInput.confirmpass);
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys(MessageInput.address);
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys(MessageInput.phone);
				
		// click button register	
				
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
			
		// Get error message
			
		By byPasErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement PasErrMsg = driver.findElement(byPasErrMsgRequir);
		String PascontentMsg = PasErrMsg.getText();
				
		// Verify
				
		Assert.assertEquals(MessageError.errMsgPassword, PascontentMsg);
		
		// Get error message
		
		By byCfPasErrMsgRequir = By.xpath("//div[2]");
		WebElement CfPasErrMsg = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = CfPasErrMsg.getText();
						
		// Verify
						
		Assert.assertEquals(MessageError.errMsgPasandCfpas, CfPascontentMsg);
			}
	
	@Test
		public void testRegisterwithBlankCfPas() {
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys(MessageInput.name);
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.email);	
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.password);
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys(MessageInput.address);
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys(MessageInput.phone);
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byCfPasErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement CfPasErrMsg = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = CfPasErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals(MessageError.errMsgCfPass, CfPascontentMsg);
		
	}
	
	@Test
		public void testRegisterwithBlankAddress() {
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys(MessageInput.email);
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.email);	
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.password);
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys(MessageInput.confirmpass);
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys(MessageInput.phone);
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byAddressErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement AddressErrMsg = driver.findElement(byAddressErrMsgRequir);
		String AddresscontentMsg = AddressErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals(MessageError.errMsgAddress, AddresscontentMsg);
		
	}
	@Test
		public void testRegisterwithBlankPhone() {
		
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys(MessageInput.name);
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.email);	
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.password);
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys(MessageInput.confirmpass);
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys(MessageInput.address);
		
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byPhoneErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement PhoneErrMsg = driver.findElement(byPhoneErrMsgRequir);
		String PhonecontentMsg = PhoneErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals(MessageError.errMsgPhone, PhonecontentMsg);
	}
}
