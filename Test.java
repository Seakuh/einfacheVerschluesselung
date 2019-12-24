import java.util.Scanner;

public class Test {

	public static void auswahlfunktion() {

		int auswahl;
		int auswahlsprung;

		Scanner scauswahl = new Scanner(System.in);
		Scanner scauswahlsprung = new Scanner(System.in);

		System.out.println("1: Verschluesseln");
		System.out.println("2: Entschluesseln");

		auswahl = scauswahl.nextInt();
		
		System.out.println("Spruenge");
		
		auswahlsprung = scauswahlsprung.nextInt(); 

		ceasarverschluesselung(auswahl, auswahlsprung);
	}

	public static void ceasarverschluesselung(int auswahl, int k) {

		String eingabe = "";
		Scanner sc = new Scanner(System.in);

		if (auswahl == 1) {
			System.out.println("Geben Sie Ihre Eingabe ein: ");

			eingabe = sc.nextLine();

			String verschluesselt = "";

			for (int i = 0; i < eingabe.length(); i++) {
				verschluesselt += ((char) (eingabe.charAt(i) + k));

			}

			System.out.println("Verschluesselter Text: " + verschluesselt);
			
			auswahlfunktion();

		}

		else if (auswahl == 2) {
			System.out.println("Geben Sie Ihre Eingabe ein: ");
			eingabe = sc.nextLine();

			String entschluesselt = "";

			for (int i = 0; i < eingabe.length(); i++) {
				entschluesselt += ((char) (eingabe.charAt(i) - k));

			}
			
			System.out.println("Entschluesselter Text: " + entschluesselt);


			auswahlfunktion();

		} else {

			auswahlfunktion();
		}

	}

	public static void main(String[] args) {

		auswahlfunktion();

	}

}

