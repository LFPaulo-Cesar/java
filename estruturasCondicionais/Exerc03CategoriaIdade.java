/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra: 10-14 infantil; 15-17 juvenil; 18-25 adulto*/

package estruturasCondicionais;

import java.util.Scanner;

public class Exerc03CategoriaIdade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int idade;

		System.out.println("Digite a idade: ");
		idade = input.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nA categoria para idade de " + idade + " anos é: INFANTIL.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nA categoria para idade de " + idade + " anos é: JUVENIL.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("\nA categoria para idade de " + idade + " anos é: ADULTO.");
		} else {
			System.out.println("\nIdade inválida! Favor informe uma idade válida.");
		}
		input.close();
	}
}
