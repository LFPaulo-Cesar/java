package vetoresEMatrizes;

import java.util.Scanner;

public class Exerc04ManipulandoDuasMatrizes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matrizA = new int[2][2], matrizB = new int[2][2], matrizSoma = new int[2][2],
				matrizDiferenca = new int[2][2];
		int opcao = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Digite um número para compor a Matriz A: ");
				matrizA[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Digite um número para compor a Matriz B: ");
				matrizB[i][j] = input.nextInt();
				matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
				matrizDiferenca[i][j] = matrizB[i][j] - matrizA[i][j];
			}
		}
		while (opcao <= 0 || opcao >= 5) {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("Opção 1 - Soma da MatrizA com a MatrizB: ");
			System.out.println("Opção 2 - Subtrair a MatrizA da MatrizB: ");
			System.out.println("Opção 3 - Adicionar uma constante ás duas Matrizes: ");
			System.out.println("Opção 4 - Imprimir as Matrizes A e B: ");
			opcao = input.nextInt();
			if (opcao <= 0 || opcao >= 5) {
				System.out.println("Opção Inválida! Favor escolher entre uma das" + " opções do menu.");
			}
		}

		switch (opcao) {
		case 1:
			System.out.print("A soma das matrizes será igual a: ");
			for (int i = 0; i < 2; i++) {
				System.out.println();
				for (int j = 0; j < 2; j++) {
					if (matrizSoma[i][j] >= 0 && matrizSoma[i][j] <= 9) {
						System.out.print(" 0" + matrizSoma[i][j] + " ");
					} else {
						System.out.print(" " + matrizSoma[i][j] + " ");
					}
				}
			}
			break;
		case 2:
			System.out.println("A diferença das matrizes será igual a: ");
			for (int i = 0; i < 2; i++) {
				System.out.println();
				for (int j = 0; j < 2; j++) {
					if (matrizDiferenca[i][j] >= 0 && matrizDiferenca[i][j] <= 9) {
						System.out.print(" 0" + matrizDiferenca[i][j] + " ");
					} else {
						System.out.println(" " + matrizDiferenca[i][j] + " ");
					}
				}
			}
			break;
		case 3:
			int numero;
			System.out.println("Digite uma constante: ");
			numero = input.nextInt();
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizA[i][j] *= numero;
					matrizB[i][j] *= numero;
				}
			}
			System.out.print("Com a constante aplicada a Matriz A e B serâo: ");
			for (int i = 0; i < 2; i++) {
				System.out.println();
				for (int j = 0; j < 2; j++) {
					if (matrizA[i][j] >= 0 && matrizA[i][j] <= 9) {
						System.out.print(" 0" + matrizA[i][j] + " ");
					} else {
						System.out.print(" " + matrizA[i][j] + " ");
					}

				}
			}
			break;
		case 4:
			System.out.println("==== Matriz A ====");
			for (int i = 0; i < 2; i++) {
				System.out.println();
				for (int j = 0; j < 2; j++) {
					if (matrizA[i][j] >= 0 && matrizA[i][j] <= 9) {
						System.out.print(" 0" + matrizA[i][j] + " ");
					} else {
						System.out.println(matrizA[i][j] + " ");
					}
				}
			}
			System.out.println("\n\n==== Matriz B ====");
			for (int i = 0; i < 2; i++) {
				System.out.println();
				for (int j = 0; j < 2; j++) {
					if (matrizB[i][j] >= 0 && matrizB[i][j] <= 9) {
						System.out.print(" 0" + matrizB[i][j] + " ");
					} else {
						System.out.println(" " + matrizB[i][j] + " ");
					}
				}
			}
			break;
		default:
			System.out.println("Digite uma opção válida: ");
			opcao = input.nextInt();
			input.close();
		}
	}
}
