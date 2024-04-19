package curs14;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class VisibileElements extends BaseTest {

	@Test(priority = 1)
	public void linkTestLocator() {
		
		WebElement booksLink = driver.findElement(By.linkText("Login"));
		assertTrue(booksLink.isDisplayed());
		WebElement name = driver.findElement(By.id("log"));
		assertFalse(name.isDisplayed());
		WebElement password = driver.findElement(By.id("password"));
		assertFalse(password.isDisplayed());
		booksLink.click();
		WebElement nameBox = driver.findElement(By.id("log"));
		assertTrue(nameBox.isDisplayed());
		WebElement passwordBox = driver.findElement(By.id("password"));
		assertTrue(passwordBox.isDisplayed());
}
}
