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
			System.out.println("Digite um n�mero: ");
			array[i] = input.nextInt();
			if (array[i] % 2 == 0) {
				somaPares += array[i];
				numerosPares.add(array[i]);
			} else {
				quantidadeImpares++;
				numerosImpares.add(array[i]);
			}
		}
		System.out.println("\nOs n�meros pares s�o: "+numerosPares.toString());
		System.out.println("E a sua soma � igual a: "+somaPares);
		System.out.println("A quantidade de n�meros pares digitados foi de: "+quantidadeImpares);
		System.out.println("E os n�meros �mpares s�o: "+numerosImpares.toString());
		
		input.close();
	}
}
