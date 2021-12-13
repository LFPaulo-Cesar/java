package vetoresEMatrizes;

import java.util.Scanner;

public class Exerc03numerosMaioresQueDez {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int numerosMaioresQueDez = 0;
		
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3;j++){
				System.out.println("Digite um número: ");
				matriz[i][j] = input.nextInt();
				if(matriz[i][j] > 10) {
					numerosMaioresQueDez++;
				}
			}
		}
		System.out.println("\nA quantidade de números maiores que dez digitada foi de: "
		+numerosMaioresQueDez+" números.");
		//conte e escreva quantos valores maiores que 10 ela possui.
		//eu interpretei que o enunciado pede apenas a quantidade de números maiores que 10 e 
		//não os números em si.
		input.close();
	}
}
