package org.webdriver.test;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login {
	
	@Test
	public void testLoginwithBlankField() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get("http://mobilestore01.herokuapp.com/register");		
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// Get error message
		
		By ErrMsgBy1 = By.xpath("/html/body/div/div/div/div[1]");
		WebElement ErrMsg1 = driver.findElement(ErrMsgBy1);
		String contentMsg1 = ErrMsg1.getText();
		
		// Verify
		
		Assert.assertEquals("The name field is required.", contentMsg1);
		// Get error message
		
		By ErrMsgBy2 = By.xpath("/html/body/div/div/div/div[2]");
		WebElement ErrMsg2 = driver.findElement(ErrMsgBy2);
		String contentMsg2 = ErrMsg2.getText();
				
		// Verify
				
		Assert.assertEquals("The email field is required.", contentMsg2);
		// Get error message
		
		By ErrMsgBy3 = By.xpath("/html/body/div/div/div/div[3]");
		WebElement ErrMsg3 = driver.findElement(ErrMsgBy3);
		String contentMsg3 = ErrMsg3.getText();
						
		// Verify
						
		Assert.assertEquals("The password field is required.", contentMsg3);
		// Get error message
		
		By ErrMsgBy4 = By.xpath("/html/body/div/div/div/div[4]");
		WebElement ErrMsg4 = driver.findElement(ErrMsgBy4);
		String contentMsg4 = ErrMsg4.getText();
						
		// Verify
						
		Assert.assertEquals("The password confirm field is required.", contentMsg4);
		// Get error message
		
		By ErrMsgBy5 = By.xpath("/html/body/div/div/div/div[5]");
		WebElement ErrMsg5 = driver.findElement(ErrMsgBy5);
		String contentMsg5 = ErrMsg5.getText();
						
		// Verify
					
		Assert.assertEquals("The phone field is required.", contentMsg5);
		// Get error message
		
		By ErrMsgBy6 = By.xpath("/html/body/div/div/div/div[6]");
		WebElement ErrMsg6 = driver.findElement(ErrMsgBy6);
		String contentMsg6 = ErrMsg6.getText();
						
		// Verify
						
		Assert.assertEquals("The address field is required.", contentMsg6);
		//close browser
		driver.close();
		
	}  
 
	@Test
	public void testLoginwithBlankName() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get("http://mobilestore01.herokuapp.com/register");		
		
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("kieu.tranthithuy@vti.com.vn");
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
		
		By ErrMsgBy = By.xpath("/html/body/div/div/div/div[1]");
		WebElement ErrMsg = driver.findElement(ErrMsgBy);
		String contentMsg = ErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The name field is required.", contentMsg);
		
		//close browser
		driver.close();
		
	} 
	@Test
	public void testLoginwithBlankEmail() {
		
		// open firefox browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// access the application: accounts.google.com
		
		driver.get("http://mobilestore01.herokuapp.com/register");		
		
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
		
		By ErrMsgBy = By.xpath("/html/body/div/div/div/div[1]");
		WebElement ErrMsg = driver.findElement(ErrMsgBy);
		String contentMsg = ErrMsg.getText();
		
		// Verify
		
		Assert.assertEquals("The email field is required.", contentMsg);
		
		//close browser
		driver.close();
		
	} 
	@Test
	public void testLoginwithBlankPas() {
		// open firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thuy Kieu\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//access the application: http://mobilestore01.herokuapp.com/register
		
		driver.get("http://mobilestore01.herokuapp.com/register");
		
		// input name
		By NameBy = By.xpath("//*[@id=\"name\"]");
		WebElement nameField = driver.findElement(NameBy);
		nameField.sendKeys("THUY KIEU");
		
		// input email
		By EmailBy = By.xpath("//input[@id='email']");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys("kieu.tranthithuy@vti.com.vn");
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
			
		By ErrMsgBy1 = By.xpath("/html/body/div/div/div/div[1]");
		WebElement ErrMsg1 = driver.findElement(ErrMsgBy1);
		String contentMsg1 = ErrMsg1.getText();
				
		// Verify
				
		Assert.assertEquals("The password field is required.", contentMsg1);
		
		// Get error message
		
		By ErrMsgBy2 = By.xpath("/html/body/div/div/div/div[2]");
		WebElement ErrMsg2 = driver.findElement(ErrMsgBy2);
		String contentMsg2 = ErrMsg2.getText();
						
		// Verify
						
		Assert.assertEquals("The password confirm and password must match.", contentMsg2);
		//close browser
		driver.close();
				
			
	}
	

}
