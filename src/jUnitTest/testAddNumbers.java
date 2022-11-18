package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		Lab10 junit = new Lab10();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}