package dev.luana.automation.practice.selenium.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
	//Locators
	private By menuDressesLocator = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > img");
	private By submenuCasualDressesLocator = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.single-products > div.product-overlay > div > a");
	private By titlePageCasualDressesLocator = By.className("active");
	
	public void viewCasualDressesPage() {
		if(super.isDisplayed(menuDressesLocator)) {
			super.actionMoveToElementPerform(menuDressesLocator);
			super.actionMoveToElementClickPerform(submenuCasualDressesLocator);
		} else {
			System.out.println("menu dresses was not found");
		}
	}
	
	public String getTitlePage() {
		return super.getText(titlePageCasualDressesLocator);
	}
	
}
