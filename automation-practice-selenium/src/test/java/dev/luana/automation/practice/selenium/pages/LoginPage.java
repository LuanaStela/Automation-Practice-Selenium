package dev.luana.automation.practice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	//Locator
	private By emailAddressLocator = By.name("email");
	private By passwordLocator = By.name("email");
	private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	private By tagMyAccountLocator = By.tagName("h2");
	
	public void signin() {
		if(super.isDisplayed(emailAddressLocator)) {
			super.type("luana.arantes.lsa@gmail.com", emailAddressLocator);
			super.type("senhadeteste", passwordLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("email textbox was not present");
		}
	}
	
public String getMyAccountMessage() {
	return super.getText(tagMyAccountLocator);

	}
}
