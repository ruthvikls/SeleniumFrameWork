package com.ksrtc.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ksrtc.pom.SignInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteSetUp {
	public WebDriver driver;
	public SignInPage signPage;

	@BeforeMethod
	void suiteSetUp() {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		signPage = PageFactory.initElements(driver, SignInPage.class);

	}
	
	@AfterMethod

	public void tearSown() {

		driver.quit();
	}
}
