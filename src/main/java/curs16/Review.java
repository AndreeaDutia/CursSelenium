package curs16;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class Review extends BaseTest {
	
	@Test
	public void Review() throws InterruptedException {
		
		driver.findElement(By.cssSelector("a[href^='life']")).click();
				
		driver.findElement(By.cssSelector("a[href^='#tab-review']")).click();
				
		Actions  action = new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		
		driver.findElement(By.cssSelector("input[type='submit'][id='submit']")).click();
				
			
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
				
		driver.findElement(By.cssSelector("a[class='star-3']")).click();
		
		driver.findElement(By.cssSelector("textarea[id='comment']")).sendKeys("Comentariu");
		
		driver.findElement(By.cssSelector("input[id='author']")).sendKeys("Ion");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("john@test.com");
		
		driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']")).click();
		
		Thread.sleep(5000);
		
					
		driver.findElement(By.cssSelector("input[id='submit']")).click();
		
		action.scrollByAmount(0, -500).perform();
		
		WebElement reviewMessage = driver.findElement(By.cssSelector("em[class='woocommerce-review__awaiting-approval']"));
		System.out.println(reviewMessage.getText());
		assertTrue(reviewMessage.getText().equals("Your review is awaiting approval"));
		
	}

}
