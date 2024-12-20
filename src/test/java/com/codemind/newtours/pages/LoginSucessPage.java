package com.codemind.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSucessPage {

	// Driver refrence variable
	WebDriver driver;

	WebElement LoginseccessfullyMsg;
	WebElement CopyrightTextMsg;

	public LoginSucessPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginseccessfullyMsg() {
		return driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	}

	public String getLoginseccessfullyMagsText() {
		return getLoginseccessfullyMsg().getText();
	}

	public WebElement getCopyrightTextMsg() {
		return driver.findElement(By.xpath("//div[contains(text(),'2005')]"));
	}

	public String getCopyrightMsgText() {
		return getCopyrightTextMsg().getText();
	}
}
