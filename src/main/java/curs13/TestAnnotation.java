package curs13;

import org.testng.annotations.Test;

@Test //daca adnotarea e pusa deasupra clasei, atunci nu functioneaza pt metodele private. Daca punem deasupra fiecarei metode, va functiona indif ca e public sau private
public class TestAnnotation {
	
	//@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	//@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@Test
	private void test3() {
		System.out.println("Test 3");
	}
}
