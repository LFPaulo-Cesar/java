/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

package estruturasCondicionais;

import java.util.Scanner;

public class Exerc01v2MaiorNumeroComLacoFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numero = new int[3];
		int numeroMaior = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um n�mero: ");
			numero[i] = input.nextInt();
			numeroMaior = numero[i];
			input.nextLine();
			if (numero[i] > numeroMaior) {
				numeroMaior = numero[i];
			}
		}
		System.out.println("O maior n�mero digitado foi: "+numeroMaior);
	}
}
