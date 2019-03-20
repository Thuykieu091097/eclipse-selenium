package org.webdriver.test.register;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterSuccess extends PageObject {
	private WebDriver driver;

	@Before
		public void open() {
		// open firefox browser

		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\kieu.tranthithuy\\\\Downloads\\\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		// Access web application
		driver.get(Url);
	}

	@After
		public void close() {
		// close browser
		driver.close();
	}
	
	@Test
	public void testRegisterwithInputFull() {
		
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
		//input phone number
		By PhoneBy = By.xpath("//input[@id='phone']");
		WebElement phoneField = driver.findElement(PhoneBy);
		phoneField.sendKeys("0979339597");
		
		// click button register	
		
		By SubmitBy = By.xpath("//input[@value='Register']");
		WebElement SubmitBtn = driver.findElement(SubmitBy);
		SubmitBtn.click();
		
		// refresh browser=> back home
		driver.get("http://mobilestore01.herokuapp.com/home");


}

}
