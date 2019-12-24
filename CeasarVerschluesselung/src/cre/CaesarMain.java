package cre;

import java.util.Scanner;

public class CaesarMain {

	static String ergebnisVerschluesselt = "";
	static String ergebnisEntchluesselt = "";

	public static String getErgebnisVerschluesselt() {
		return ergebnisVerschluesselt;
	}

	public static void setErgebnisVerschluesselt(String ergebnisVerschluesselt) {
		CaesarMain.ergebnisVerschluesselt = ergebnisVerschluesselt;
	}

	public static String getErgebnisEntchluesselt() {
		return ergebnisEntchluesselt;
	}

	public static void setErgebnisEntchluesselt(String ergebnisEntchluesselt) {
		CaesarMain.ergebnisEntchluesselt = ergebnisEntchluesselt;
	}

	public static void auswahlfunktion() {

		int auswahl;
		int auswahlsprung;

		Scanner scauswahl = new Scanner(System.in);
		Scanner scauswahlsprung = new Scanner(System.in);

		System.out.println("1: Verschluesseln");
		System.out.println("2: Entschluesseln");

		auswahl = scauswahl.nextInt();

		System.out.println("Wie viele Spruenge?");

		auswahlsprung = scauswahlsprung.nextInt();

		ceasarverschluesselung(auswahl, auswahlsprung);
	}

	public static void ceasarverschluesselung(int auswahl, int k) {

		String eingabe = "";
		Scanner sc = new Scanner(System.in);

		if (auswahl == 1) {
			System.out.println("Geben Sie Ihre Eingabe ein: ");

			eingabe = sc.nextLine();

			ergebnisVerschluesselt = verschluesseln(eingabe, k);

			auswahlfunktion();

		}

		else if (auswahl == 2) {
			System.out.println("Geben Sie Ihre Eingabe ein: ");
			eingabe = sc.nextLine();

			ergebnisEntchluesselt = entschluesseln(eingabe, k);

			auswahlfunktion();

		} else {

			auswahlfunktion();
		}

	}

	public static String testCV(String verschl, int x) {

		return "";
	}

	public static String verschluesseln(String eingabe, int k) {

		String verschluesselt = "";

		for (int i = 0; i < eingabe.length(); i++) {
			verschluesselt += ((char) (eingabe.charAt(i) + k));
		}

		ergebnisVerschluesselt = verschluesselt;
		System.out.println("Verschluesselter Text: " + verschluesselt);

		return verschluesselt;

	}

	public static String entschluesseln(String eingabe, int k) {
		
		String entschluesselt = "";
		
		for (int i = 0; i < eingabe.length(); i++) {
			entschluesselt += ((char) (eingabe.charAt(i) - k));

		}
		ergebnisEntchluesselt = entschluesselt;
		System.out.println("Entschluesselter Text: " + entschluesselt);

		return ergebnisEntchluesselt;
	}

	public static void main(String[] args) {

		auswahlfunktion();

	}

}
