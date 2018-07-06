package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class finaltestTest {

	@Test
	public void test() {
	finaltest OfflineExercises = new finaltest();

	assertEquals(10, finaltest.OfflineExercises(10, 8));

	}
	
	@Test
	public void test2 () {
		
	finaltest doublechar = new finaltest();
	
	assertEquals ("jam", finaltest.doublechar ("breadjambread"));
	
	
	
	}
	
	@Test 
	public void test3 () {
		
		finaltest getSandwich = new finaltest();
		assertEquals ("true", finaltest.getSandwich (8,8,8));
		
		
	}
	
	@Test 
	public void test4() {
		
		finaltest evenlySpaced = new finaltest();
		assertEquals ("Helo" finaltest.evenlySpaced("Hello"));
	}
	
	@Test 
	public void test5 () {
		
		finaltest nTwice = new finaltest ();
		assertEquals ("true", finaltest.nTwice("oddly"));
		
	}
	
	@Test
	public void test6 () {
		
		finaltest endsly = new finaltest();
		assertEquals ("yza" finaltest.endsly ("yyzzza"));
		
	}
	

}
