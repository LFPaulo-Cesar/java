//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

package estruturasCondicionais;

import java.util.Scanner;

public class Exerc02v1NumeroEmOrdemCrescente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2, num3, numAux;

		System.out.println("Digite um n�mero: ");
		num1 = input.nextInt();
		input.nextLine();
		System.out.println("Digite um n�mero: ");
		num2 = input.nextInt();
		input.nextLine();
		if (num2 < num1) {
			numAux = num1;
			num1 = num2;
			num2 = numAux;
		}
		System.out.println("Digite um n�mero: ");
		num3 = input.nextInt();
		input.nextLine();
		if (num3 < num2 && num3 < num1) {
			numAux = num1;
			num1 = num3;
			num3 = numAux;
		}
		if (num3 < num2 && num3 > num1) {
			numAux = num2;
			num2 = num3;
			num3 = numAux;
		}
		if (num3 < num2 && num3 >= num1) {
			numAux = num2;
			num2 = num3;
			num3 = numAux;
		}
		System.out.println("Os n�meros digitados em ordem crescente ficar�o: "+num1+", "+num2+", "+num3+".");
	}
}
