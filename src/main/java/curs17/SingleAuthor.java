package curs17;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class SingleAuthor extends BaseTest {
	
	@Test
	public void singleAuthor() throws InterruptedException {
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		driver.findElement(RelativeLocator.with(By.cssSelector("a[href='/margaret-robins/']"))).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement dramaScore = driver.findElement(By.cssSelector("div[class*='odd first in']>div[class*='sc_skills_count']>div[class='sc_skills_total']"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class*='odd first in']>div[class*='sc_skills_count']>div[class='sc_skills_total']"), "95%"));
		System.out.println(dramaScore.getText());
		assertTrue(dramaScore.getText().equals("95%"));
		
		WebElement biographyScore = driver.findElement(By.cssSelector("div[class*='even in']>div[class*='sc_skills_count']>div[class='sc_skills_total']"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class*='even in']>div[class*='sc_skills_count']>div[class='sc_skills_total']"), "75%"));
		System.out.println(biographyScore.getText());
		assertTrue(biographyScore.getText().equals("75%"));
		
		WebElement cookbooksScore = driver.findElement(By.cssSelector("div[class*='odd in']>div[class*='sc_skills_count']>div[class='sc_skills_total']"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class*='odd in']>div[class*='sc_skills_count']>div[class='sc_skills_total']"), "82%"));
		System.out.println(cookbooksScore.getText());
		assertTrue(cookbooksScore.getText().equals("82%"));
		
	}

}