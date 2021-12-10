/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

package lacosDeRepeticao;

import java.util.Scanner;

public class Exerc03SensoIdade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int idade = 0, contadorIdadeMenor21 = 0, contadorIdadeMaior50 = 0;

		while (idade != -99) {
			System.out.println("Digite a sua idade: ");
			idade = input.nextInt();
			if(idade < 21 && idade != -99) {
				contadorIdadeMenor21++;
			}else if(idade > 50) {
				contadorIdadeMaior50++;
			}
		}
		System.out.println("menor que 21: "+contadorIdadeMenor21);
		System.out.println("maior que 50: "+contadorIdadeMaior50);
		
		input.close();
	}
}
