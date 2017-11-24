package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppRunnerTest {

	@Test
	public void testForResult() {
		String testString = "asdf23g";
		AppRunner num = new AppRunner();
		String outText = num.convertString(testString);
		assertEquals("gfds23a", outText); 
	
	}

}
