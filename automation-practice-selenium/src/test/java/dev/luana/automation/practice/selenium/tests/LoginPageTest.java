package dev.luana.automation.practice.selenium.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.luana.automation.practice.selenium.pages.LoginPage;

class LoginPageTest {
	private LoginPage loginPage;
	private final String URL = "https://automationexercise.com/login";
	

	@BeforeEach
	void setUp() throws Exception {
		this.loginPage = new LoginPage();
		this.loginPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.loginPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.loginPage.signin();
		
		//then
		Assertions.assertTrue(this.loginPage.getMyAccountMessage().equals("FEATURES ITEMS"));
		Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
	}

}
