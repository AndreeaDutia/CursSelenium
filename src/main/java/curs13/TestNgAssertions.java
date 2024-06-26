package curs13;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssertions {
	
	//1. SoftAssertion
	//2. HardAssertion
	
//	@Test
	public void HardAssertExample() {
		System.out.println("Metoda hard assert incepe aici!");
		
		assertEquals(100, 20);
		System.out.println("Metoda hard assert continua aici!");
		
		assertFalse(true);
		System.out.println("Metoda hard assert se inchide aici!");
	}
	
	@Test
	public void SoftAssertExample() {
System.out.println("Metoda hard assert incepe aici!");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(100, 20);
		
		System.out.println("Metoda hard assert continua aici!");
		
		sa.assertFalse(true);
		System.out.println("Metoda hard assert se inchide aici!");
		sa.assertAll();
	}

}
