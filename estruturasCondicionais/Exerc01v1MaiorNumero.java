/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

package estruturasCondicionais;

import java.util.Scanner;

public class Exerc01v1MaiorNumero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2, num3, maiorNumero;

		System.out.println("Digite um n�mero: ");
		num1 = input.nextInt();
		maiorNumero = num1;
		input.nextLine();
		System.out.println("Digite um n�mero: ");
		num2 = input.nextInt();
		input.nextLine();
		if (num2 > maiorNumero) {
			maiorNumero = num2;
		}
		System.out.println("Digite um n�mero: ");
		num3 = input.nextInt();
		input.nextLine();
		if (num3 > maiorNumero) {
			maiorNumero = num3;
		}
		System.out.println(maiorNumero);
		input.close();
	}
}
