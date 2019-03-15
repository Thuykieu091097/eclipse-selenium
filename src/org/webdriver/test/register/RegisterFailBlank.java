package org.webdriver.test.register;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RegisterFailBlank {
	String Url = "http://mobilestore01.herokuapp.com/register";
	
	@Test
	public void testRegisterwithBlankField() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get(Url);		
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byNameErrMsgRequir = By.xpath("//div[4]/div/div/div");
		WebElement NameErrMsg = driver.findElement(byNameErrMsgRequir);
		String NamecontentMsg = NameErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The name field is required.", NamecontentMsg);
		// Get error message
		
		By EmailErrMsgRequir = By.xpath("//div/div[2]");
		WebElement EmailErrMsg = driver.findElement(EmailErrMsgRequir);
		String EmailcontentMsg = EmailErrMsg.getText();
				
		// Verify
				
		Assert.assertEquals("The email field is required.", EmailcontentMsg);
		// Get error message
		
		By byPasErrMsgRequir = By.xpath("//div/div[3]");
		WebElement PasErrMsg = driver.findElement(byPasErrMsgRequir);
		String PascontentMsg = PasErrMsg.getText();
						
		// Verify
						
		Assert.assertEquals("The password field is required.", PascontentMsg);
		// Get error message
		
		By byCfPasErrMsgRequir = By.xpath("//div[4]");
		WebElement CfPasErrMsg = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = CfPasErrMsg.getText();
						
		// Verify
						
		Assert.assertEquals("The password confirm field is required.", CfPascontentMsg);
		// Get error message
		
		By byPhoneErrMsgRequir = By.xpath("//div[5]");
		WebElement PhoneErrMsg = driver.findElement(byPhoneErrMsgRequir);
		String PhonecontentMsg = PhoneErrMsg.getText();
						
		// Verify
					
		Assert.assertEquals("The phone field is required.", PhonecontentMsg);
		// Get error message
		
		By byAddressErrMsgRequir = By.xpath("//div[6]");
		WebElement AddressErrMsg = driver.findElement(byAddressErrMsgRequir);
		String AddresscontentMsg = AddressErrMsg.getText();
						
		// Verify
						
		Assert.assertEquals("The address field is required.", AddresscontentMsg);
		//close browser
		driver.close();
		
	}  
 
	@Test
	public void testRegisterwithBlankName() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get(Url);		
		
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("thuykieu.0910.cntt@gmail.com");
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys("thuykieu0910");
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys("thuykieu0910");
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys("Hà Nội");
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys("0979339597");
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byNameErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement NameErrMsg = driver.findElement(byNameErrMsgRequir);
		String NamecontentMsg = NameErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The name field is required.", NamecontentMsg);
		
		//close browser
		driver.close();
		
	} 
	@Test
	public void testRegisterwithBlankEmail() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get(Url);		
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys("THUY KIEU");
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys("thuykieu0910");
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys("thuykieu0910");
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys("Hà Nội");
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys("0979339597");
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byEmailErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement EmailErrMsg = driver.findElement(byEmailErrMsgRequir);
		String EmailcontentMsg = EmailErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The email field is required.", EmailcontentMsg);
		
		//close browser
		driver.close();
		
	} 
	@Test
	public void testRegisterwithBlankPas() {
		// open firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//access the application: http://mobilestore01.herokuapp.com/register
		
		driver.get(Url);
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys("THUY KIEU");
		
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("thuykieu.0910.cntt@gmail.com");
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys("thuykieu0910");
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys("Hà Nội");
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys("0979339597");
				
		// click button register	
				
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
			
		// Get error message
			
		By byPasErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement PasErrMsg = driver.findElement(byPasErrMsgRequir);
		String PascontentMsg = PasErrMsg.getText();
				
		// Verify
				
		Assert.assertEquals("The password field is required.", PascontentMsg);
		
		// Get error message
		
		By byCfPasErrMsgRequir = By.xpath("//div[2]");
		WebElement CfPasErrMsg = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = CfPasErrMsg.getText();
						
		// Verify
						
		Assert.assertEquals("The password confirm and password must match.", CfPascontentMsg);
		//close browser
		driver.close();
		
			}
	@Test
	public void testRegisterwithBlankCfPas() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get(Url);		
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys("THUY KIEU");
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("thuykieu.0910.cntt@gmail.com");	
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys("thuykieu0910");
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys("Hà Nội");
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys("0979339597");
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byCfPasErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement CfPasErrMsg = driver.findElement(byCfPasErrMsgRequir);
		String CfPascontentMsg = CfPasErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The password confirm field is required.", CfPascontentMsg);
		
		//close browser
		driver.close();
		
	}
	@Test
	public void testRegisterwithBlankAddress() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get(Url);		
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys("THUY KIEU");
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("thuykieu.0910.cntt@gmail.com");	
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys("thuykieu0910");
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys("thuykieu0910");
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys("0979339597");
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byAddressErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement AddressErrMsg = driver.findElement(byAddressErrMsgRequir);
		String AddresscontentMsg = AddressErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The address field is required.", AddresscontentMsg);
		
		//close browser
		driver.close();
		
	}
	@Test
	public void testRegisterwithBlankPhone() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get(Url);		
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys("THUY KIEU");
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("thuykieu.0910.cntt@gmail.com");	
		// input password
		By PassBy = By.xpath("//input[@id='password']");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys("thuykieu0910");
		//input confirm password
		By CfPassBy = By.xpath("//input[@id='password_confirm']");
		WebElement cfpassField = driver.findElement(CfPassBy);
		cfpassField.sendKeys("thuykieu0910");
		//input address
		By AddBy = By.xpath("//input[@id='address']");
		WebElement addField = driver.findElement(AddBy);
		addField.sendKeys("Hà Nội");
		
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By byPhoneErrMsgRequir = By.xpath("//div/div/div/div");
		WebElement PhoneErrMsg = driver.findElement(byPhoneErrMsgRequir);
		String PhonecontentMsg = PhoneErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The phone field is required.", PhonecontentMsg);
		
		//close browser
		driver.close();
	}

}
