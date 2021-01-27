package StringMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpinWordsTest {

	@Test
	void test() {

		assertEquals("yeH wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
		assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
		assertEquals("yo yo yo this is kinda boring", new SpinWords().spinWords("oy oy oy siht si adnik gnirob"));
	}

}
