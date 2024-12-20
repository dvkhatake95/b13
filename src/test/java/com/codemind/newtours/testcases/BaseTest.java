package com.codemind.newtours.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.codemind.newtours.util.Utilities;

public class BaseTest {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver = Utilities.browserUtil(Utilities.getProperty("browser"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(Utilities.getProperty("timeout"))));
		driver.get(Utilities.getProperty("url"));

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
