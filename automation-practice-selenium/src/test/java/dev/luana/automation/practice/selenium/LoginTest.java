package dev.luana.automation.practice.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;
	private Assertions Assertions;

	@BeforeEach
	void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		WebElement emailAddressElement = driver.findElement(By.name("email"));
		emailAddressElement.sendKeys("luana.arantes.lsa@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("senhadeteste");
		
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
		submitBtnElement.click();
		
		WebElement tagFeaturesItems = driver.findElement(By.tagName("h2"));
		String textTagH2 = tagFeaturesItems.getText();
		
		Assertions.assertTrue(textTagH2.equals("FEATURES ITEMS"));
	}

}
