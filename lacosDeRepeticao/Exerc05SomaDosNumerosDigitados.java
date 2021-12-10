/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

package lacosDeRepeticao;

import java.util.Scanner;

public class Exerc05SomaDosNumerosDigitados {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0, soma = 0;

		do {
			System.out.println("Digite um n�mero: ");
			numero = input.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("\nA soma dos n�meros digitados �: " + soma);

		input.close();
	}
}
