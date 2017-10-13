package co.simplon.recall;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExempleTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void helloWorld() {
		assertEquals("Hello World",Exemple.helloWorld(""));
		assertEquals("Hello Test",Exemple.helloWorld("Test"));
		assertEquals("Hello Test2",Exemple.helloWorld("Test2"));
	}
}
