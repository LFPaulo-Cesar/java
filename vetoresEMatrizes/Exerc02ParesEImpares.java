package vetoresEMatrizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc02ParesEImpares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[6];
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
		int somaPares = 0, quantidadeImpares = 0;

		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um número: ");
			array[i] = input.nextInt();
			if (array[i] % 2 == 0) {
				somaPares += array[i];
				numerosPares.add(array[i]);
			} else {
				quantidadeImpares++;
				numerosImpares.add(array[i]);
			}
		}
		System.out.println("\nOs números pares são: "+numerosPares.toString());
		System.out.println("E a sua soma é igual a: "+somaPares);
		System.out.println("A quantidade de números pares digitados foi de: "+quantidadeImpares);
		System.out.println("E os números ímpares são: "+numerosImpares.toString());
		
		input.close();
	}
}
