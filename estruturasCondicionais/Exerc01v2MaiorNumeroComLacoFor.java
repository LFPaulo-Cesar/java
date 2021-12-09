/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package estruturasCondicionais;

import java.util.Scanner;

public class Exerc01v2MaiorNumeroComLacoFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numero = new int[3];
		int numeroMaior = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			numero[i] = input.nextInt();
			numeroMaior = numero[i];
			input.nextLine();
			if (numero[i] > numeroMaior) {
				numeroMaior = numero[i];
			}
		}
		System.out.println("O maior número digitado foi: "+numeroMaior);
	}
}
