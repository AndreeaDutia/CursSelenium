package curs15;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class ContactsCss extends BaseTest {

	@Test
	public void cssContact() throws InterruptedException {
		
		WebElement ContactMenu = driver.findElement(By.cssSelector("a[href*='contact']"));
		ContactMenu.click();
		
		Actions  action = new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		
		WebElement nameField = driver.findElement(By.cssSelector("input[name='your-name']"));
		nameField.sendKeys("Test nume");
		
		WebElement mailField = driver.findElement(By.cssSelector("input[name='your-email']"));
		mailField.sendKeys("test@email.ro");
		
		WebElement subjectField = driver.findElement(By.cssSelector("input[name='your-s']"));
		subjectField.sendKeys("Test subject");
		
		WebElement messageField = driver.findElement(By.cssSelector("textarea[name=\"your-message\"]"));
		messageField.sendKeys("Test message");
		
		
		WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit'][value='send-message'],[class='wpcf7-form-control wpcf7-submit']"));
		submitButton.click();
		
		Thread.sleep(5000);
		
		WebElement thanksMessage = driver.findElement(By.cssSelector("div[class~='wpcf7-response-output']"));
		System.out.println(thanksMessage.getText());
		assertTrue(thanksMessage.getText().equals("Thank you for your message. It has been sent."));
	}

}

