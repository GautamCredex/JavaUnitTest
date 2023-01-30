package codeTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodeUnit {

	@Test
	public void test() {
		UnitTest obj1 = new UnitTest();
		int output = obj1.WordCount("Aaditya");
		assertEquals(3,output);
	}

}
