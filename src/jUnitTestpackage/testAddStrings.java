package jUnitTestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	
	@Test
	public void test() {
		jUnitfunctions junitstring = new jUnitfunctions();
		String result = junitstring.addStrings("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
