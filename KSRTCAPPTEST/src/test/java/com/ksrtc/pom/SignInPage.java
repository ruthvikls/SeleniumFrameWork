package com.ksrtc.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
 WebDriver driver;
 
 public SignInPage(WebDriver driver) {
	 this.driver=driver;
 }

 @FindBy(xpath="//a[text()=' Sign In']")
 
 public WebElement signInButtonOnHome;
 
@FindBy(xpath="//input[@id='userName']")

public WebElement userNameTextBox;

@FindBy(id="userName")

public WebElement passwordTextBox;


@FindBy(id="userName")

public WebElement signInButton;


public void signIn(String userName, String password) {
	signInButton.click();
	userNameTextBox.sendKeys(userName);
	passwordTextBox.sendKeys(password);
	signInButton.click();
}
}

