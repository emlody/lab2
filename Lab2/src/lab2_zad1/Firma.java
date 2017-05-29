/**
 * 
 */
package lab2_zad1;

/**
 * @author Piotr Rzezniczek 29322
 *
 */
public class Firma {
		

	public static void main(String[] args) {

		Pracownik pracownik1 = new Pracownik();
		Pracownik pracownik2 = new Pracownik();
		Pracownik pracownik3 = new Pracownik();
		
		pracownik1.imie = "Janek" ;
		pracownik1.nazwisko = "Kowalski" ;
		pracownik1.rokUrodzenia = 1977 ;
		pracownik1.stazPracy = 5;
		
		pracownik2.imie = "Marian" ;
		pracownik2.nazwisko = "Bykowski" ;
		pracownik2.rokUrodzenia = 1959 ;
		pracownik2.stazPracy = 15;
		
		pracownik3.imie = "Tadeusz" ;
		pracownik3.nazwisko = "Zarobiony" ;
		pracownik3.rokUrodzenia = 1966 ;
		pracownik3.stazPracy = 19;
		
	}

}
