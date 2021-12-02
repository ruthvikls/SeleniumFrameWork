package com.ksrtc.test;

import org.testng.annotations.Test;

import com.ksrtc.base.SuiteSetUp;

public class SignInTest extends SuiteSetUp {

	@Test

	public void signInAsValidUser() {

		signPage.signIn("ruthvikls@gmail.com", "Test@123"); // Sign in test

	}

}
