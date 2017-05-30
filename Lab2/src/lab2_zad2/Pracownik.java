/**
 * 
 */
package lab2_zad2;

/**
 * @author Piotr Rzezniczek 29322
 * 
 *         Pracownik - przechowuj¹ca takie dane jak imiê, nazwisko i wiek
 *         pracownika, oraz co najmniej trzy konstruktory, które pos³u¿¹ do
 *         inicjowania obiektów z ró¿nymi parametrami - w przypadku gdy
 *         przyk³adowo konstruktor przyjmuje tylko 1 parametr, zainicjuj
 *         pozosta³e pola jakimiœ domyœlnymi wartoœciami.
 */
public class Pracownik {

	String imie;
	String nazwisko;
	int wiek;

	public Pracownik(Pracownik pracownik) {
		imie = pracownik.imie;
		nazwisko = pracownik.nazwisko;
		wiek = pracownik.wiek;
	}

	public Pracownik(String n, String s, int a) {
		imie = n;
		nazwisko = s;
		wiek = a;
	}

	public Pracownik(String n) {
		imie = "brak";
		nazwisko = n;
		wiek = -1;
	}

	public Pracownik() {
		imie = "brak";
		nazwisko = "brak";
		wiek = -1;
	}

	void wyswietl() {
		System.out.println(imie + " " + nazwisko + " " + wiek);
	}

}
