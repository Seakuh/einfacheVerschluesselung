package cre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasarVerschluesselungTest {

	@Test
	void testRichtigVerschluesselt()
	{
		String eingabe = "Hallo";
		int spruenge = 3;
		String testVerschluesselung = CaesarMain.verschluesseln(eingabe, spruenge);
		
		assertEquals("Kdoor", testVerschluesselung);
		
	}

}
