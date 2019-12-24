package cre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasarVerschluesselungTest {

	@Test
	void testRichtigVerschluesselt() {
		String eingabe = "Hallo";
		int spruenge = 3;
		String testVerschluesselung = CaesarMain.verschluesseln(eingabe, spruenge);

		assertEquals("Kdoor", testVerschluesselung);

	}

	@Test
	void testRichtigEntschluesselt() {
		String eingabe = "73%Xythp";
		int spruenge = 5;
		String testEntschluesselung = CaesarMain.entschluesseln(eingabe, spruenge);
		
		assertEquals("2. Stock",testEntschluesselung);

		
	}

}
