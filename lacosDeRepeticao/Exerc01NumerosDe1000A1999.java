/*1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.*/

package lacosDeRepeticao;

public class Exerc01NumerosDe1000A1999 {
	public static void main(String[] args) {

		System.out.println("Os n�meros de 1000 a 1999, que quando divididos por 11 obtemos o resto igual a 5 s�o: ");
		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}