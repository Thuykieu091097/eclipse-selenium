package org.webdriver.test.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webdriver.test.message.MessageInput;
import org.webdriver.test.pageobject.PageObject;

public class LoginSuccess extends PageObject {
	protected  WebDriver driver;

	@Before
		public void open() {
	// open firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kieu.tranthithuy\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	//Access application web: "http://mobilestore01.herokuapp.com/login"
		driver.get(loginURL);
	}

	@After
		public void close() {
		driver.close();
	}
	@Test
	public void testLoginwithInputFull() {
		
		// input email
		By EmailBy = By.id("email");
		WebElement emailField = driver.findElement(EmailBy);
		emailField.sendKeys(MessageInput.emailloginSuccess);
		// input Password
		By PassBy = By.id("password");
		WebElement passField = driver.findElement(PassBy);
		passField.sendKeys(MessageInput.passloginSuccess);
		//click button login
		By LoginBy = By.xpath("//input[@value='Login']");
		WebElement loginBtn = driver.findElement(LoginBy);
		loginBtn.click();
		// Back home
		driver.get(homeURL);
		

	}

}

