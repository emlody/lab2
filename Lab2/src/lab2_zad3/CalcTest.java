/**
 * 
 */
package lab2_zad3;

/**
 * @author Piotr Rzezniczek
 * 
 *         W klasie CalcTest przetestuj dzia³anie klasy Calculator.
 */
public class CalcTest {

	public static void main(String[] args) {

		 Calculator kalkulator = new Calculator();
		 
		 System.out.println(kalkulator.add(3.4, 2.6));
		 System.out.println(kalkulator.add(3.4, 2.6, 5.7));
		 System.out.println(kalkulator.subtract(3.4, 2.6, 5.7));
		 System.out.println(kalkulator.subtract(3.4, 2.4));

	}
}
