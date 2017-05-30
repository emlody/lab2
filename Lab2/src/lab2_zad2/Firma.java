/**
 * 
 */
package lab2_zad2;

/**
 * @author Piotr Rzezniczek 29322
 *
 *         Firma - klasa testowa, w której utworzysz kilka obiektów klasy
 *         Pracownik i wyœwietlisz dane na ekran.
 */
public class Firma {

	public static void main(String[] args) {
		String[] imiona = { "Marek", "Darek", "Jarek" };
		String[] nazwiska = { "Kowalski", "Nowak", "Spiewak" };
		int[] lata = { 55, 35, 65 };

		Pracownik pracownik[] = new Pracownik[3];
		for (int i = 0; i < imiona.length; i++) {
			pracownik[i] = new Pracownik(imiona[i], nazwiska[i], lata[i]);
			pracownik[i].wyswietl();
		}
		
		Pracownik pracownik1 = new Pracownik("Brudny");
		pracownik1.wyswietl();
		
		Pracownik pracownik2 = new Pracownik();
		pracownik2.wyswietl();
		
	}
}
