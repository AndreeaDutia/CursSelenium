package curs13;

import org.testng.annotations.Test;

//TestNG ruleaza metodele in ordine alfabetica. De aceea, mai jos nu va rula one - two - three ci one - three - two
//putem decide ordinea rularii adaugand adnotorii @Test, un parametru. Daca avem 2 cu aceeasi prioritate, le ruleza alfabetic
//daca avem metode cu priority in interiorul unei clase, e bine sa le dam priority la toate. In caz contrar, se vor rula intai cele fara priority

public class TestPriority {
	
	@Test(priority = 1)
	public void one() {
		System.out.println("First");
	}
	
	@Test(priority = 2)
	public void two() {
		System.out.println("Second");
	}
	
	@Test(priority = 3)
	public void three() {
		System.out.println("Third");
	}
	
	@Test
	public void four() {
		System.out.println("Fourth");
	}
	
	@Test
	public void five() {
		System.out.println("Fifth");
	}

}
