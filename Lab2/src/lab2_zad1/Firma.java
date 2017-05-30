/**
 * 
 */
package lab2_zad1;

/**
 * @author Piotr Rzezniczek 29322
 *
 *         Firma - klasa, w której utworzysz 3 obiekty reprezentuj¹ce
 *         pracowników, a nastêpnie wyœwietlisz informacjê o nich na ekranie
 */
public class Firma {

	public static void main(String[] args) {

		Pracownik pracownik1 = new Pracownik();
		Pracownik pracownik2 = new Pracownik();
		Pracownik pracownik3 = new Pracownik();

		pracownik1.imie = "Janek";
		pracownik1.nazwisko = "Kowalski";
		pracownik1.rokUrodzenia = 1977;
		pracownik1.stazPracy = 5;

		pracownik2.imie = "Marian";
		pracownik2.nazwisko = "Bykowski";
		pracownik2.rokUrodzenia = 1959;
		pracownik2.stazPracy = 15;

		pracownik3.imie = "Tadeusz";
		pracownik3.nazwisko = "Zarobiony";
		pracownik3.rokUrodzenia = 1966;
		pracownik3.stazPracy = 19;

		System.out.println("Pracownicy: \n");
		System.out.println(String.format("%-8s%-14s%-6s%-5s","Imiê","Nazwisko","Rok","Sta¿"+"\n"));
		System.out.println(String.format("%-8s%-12s",pracownik1.imie,pracownik1.nazwisko)+" "+pracownik1.rokUrodzenia+"    "+pracownik1.stazPracy);
		System.out.println(String.format("%-8s%-12s",pracownik2.imie,pracownik2.nazwisko)+" "+pracownik2.rokUrodzenia+"    "+pracownik2.stazPracy);
		System.out.println(String.format("%-8s%-12s",pracownik3.imie,pracownik3.nazwisko)+" "+pracownik3.rokUrodzenia+"    "+pracownik3.stazPracy);
		
	}


}
