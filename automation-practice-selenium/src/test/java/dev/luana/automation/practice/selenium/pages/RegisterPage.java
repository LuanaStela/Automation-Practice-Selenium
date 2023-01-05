package dev.luana.automation.practice.selenium.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
	//Locators
	private By emailAddressLocator = By.id("email_create");
	private By submitBtnLocator = By.id("SubmitCreate");
	private By emailLocator = By.id("email");
	private By alertAdditionalInformationLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/h2");
	
	public void insertEmailToRegister() {
		if(super.isDisplayed(emailAddressLocator)) {
			type("luana.arantes.lsa@gmail.com", emailAddressLocator);
			click(submitBtnLocator);
		} else {
			System.out.println("email textbox was not present");
		}
	}
	
	public String getEmailNewAccount() {
		super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
		return super.getTextByAttribute(this.emailLocator, "value");
	}
	
}
