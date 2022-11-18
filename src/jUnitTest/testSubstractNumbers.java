 package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSubstractNumbers {

	@Test
	public void test() {
		Lab10	 junit = new Lab10();
		String result = junit.AddStrings("Hello", " World");
		assertEquals("Hello World",result);
	}

}