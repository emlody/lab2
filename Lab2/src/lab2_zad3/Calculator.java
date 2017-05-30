/**
 * 
 */
package lab2_zad3;

/**
 * @author Piotr Rzezniczek
 * 
 *         W klasie Calculator zdefiniuj metody add i subtract w kilku
 *         przeci¹¿onych wersjach, aby mog³y dodawaæ lub odejmowaæ 2 lub 3
 *         liczby (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.
 */
public class Calculator {

	double add(double a, double b, double c) {
		double suma = a + b + c;
		return suma;
	}

	double add(double a, double b) {
		double suma = a + b;
		return suma;
	}

	double subtract(double a, double b, double c) {
		double roznica = a - b - c;
		return roznica;
	}

	double subtract(double a, double b) {
		double roznica = a - b;
		return roznica;
	}

}
