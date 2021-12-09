//2- Faça um programa que entre com três números e coloque em ordem crescente.

package estruturasCondicionais;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc02v2OrdemCrescenteComLacoFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numero = new int[3];
		

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			numero[i] = input.nextInt();
			input.nextLine();
			
		}
		Arrays.sort(numero);
		System.out.print("Os números em ordem crescente são: ");
		for (int i = 0; i < 3; i++) {
		System.out.print(numero[i]+" ");
		}
	}
}
